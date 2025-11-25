package com.collections.vector;

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

    // 1. FIX: Correct hashCode implementation
    @Override
    public int hashCode() {
        // Simply return the ID.
        // This tells Java: "The ID is the unique fingerprint for this object."
        return this.stuID;
    }

    // 2. ADD: Equals method
    // This is required so Java knows that two different Student objects
    // with the same ID are actually the "same" student.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return stuID == other.stuID;
    }
}
