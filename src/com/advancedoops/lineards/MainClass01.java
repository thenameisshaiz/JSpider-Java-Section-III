package com.advancedoops.lineards;
class Students{
    private String name;
    private int marks;
    private int rollno;

    public Students(String name, int marks, int rollno) {
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+", Roll No.: "+this.rollno+", Marks: "+this.marks;
    }

}
public class MainClass01 {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        Students[] slist = new Students[4];
        Students s1 = new Students("A",60,101);
        slist[0] = s1;

        Students s2 = new Students("B",90,102);
        Students s3 = new Students("C",67,103);
        Students s4 = new Students("D",86,104);

        slist[1] = s2;
        slist[2] = s3;
        slist[3] = s4;

//        for(Students std:slist){
//            System.out.println(std);
//        }
        System.out.println("---------Details---------");
        for(int i = 0; i< slist.length-1;i++){
            System.out.println(slist[0]);
        }
        System.out.println("Program ends..");
    }
}
