import Question1_.student.Student;
import Question_1.faculty.Faculty;

public class MainApp1 {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();

        s.displayStudentDetails("Upasana", 101);
        f.displayFacultyDetails("Dr. Mehta", "Artificial Intelligence");
    }
}
