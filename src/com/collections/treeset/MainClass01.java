package com.collections.treeset;

import java.util.TreeSet;

public class MainClass01{
    public static void main(String[] args) {

        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("E");
        ts1.add("C");
        ts1.add("A");
        ts1.add("B");
        ts1.add("D");

        for(String str : ts1){
            System.out.println(str);
        }
    }
}
