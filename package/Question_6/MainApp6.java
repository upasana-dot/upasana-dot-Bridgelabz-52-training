package com.company.main;
import com.company.hr.Employee;
import com.company.payroll.Payroll;

public class MainApp6 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Upasana", "AI", 50000);
        Payroll p = new Payroll();
        p.calculateBonus(emp);
        System.out.println(emp.getName() + " new salary: " + emp.getSalary());
    }
}
