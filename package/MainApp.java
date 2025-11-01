import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("Upasana", 101);
        Faculty f1 = new Faculty("Dr. Mehta", "AI & ML");

        s1.display();
        f1.display();
    }
}
