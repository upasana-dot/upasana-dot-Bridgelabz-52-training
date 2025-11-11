package map;
import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        // HashMap<Integer, String> → key = employee ID, value = department name
        Map<Integer, String> empDept = new HashMap<>();

        // 1️⃣ Add multiple employees
        empDept.put(101, "HR");
        empDept.put(102, "Finance");
        empDept.put(103, "IT");
        empDept.put(104, "IT");
        empDept.put(105, "Marketing");
        empDept.put(106, "Finance");

        System.out.println("Initial Employee → Department Mapping:");
        empDept.forEach((id, dept) -> System.out.println(id + " → " + dept));

        // 2️⃣ Change department of an employee (update)
        int empIdToChange = 104;
        empDept.put(empIdToChange, "Data Science");
        System.out.println("\nAfter department change for ID " + empIdToChange + ":");
        empDept.forEach((id, dept) -> System.out.println(id + " → " + dept));

        // 3️⃣ Find all employees in a given department
        String searchDept = "Finance";
        System.out.println("\nEmployees in department: " + searchDept);
        for (Map.Entry<Integer, String> e : empDept.entrySet()) {
            if (e.getValue().equalsIgnoreCase(searchDept)) {
                System.out.println("Employee ID: " + e.getKey());
            }
        }

        // 4️⃣ Print total employees per department
        Map<String, Integer> deptCount = new HashMap<>();
        for (String dept : empDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nTotal Employees per Department:");
        deptCount.forEach((dept, count) -> System.out.println(dept + " → " + count));
    }
}
