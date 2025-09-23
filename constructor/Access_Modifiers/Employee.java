package Access_Modifiers;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method for private salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String role;

    Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Role: " + role + ", Salary: " + getSalary());
    }

    public static void main(String[] args) {
        Manager m = new Manager(1, "IT", 75000, "Team Lead");
        m.displayDetails();
        m.setSalary(80000);
        m.displayDetails();
    }
}
