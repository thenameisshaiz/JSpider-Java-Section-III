package com.advancedoops.wrapperclass;
import java.lang.Integer;

public class MainClass02 {
    public static void main(String[] args) {
        int i1 = 3; //Integer
        float f1 = 3; //FLoat
        boolean b1 = true; //Boolean
        double d1 = 342.2344; //Double
        long l1 = 123403932; //Long
        char c1 = 'a'; //Character
        byte by1 = 1; //Byte

        System.out.println("i1: " + i1);
//    Wrapper Class
        String st1 = new String();
        Integer i2 = Integer.valueOf(i1); //directly value, variable(primitve datatype) boxing.
        System.out.println("i2: " + i2);

        Integer i3 = Integer.valueOf(32);
        System.out.println("i3: " + i3);

        Integer res = i1 + i2;
        System.out.println("res: " + res);

        int x3 = res;
        System.out.println("x3: "+x3);

        // Mobile -> input- Database(mobile == 10)-> mobile(type == NUMBER)

        String mobile = "9080776043";
        if (mobile.length() == 10) {
            Long phone = Long.parseLong(mobile);
            System.out.println("valid number.");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
