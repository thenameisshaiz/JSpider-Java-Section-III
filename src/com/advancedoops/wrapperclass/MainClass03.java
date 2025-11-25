package com.advancedoops.wrapperclass;
import java.util.function.BiConsumer;
public class MainClass03 {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> bic =
                 (a, b )-> {
            
        };

        int x=10;
        int y=20;

        Integer x1=Integer.valueOf(x);
        Integer y1=Integer.valueOf(y);

        System.out.println("x1 ="+x1+" y1 ="+y1);

        int x2 =x1;
        int y2 =y1;

        System.out.println(x2 +" , "+ y2);

        String s1 ="9876543210";

        if(s1.length() ==10){

            Long l1 =Long.parseLong(s1);
            System.out.println("valid");
        }
        else{
            System.out.println("in valid");
        }

    }
}
