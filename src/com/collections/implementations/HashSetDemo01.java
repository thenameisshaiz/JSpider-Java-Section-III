package com.collections.implementations;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet();
        hs1.add("Java");
        hs1.add("Python");
        hs1.add(null);
        hs1.add("Ruby");
        hs1.add("C++");
        hs1.add("Java");
        hs1.add(null);
        hs1.add("C#");
        hs1.add("JavaScript");

        for(String list : hs1){
            System.out.println(list);
        }
    }
}
