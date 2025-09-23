package instance;
class Course {
    // Instance variables
    String courseName;
    int duration;  // in months
    double fee;

    // Class variable
    static String instituteName = "GLA University";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Data Science", 12, 40000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("IIT Delhi");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

