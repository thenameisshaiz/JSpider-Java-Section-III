package com.advancedoops.collectionframeworks;
import java.util.Scanner;
class Student1{
    String name;
    int marks;
    int rollno;

    public Student1(String name, int marks, int rollno) {
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+", Roll No.: "+this.rollno+", Marks: "+this.marks;
    }

}
public class MainClass04 {
    static Student1[] slist = new Student1[3];
    static int index = 0;
    public static void addStudent(){
        Scanner sc1 = new Scanner(System.in);
        if(index <= slist.length-1){
            System.out.println("Add Student");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student's name: ");
            String name = sc.next();
            System.out.println("Enter student's marks: ");
            int marks = sc.nextInt();
            System.out.println("Enter student's rollno: ");
            int rollno = sc.nextInt();

            Student1 s1 = new Student1(name, marks, rollno);
            slist[index] = s1;
            index++;
        }
        else{
            System.out.println("ERROR- LIST IS FULL...");
        }
    }

    public static void showAllStudents(){
        for(Student1 std:slist){
            if(std != null) {
                System.out.println(std);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("1- Add Student");
            System.out.println("2 View all Students");
            System.out.println("  Any key to EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: addStudent();
                case 2: showAllStudents();
            }
        }while(choice == 1 || choice == 2);
    }

}
