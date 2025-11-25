package com.collections.arraylist;

public class Student {
    private String name;
    private int marks;
    private int stuID;

    public Student(int stuID, String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.stuID = stuID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setRollno(int stuID) {
        this.stuID = stuID;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getRollno() {
        return stuID;
    }

    @Override
    public String toString() {
        return "Roll No.: "+this.stuID+",Name: "+this.name+", Marks: "+this.marks;
    }

    @Override
    public int hashCode() {
        return this.stuID = stuID;
    }
}
