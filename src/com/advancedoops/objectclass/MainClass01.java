package com.advancedoops.objectclass;

public class MainClass01 {
    public static void main(String[] args) {
        System.out.println("Program Starts...");

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;

        int h1 = obj1.hashCode();
        System.out.println("h1: "+h1);

        int h2 = obj2.hashCode();
        System.out.println("h2: "+h2);

        int h3 = obj3.hashCode();
        System.out.println("h3: "+h3);

        boolean b1 = obj1.equals(obj2);
        System.out.println("b1: "+b1);

        boolean b2 = obj1.equals(obj3);
        System.out.println("b2: "+b2);

        boolean b3 = obj1 == obj2;
        System.out.println("b3: "+b3);

        boolean b4 = obj1 == obj3;
        System.out.println("b4: "+b4);

        String s1 = obj1.toString();
        System.out.println("s1: "+s1);

        System.out.println("Program Ends...");

    }
}
