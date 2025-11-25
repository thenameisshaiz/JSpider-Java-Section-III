package com.advancedoops.objectclass;

class Student extends Object{
    int id;
    String name;
    int cgpa;

    public Student(int id, String name, int CGPA){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public String toString(){
        return "Id: "+this.id+", Name: "+this.name+", CGPA: "+this.cgpa;
    }

    @Override
    public boolean equals(Object obj) {
        Student std = (Student) obj;
        return std.id == this.id;
    }
}

public class MainClass02 {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        Student s1 = new Student(101, "Student1", 9);
        Student s2 = new Student(102, "Student2", 8);
        Student s3 = new Student(101, "Student1", 9);

        int h1 = s1.hashCode();
        System.out.println(h1);

        String str1 = s1.toString();
        System.out.println(str1);

        boolean b1 = s1.equals(s2);
        System.out.println(b1);

        boolean b2 = s1.equals(s3);
        System.out.println(b2);
        System.out.println("Program ends...");
    }
}
