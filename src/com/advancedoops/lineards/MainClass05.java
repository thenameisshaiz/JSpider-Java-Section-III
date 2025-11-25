package com.advancedoops.collectionframeworks;

import java.util.Scanner;

class Student extends Object
{
    private final String name;
    private final int marks;
    private final int rollNo;

    public Student(int rollNo, int marks, String name) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", rollNo=" + rollNo +
                '}';
    }
}
public class MainClass05 {
    static Student[] slist = new Student[5];//Object array
    static int index = 0;
    public static void addStudent()
    {
        if(index <= slist.length-1) {
            System.out.println("Add Student");
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter Student's name : ");
            String name = sc1.next();
            System.out.print("Enter Student's marks : ");
            int marks = sc1.nextInt();
            System.out.print("Enter Student's roll.no : ");
            int rollNo = sc1.nextInt();

            Student s1 = new Student(rollNo, marks, name);
            slist[index] = s1;
            index++;
        }
        else {
            System.out.println("ERROR : LIST IS FULL");
        }
    }
    public static void showAllStudents()
    {
        System.out.println("-------Student List-------");
        for(Student std : slist) {
            if(std!=null) {
                System.out.println(std);
            }
        }
        System.out.println("-------Student List-------");
    }

    public static void showStudentByIndex()
    {
        System.out.println("Show Student");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter index : ");
        int index = sc1.nextInt();
        if(index >=0 && index <= slist.length-1 && slist[index]!=null)
        {
            System.out.println(slist[index]);
        }
        else {
            System.err.println("Student Not Found");
        }
    }

    public static void deleteStudent()
    {
        System.out.println("Delete Student");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter index : ");
        int index = sc1.nextInt();
        slist[index] = null;
    }

    public static void main(String[] args)
    {
        System.out.println("Program starts..");
        Scanner sc1 = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. View Student");
            System.out.println("4. View All Student");
            System.out.println("0. For EXIT");
            System.out.print("Enter your choice: ");
            choice = sc1.nextInt();
            switch (choice){
                case 1 : addStudent();
                    break;
                case 2 : deleteStudent();
                    break;
                case 3 : showStudentByIndex();
                    break;
                case 4 : showAllStudents();
                    break;
            }
        }while(choice!=0);
        System.out.println("Program ends..");
    }
}

