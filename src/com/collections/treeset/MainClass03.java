package com.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class DescOrder implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        return s2.compareTo(s1);
    }
}


public class MainClass03 {
    public static void main(String[] args)
    {
        DescOrder d1 = new DescOrder();
        Comparator<String> descOrder = (s1, s2) -> s2.compareTo(s1);
//        TreeSet<String> ts1 = new TreeSet<String>(d1);
        TreeSet<String> ts1 = new TreeSet<String>(descOrder);


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
