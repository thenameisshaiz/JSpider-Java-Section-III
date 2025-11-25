package com.collections.arraylist;

import java.util.ArrayList;

public class MainClass02 {
    private static ArrayList<Student> studentsList = new ArrayList();

    synchronized public static void addStudent(){
        System.out.println("Adding student");
        Student s1 = new Student(1,"Afeem", 96);
        studentsList.add(s1);
        System.out.println("Student added Successfullt");
    }

    synchronized public static void getStudentByIndex(int index){
        System.out.println("Student at index: "+index);
        System.out.println(studentsList.get(index));
    }

    synchronized public static void removeStudent(int index){
        studentsList.remove(index);
        System.out.println("Student removed successfully");
    }

    public static void getAllStudents(){
        for(Student std:studentsList){
            System.out.println(std);
        }
    }
    public static void main(String[] args) {
        addStudent();
//        getStudentByIndex(0);
        getAllStudents();
//        removeStudent(0);
//        getStudentByIndex(0);
    }
}
