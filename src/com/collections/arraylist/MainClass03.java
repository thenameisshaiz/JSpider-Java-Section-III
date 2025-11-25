package com.collections.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
    static ArrayList<Student> studentList = new ArrayList();

    //    Adding a new Student
    synchronized public static void addNewStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of inputs: ");
        int size = sc.nextInt();
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
    synchronized public static void showStudentDetails(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int index = input.nextInt();
        System.out.println(studentList.get(index));
    }

//    Show all students details
    synchronized public static void showAllStudentsDetails(){
        for(Student std:studentList){
            System.out.println(std);
        }
    }

//    Search for student by using studentID
    synchronized public static void serachStudent(){

    }

//    Remove student from data
    synchronized public static void removeTheStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of Student: ");
        int index = input.nextInt();
        studentList.remove(index);
        System.out.println("Student removed !!!");
    }

    public static void main(String[] args) {
        System.out.println("Program Starts....");
        addNewStudent();
//        showStudentDetails();
        showAllStudentsDetails();
        removeTheStudent();
        showAllStudentsDetails();
        System.out.println("Program Ends....");
    }
}
