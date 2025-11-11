package map;
import java.util.*;

class Employee {
    String name, dept;
    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"));

        Map<String, List<Employee>> deptMap = new HashMap<>();
        for (Employee e : employees) {
            deptMap.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e);
        }

        deptMap.forEach((dept, list) -> {
            System.out.print(dept + ": ");
            list.forEach(emp -> System.out.print(emp.name + " "));
            System.out.println();
        });
    }
}

