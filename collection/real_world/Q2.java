package collection.real_world;
import java.util.*;

// Model Classes
class Question {
    int id;
    String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Q" + id + ": " + text;
    }
}

class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + studentId + ")";
    }
}

public class Q2 {
    public static void main(String[] args) {
        // 1️⃣ List - Store Questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1, "What is Java?"));
        questions.add(new Question(2, "Explain OOP concepts."));
        questions.add(new Question(3, "What is a constructor?"));

        // Shuffle questions for randomization
        Collections.shuffle(questions);
        System.out.println("📘 Randomized Question Set:");
        for (Question q : questions) System.out.println(q);

        // 2️⃣ Set - Unique Student IDs
        Set<String> studentIDs = new HashSet<>();
        studentIDs.add("STU001");
        studentIDs.add("STU002");
        studentIDs.add("STU001"); // duplicate

        System.out.println("\n🧑‍🎓 Registered Students: " + studentIDs);

        // 3️⃣ Queue - Students waiting to take the exam
        Queue<Student> examQueue = new LinkedList<>();
        examQueue.offer(new Student("STU001", "Alice"));
        examQueue.offer(new Student("STU002", "Bob"));

        System.out.println("\n🕐 Exam Queue:");
        for (Student s : examQueue) System.out.println(s);

        // 4️⃣ Stack - Navigating between questions
        System.out.println("\n🧭 Navigating Questions for " + examQueue.peek().name);
        Stack<Question> questionStack = new Stack<>();

        // Simulate answering
        for (Question q : questions) {
            System.out.println("Answering: " + q);
            questionStack.push(q);
        }

        // Student goes back to review previous question
        System.out.println("\n🔙 Student navigates back:");
        if (!questionStack.isEmpty()) {
            Question prev = questionStack.pop();
            System.out.println("Reviewing: " + prev);
        }

        // Serving next student
        System.out.println("\n " + examQueue.poll().name + " finished exam!");
        System.out.println("Next in queue: " + examQueue.peek());
    }
}
