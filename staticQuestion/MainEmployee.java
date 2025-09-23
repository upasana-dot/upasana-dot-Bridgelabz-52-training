class Employee {
    static String companyName = "TechCorp Pvt Ltd";
    static int totalEmployees = 0;

    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("ID: " + id + ", Name: " + name +
                               ", Designation: " + designation +
                               ", Company: " + companyName);
        }
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 201, "Manager");
        Employee e2 = new Employee("Sara", 202, "Developer");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}
