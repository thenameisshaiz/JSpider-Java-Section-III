package com.collections.treeset;

public class Student implements Comparable<Student>{
    private int rollno;
    private String name;
    private int marks;

    public Student(int rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s1) {
        return this.rollno - s1.rollno;
//        int res = (int)(this.marks - s1.marks);
//        return res;
    }

//    @Override
//    public int compareTo(Student s1){
//        String name1 = s1.name;
//        String name2 = this.name;
//        return name2.compareTo(name1);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
