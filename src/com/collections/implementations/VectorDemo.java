package com.collections.implementations;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
    static Vector<Employee> v1 = new Vector<>();
//    Adding the employee details
    public static void addEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee ID: ");
        int empID = sc.nextInt();
        System.out.print("Enter the employee name: ");
        String name = sc.next();
        System.out.print("Enter the employee salary: ");
        double salary = sc.nextInt();
        System.out.print("Enter the employee job: ");
        String job = sc.next();

        Employee e1 = new Employee(empID, name, salary, job);

        v1.add(e1);
        System.out.println("Employee added Successfully !!!");
    }

//    Displaying the details of the employee
    public static void showAllEmpDetails(){
        for(Employee emp : v1){
            System.out.println(emp);
        }
    }

//    Show the details of an employee
//    Delete the employee details

    public static void showTheDetailsofEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee ID: ");
        int empID = sc.nextInt();
        v1.contains(empID);

    }
    public static void removeTheEmployee(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{

            System.out.println("1. To add employee details");
            System.out.println("2. To show All the employee details");
            System.out.println("3. To show the details of the employee");
            System.out.println("0. To EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 : addEmployeeDetails();
                        break;
                case 2 : showAllEmpDetails();
                        break;
                case 3 : showTheDetailsofEmployee();
                        break;
            }
        }while(choice!=0);
    }
}
