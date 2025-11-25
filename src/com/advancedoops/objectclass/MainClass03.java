package com.advancedoops.objectclass;

class Employee extends Object{
    private int empid;
    private String ename;
    private double salary;
    private int deptno;

    //Setter Methods
    public void setempID(int empid){
        this.empid = empid;
    }

    public void setename(String ename){
        this.ename = ename;
    }

    public void setsalary(double salary){
        this.salary = salary;
    }

    public void setdeptno(int deptno){
        this.deptno = deptno;
    }

    //Getter Methods
    public int getempID(){
        return this.empid;
    }

    public String getename(){
        return this.ename;
    }

    public double getsalary(){
        return this.salary;
    }

    public int getdeptno(){
        return this.deptno;
    }
    @Override
    public int hashCode(){
        return this.empid = empid;
    }

    @Override
    public String toString() {
        return "EmpID: "+getempID()+", Employee Name: "+getename()+", Salary: "+getsalary()+", DeptNO: "+getdeptno();
    }

    @Override
    public boolean equals(Object obj){
        Employee emp = (Employee) obj;
        return emp.empid == this.empid;
    }
}

public class MainClass03 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setempID(101);
        emp1.setename("Employee1");
        emp1.setsalary(10000.0);
        emp1.setdeptno(10);
        System.out.println();

        Employee emp2 = new Employee();
        emp2.setempID(102);
        emp2.setename("Employee2");
        emp2.setsalary(15000.0);
        emp2.setdeptno(30);

        int h1 = emp1.hashCode();
        System.out.println("h1: "+h1);

        String str1 = emp1.toString();
        System.out.println("Details: "+str1);

        String str2 = emp2.toString();
        System.out.println("Details: "+str2);

        boolean b1 = emp1.equals(emp2);
        System.out.println("b1: "+b1);

//        boolean b2 = emp1.equals(emp3);
//        System.out.println("b2 "+b2);
    }
}