package com.collections.arraylist;

import java.util.ArrayList;

public class MainClass01 {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        ArrayList a1 = new ArrayList();

        a1.add(10);
        a1.add(null);
        a1.add(20);
        a1.add(10);
        a1.add(null);
        a1.add(30);

//        Read one element
        System.out.println("element at index 3: "+a1.get(3));
//        Read all the elements
        for(int index = 0; index<a1.size();index++){
            System.out.println(a1.get(index));
        }

//        Update the value
        System.out.println("Before updation: " +a1.get(1));
        a1.add(1, 300);
        System.out.println("After updation: " +a1.get(1));

//        Delete the value
        System.out.println("Before delete: "+a1.get(1));
        a1.remove(1);
        System.out.println("After delete: "+a1.get(1));

//        Search the element
        boolean res = a1.contains(30);
        System.out.println("Is 30 present? :"+ res);

//        remove all the elements
        a1.clear();


        System.out.println("Program ends...");
    }
}
