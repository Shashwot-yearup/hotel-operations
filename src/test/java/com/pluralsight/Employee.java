package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWork;

    //
    public Employee(String name, String department, double payRate, double hoursWork) {
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWork = hoursWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(double hoursWork) {
        this.hoursWork = hoursWork;
    }

    //derived
    public double getTotalPay(){
        return  payRate * getRegularHours() +
                (getOvertimeHours() * payRate * 1.5);
    }

    public double getRegularHours(){
        if (hoursWork > 40) {
            return 40;
        }
        else {
            return  hoursWork;
        }
    }

    public double getOvertimeHours(){
        if (hoursWork > 40) {
            return hoursWork - 40;
        }
        else {
            return 0;
        }
    }
    // Display employee information
    public void displayEmployeeInfo() {

        System.out.println("Employee Information");
        System.out.println("--------------------");
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Pay Rate: $" + getPayRate());
        System.out.println("Hours Worked: " + getHoursWork());

        // Display payroll information
        System.out.println("\nPayroll Information");
        System.out.println("-------------------");
        System.out.println("Regular Hours: " + getRegularHours());
        System.out.println("Overtime Hours: " + getOvertimeHours());
        System.out.printf("Total Pay: $%.2f%n", getTotalPay());
    }
}
