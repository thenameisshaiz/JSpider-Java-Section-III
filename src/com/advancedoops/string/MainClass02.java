package com.advancedoops.string;

public class MainClass02 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = "hello";
        String s4 = new String("hello");
        String s5 = "world";
        String s6 = s1 + s5;
        String s7 = "hello" + s5;
        String s8 = "hello" + "world";
        String s9 = "helloworld";

        boolean res1 = s1 == s2;
        System.out.println("s1 == s2: "+res1);

        boolean res2 = s2 == s3;
        System.out.println("s2 == s3: "+res2);

        boolean res3 = s1 == s4;
        System.out.println("s1 == s4: "+res3);

        boolean res4 = s6 == s8;
        System.out.println("s6 == s8: "+res4);

        boolean res5 = s6 == s7;
        System.out.println("s6 == s7: "+res5);

        boolean res6 = s7 == s8;
        System.out.println("s7 == s8: "+res6);

        boolean res7 = s7 == s9;
        System.out.println("s7 == s9: "+res7);

        boolean res8 = s8 == s9;
        System.out.println("s8 == s9: "+res8);
    }
}
