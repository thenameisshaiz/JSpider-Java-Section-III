package com.advancedoops.string;
import java.lang.String;

public class MainClass01 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("world");
        String s3 = new String("hello");
        String s4 = new String("HELLO");

        String s5 = "WORLD"; // we can create String() without using 'new' keyword.

        int h1 = s1.hashCode();
        System.out.println("h1: "+h1);

        int h2 = s2.hashCode();
        System.out.println("h2: "+h2);

        int h3 = s3.hashCode();
        System.out.println("h3: "+h3);

        int h4 = s4.hashCode();
        System.out.println("h4: "+h4);

        String str1 = s1.toString();
        System.out.println(str1);

        String str2 = s3.toString();
        System.out.println(str2);

        boolean b1;
        if (s1.equals(s2)) b1 = true;
        else b1 = false;
        System.out.println("b1: "+b1);

        boolean b2 = s1.equals(s3);
        System.out.println("b2: "+b2);

        boolean b3 = s1==s3;
        System.out.println("b3: "+b3);
    }
}
