package com.collections.vector;

import java.util.Scanner;
import java.util.Vector;

public class MainClass02 {
    static Vector<Employee> eList = new Vector<Employee>();

//    Add the details of the employee
    public static void addEmployee(){
        System.out.println("Adding the employee");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee-ID: ");
        int empID = sc.nextInt();
        System.out.print("Enter the name of the employee: ");
        String ename = sc.next();
        System.out.print("Enter the salary of the employee: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the designation of the employee: ");
        String designation = sc.next();

        Employee e1 = new Employee(empID, ename, salary, designation);
        eList.add(e1);

        System.out.println("Details added successfully!!!");
    }

//    Get employee details using index
    public static void getDetailsByIndex(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = sc.nextInt();
        if(index <= eList.size()){
            System.out.println(eList.get(index));
        }else{
            System.out.println("Please enter the valid index");
        }
    }

//    Get details of all the employee
    public static void getAllTheDetails(){
        for(Employee emp:eList){
            System.out.println(emp);
        }
    }

//    Update the employee details
    public static void updateTheEmpDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ");
    }

//    Remove the details of the employee
    public static void removeTheEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index you want to remove: ");
        int index = sc.nextInt();
        if(index<=eList.size()){
            eList.remove(index);
            System.out.println("Removed successfully!!!");
        }else {
            System.out.println("Please enter the valid index");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1: To add the employee detail");
            System.out.println("2: To get the employee detail");
            System.out.println("3: To get all the employees detail");
            System.out.println("4: To remove the employee");
            System.out.println("0: To exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 : addEmployee();
                        break;
                case 2 : getDetailsByIndex();
                        break;
                case 3 : getAllTheDetails();
                        break;
                case 4 : removeTheEmployee();
                        break;
                default :
                    System.out.println("Enter the valid choice");
                    break;
            }
        }while(choice!=0);
    }
}
