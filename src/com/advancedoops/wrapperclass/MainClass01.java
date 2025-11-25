package com.advancedoops.wrapperclass;


public class MainClass01 {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        int x1 = 50;
        int x2 = 10;

        Integer i1 = Integer.valueOf(x1);
        Integer i2 = Integer.valueOf(x2);

        Integer res = i1+i2;
        System.out.println("res: "+res);

        Integer i3 = Integer.valueOf(100);
        int x3 = i3;

        System.out.println(x3);

        String mob = "8976787668";
        if(mob.length()==10){
            long numb = Long.parseLong(mob);
            System.out.println(numb+ " Valid Mobile number");
        }
        else{
            System.out.println("Valid Mobile number");
        }
        System.out.println("Program ends...");
    }
}
