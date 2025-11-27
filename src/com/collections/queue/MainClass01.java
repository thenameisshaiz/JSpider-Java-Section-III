package com.collections.queue;

import java.util.PriorityQueue;

public class MainClass01 {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue();

        pq1.add("D");
        pq1.add("C");
        pq1.add("B");
        pq1.add("C");
        pq1.add("A");

        System.out.println("Size: "+pq1.size());
        System.out.println("isEmpty: "+pq1.isEmpty());

//        while(pq1.size()!=0){
//            System.out.println(pq1.poll());
//        }

        while(pq1.isEmpty()==false){
            System.out.println(pq1.poll());
        }
        System.out.println("Size: "+pq1.size());
        System.out.println("isEmpty: "+pq1.isEmpty());


    }
}
