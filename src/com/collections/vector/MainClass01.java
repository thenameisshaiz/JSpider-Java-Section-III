package com.collections.vector;

import java.util.Scanner;
import java.util.Vector;

public class MainClass01 {
    static Vector<Student> studentList = new Vector<Student>();
    static int size;
    //    Adding a new Student
    public static void addNewStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of inputs: ");
        size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Adding new Student...");
            System.out.print("Enter student-ID: ");
            int stuID = input.nextInt();
            System.out.print("Enter Student-Name: ");
            String name = input.next();
            System.out.print("Enter student marks: ");
            int marks = input.nextInt();

            Student s1 = new Student(stuID, name, marks);
            studentList.add(s1);
            System.out.println("New Student added Successfully!!!");
        }
    }

    //    Show particular student details
    public static void showStudentDetails(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = input.nextInt();
        System.out.println(studentList.get(index));
    }

    //    Show all students details
    public static void showAllStudentsDetails(){
        for(Student std:studentList){
            System.out.println(std);
        }
    }

    //    Search for student by using studentID
    public static void serachStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student-ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        // We must Loop (Iterate) because Vector is a List
        for (Student s : studentList) {
            if (s.getRollno() == searchID) {
                System.out.println("Student Found!");
                System.out.println(s); // This calls your toString() method
                found = true;
                break; // Stop searching once found
            }
        }

        if (!found) {
            System.out.println("Student with ID " + searchID + " not found.");
        }
    }

    //    Remove student from data
    public static void removeTheStudent(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of Student: ");
        int index = input.nextInt();
        if(index<=size) {
            studentList.remove(index);
            System.out.println("Student removed !!!");
        }
        else{
            System.out.println("Please enter valid index number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Program Starts....");
        addNewStudent();

        showAllStudentsDetails();
        serachStudent();
        removeTheStudent();
        showAllStudentsDetails();
        System.out.println("Program Ends....");
    }
}
