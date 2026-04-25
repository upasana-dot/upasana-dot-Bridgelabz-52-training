class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;

    final int rollNumber;
    String name, grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Roll No: " + rollNumber + 
                               ", Name: " + name + 
                               ", Grade: " + grade +
                               ", University: " + universityName);
        }
    }
}

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 101, "A");
        Student s2 = new Student("Priya", 102, "B");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}
