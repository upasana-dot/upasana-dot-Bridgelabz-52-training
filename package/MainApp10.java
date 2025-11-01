package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;

public class MainApp10 {
    public static void main(String[] args) {
        Student s = new Student10();
        Faculty f = new Faculty10();
        Department d = new Department();

        System.out.println("===== COLLEGE INFORMATION =====");
        s.display();
        f.display();
        d.display();
    }
}
