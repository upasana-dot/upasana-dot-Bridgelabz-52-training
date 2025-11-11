package map;
import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        // Map<String, Map<String, Integer>>
        // subject → (student name → marks)
        Map<String, Map<String, Integer>> examResults = new HashMap<>();

        // 1️⃣ Add data for subjects and students
        examResults.put("Maths", new HashMap<>());
        examResults.put("Science", new HashMap<>());
        examResults.put("English", new HashMap<>());

        examResults.get("Maths").put("Aman", 85);
        examResults.get("Maths").put("Riya", 92);
        examResults.get("Maths").put("Kunal", 76);

        examResults.get("Science").put("Aman", 88);
        examResults.get("Science").put("Riya", 95);
        examResults.get("Science").put("Meena", 91);

        examResults.get("English").put("Aman", 78);
        examResults.get("English").put("Riya", 82);
        examResults.get("English").put("Meena", 89);

        // 2️⃣ Find topper per subject
        System.out.println("Topper per Subject:");
        for (String subject : examResults.keySet()) {
            Map<String, Integer> subjectMarks = examResults.get(subject);
            String topper = null;
            int maxMarks = -1;

            for (Map.Entry<String, Integer> entry : subjectMarks.entrySet()) {
                if (entry.getValue() > maxMarks) {
                    maxMarks = entry.getValue();
                    topper = entry.getKey();
                }
            }
            System.out.println(subject + " → " + topper + " (" + maxMarks + ")");
        }

        // 3️⃣ Average score per subject
        System.out.println("\nAverage Marks per Subject:");
        for (String subject : examResults.keySet()) {
            Map<String, Integer> marks = examResults.get(subject);
            double total = 0;
            for (int m : marks.values()) total += m;
            double avg = total / marks.size();
            System.out.printf("%s → %.2f%n", subject, avg);
        }

        // 4️⃣ Subjects where any student scored above 90
        System.out.println("\nSubjects with at least one score > 90:");
        for (String subject : examResults.keySet()) {
            Map<String, Integer> marks = examResults.get(subject);
            boolean hasAbove90 = marks.values().stream().anyMatch(v -> v > 90);
            if (hasAbove90) System.out.println(subject);
        }
    }
}
