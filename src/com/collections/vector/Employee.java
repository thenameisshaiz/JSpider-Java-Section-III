package com.collections.vector;

public class Employee {
    private int empID;
    private String ename;
    private double salary;
    private String designation;

    public Employee(int empID, String ename, double salary, String designation) {
        this.empID = empID;
        this.ename = ename;
        this.salary = salary;
        this.designation = designation;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "EmpID: "+this.empID+", EmpName: "+this.ename+" Salary: "+this.salary+" Designation: "+this.designation;
    }
}
