package com.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class DescOrder implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){
        return s2.compareTo(s1);
    }
}

public class MainClass02 {
    public static void main(String[] args) {


       DescOrder d1 = new DescOrder();
       Comparator<Student> descOrder = (s1, s2) -> s2.compareTo(s1);

        PriorityQueue<Student> pr1 = new PriorityQueue<>(descOrder);

        Student s1 = new Student(101, "AAA", 76);
        Student s2 = new Student(104, "BBB", 76);
        Student s3 = new Student(102, "CCC", 76);
        Student s4 = new Student(103, "DDD", 76);

        pr1.add(s1);
        pr1.add(s2);
        pr1.add(s3);
        pr1.add(s4);

        while(pr1.size()!=0){
            System.out.println(pr1.poll());
        }
    }
}
