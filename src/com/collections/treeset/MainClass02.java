package com.collections.treeset;

import java.util.TreeSet;

public class MainClass02 {
    public static void main(String[] args) {
        TreeSet<Student> ts1 = new TreeSet<Student>();

        Student s1 = new Student(103, "AA", 88);
        Student s2 = new Student(102, "BB", 78);
        Student s3 = new Student(104, "CC", 56);
        Student s4 = new Student(101, "DD", 33);

        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);

        for(Student std: ts1){
            System.out.println(std);
        }
    }
}
