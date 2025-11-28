package com.collections.implementations;

import java.util.Objects;

public class Employee {
    private int empid;
    private String ename;
    private double salary;
    private String job;

    public Employee(int empid, String ename, double salary, String job) {
        this.empid = empid;
        this.ename = ename;
        this.salary = salary;
        this.job = job;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return empid == employee.empid && Double.compare(salary, employee.salary) == 0 && Objects.equals(ename, employee.ename) && Objects.equals(job, employee.job);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(empid, ename, salary, job);
//    }

    @Override
    public boolean equals(Object o) {
        boolean res = false;
        if (this.empid == getEmpid()) {
            res = empid == getEmpid();
        }
        return res;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid);
    }
}
