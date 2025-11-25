package com.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class AscOrder implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.compareTo(s2);
    }
}

public class MainClass04 {
    public static void main(String[] args) {
        AscOrder as1 = new AscOrder();
        TreeSet<Student> ts1 = new TreeSet<Student>(as1);

        Student s1 = new Student(101, "Alif", 78);
        Student s2 = new Student(103, "Sheen", 68);
        Student s3 = new Student(102, "Aayn", 65);

        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);

        for(Student std:ts1){
            System.out.println(std);
        }
    }
}
