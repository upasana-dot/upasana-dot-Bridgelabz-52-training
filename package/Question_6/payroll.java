package com.company.payroll;
import com.company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e) {
        double newSalary = e.getSalary() + (0.10 * e.getSalary());
        e.setSalary(newSalary);
    }
}

