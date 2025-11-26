package com.collections.implementations;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    static ArrayList<Employee> ar1 = new ArrayList<>();

//    Adding the details of the employee
    synchronized public static void addTheDetailsOfEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adding the Employee Details");
        System.out.print("Enter the Emp. ID: ");
        int empid = sc.nextInt();
        System.out.print("Enter the Emp. name: ");
        String ename = sc.next();
        System.out.print("Enter the Emp. salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the Emp. designation: ");
        String job = sc.next();

        Employee e1 = new Employee(empid, ename, salary, job);

        ar1.add(e1);
        System.out.println("Details added Successfully!!!");
    }

//    Showing all the employees' details
    synchronized public static void showAllTheDetailsOfTheEmployees(){
        for(Employee emp:ar1){
            System.out.println(emp);
        }
    }

//    Show the Details of the employee by Index
    synchronized public static void showDetailsbyIndex(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        System.out.println(ar1.get(index));
    }

//    Deleting the details of the employee
    synchronized public static void removeTheEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index you want to remove: ");
        int index = sc.nextInt();
        if(index<ar1.size()){
            ar1.remove(index);   
        }else{
            System.out.println("Invalid Index");
        }
        System.out.println("Removed Successfully!!!");
    }

//    Searching for the employee
    synchronized public static void searchForTheEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the emp ID: ");
        int id = sc.nextInt();
        boolean res = ar1.contains(id);
        System.out.println(res);
    }

    public static void main(String[] args) {
        int choice = 0;
        do{
            System.out.println("1. Add the employee details");
            System.out.println("2. Show all the employees' details");
            System.out.println("3. Display the employee details");
            System.out.println("4. Remove the employee details");
            System.out.println("5. Search for the employee details");
            System.out.println("0. To EXIT");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1 : addTheDetailsOfEmployee();
                        break;
                case 2 : showAllTheDetailsOfTheEmployees();
                        break;
                case 3 : showDetailsbyIndex();
                        break;
                case 4 : removeTheEmployee();
                        break;
                case 5 : searchForTheEmployee();
                        break;
            }
        }while(choice != 0);
    }
}
