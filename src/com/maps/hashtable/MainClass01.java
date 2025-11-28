package com.maps.hashtable;

import java.util.Hashtable;

public class MainClass01 {
    public static void main(String[] args) {
        Hashtable<Integer, String> h1 = new Hashtable<>();

        h1.put(1,"A");
        h1.put(2,"B");
        h1.put(3,"C");
        System.out.println(h1.get(3));
        h1.put(3,"D");
        System.out.println(h1.get(3));
        h1.put(4,"A");
        h1.put(5,"E");

        System.out.println(h1.get(1));
        System.out.println(h1.get(2));

        System.out.println(h1.get(1));
        System.out.println(h1);
        System.out.println(h1.get(6));

    }
}
