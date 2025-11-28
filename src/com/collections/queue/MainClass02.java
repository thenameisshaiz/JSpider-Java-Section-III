package com.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class StudentRollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // LOGIC:
        // If we want Descending order: return s2 - s1
        // If we want Ascending order: return s1 - s2

        // Comparing primitive int types:
        return s2.getRollno() - s1.getRollno();

        // Note: If you wanted to sort by Name (String), you would use:
        // return s2.getName().compareTo(s1.getName());
    }
}

public class MainClass02 {
    public static void main(String[] args) {


        // 2. Instantiate your custom Comparator
        StudentRollNoComparator myComparator = new StudentRollNoComparator();

        // 3. Pass the comparator to the PriorityQueue constructor
        PriorityQueue<Student> pr1 = new PriorityQueue<>(myComparator);

//        PriorityQueue<Student> pr1 = new PriorityQueue<>(myComparator);

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
