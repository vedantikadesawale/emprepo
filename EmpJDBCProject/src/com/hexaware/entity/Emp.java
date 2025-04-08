package com.hexaware.entity;

public class Emp {

    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Emp(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Default Constructor
    public Emp() {
    }

    // Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString Method
    @Override
    public String toString() {
        return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
    }
}
