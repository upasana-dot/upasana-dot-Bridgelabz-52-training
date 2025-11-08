package Question_10.main;
import static java.lang.System.out;
import Question_10.student.Student;
import Question_10.faculty.Faculty;
import Question_10.department.Department;

public class MainApp10 {
    public static void main(String[] args) {
        out.println("--- College Management System ---");
        new Student().showStudent();
        new Faculty().showFaculty();
        new Department().showDepartment();
    }
}
