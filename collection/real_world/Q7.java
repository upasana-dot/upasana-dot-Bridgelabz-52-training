package collection.real_world;
import java.util.*;

class Student {
    String name;
    double marks;

    Student(String name, double marks) { this.name = name; this.marks = marks; }
    @Override
    public String toString() { return name + " (" + marks + ")"; }
}

public class Q7{
    public static void main(String[] args) {
        List<Student> applicants = List.of(
                new Student("A", 88), new Student("B", 65), new Student("C", 92)
        );

        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> interviewQueue = new LinkedList<>();
        TreeSet<Student> meritList = new TreeSet<>((a,b) -> Double.compare(b.marks,a.marks));

        for (Student s : applicants)
            if (s.marks > 70) { shortlisted.add(s); interviewQueue.offer(s); }

        while (!interviewQueue.isEmpty())
            meritList.add(interviewQueue.poll());

        System.out.println("🎓 Final Merit List: " + meritList);
    }
}
