package com.advancedoops.stringbuilder;
import java.lang.StringBuilder;

public class MainClass01 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        //hashCode Method -> Not overriden
        int h1 = sb1.hashCode();
        int h2 = sb2.hashCode();

        System.out.println("h1: "+h1);
        System.out.println("h2: "+h2);

        //toString() method ->
        String str1 = sb1.toString();
        String str2 = sb1.toString();

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        // == -> equals operator
        boolean b1 = sb1 == sb2;
        System.out.println("b1: "+b1);

        // equals()
        boolean b2 = sb1.equals(sb2);
        System.out.println("b2: "+b2);
    }
}
