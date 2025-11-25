package com.collections.hashset;
import java.util.HashSet;

public class MainClass01 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        HashSet<String> hs1 = new HashSet();

        hs1.add("Java");
        hs1.add("Python");
        hs1.add(null);
        hs1.add("JavaScript");
        hs1.add("Java");
        hs1.add(null);

        for(String str:hs1){
            System.out.println(str);
        }

        System.out.println("Program ends..");
    }
}
