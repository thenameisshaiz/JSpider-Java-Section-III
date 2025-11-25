package com.advancedoops.exceptionalhandling;

public class MainClass05 {
    public static void test(int num){
        System.out.println("Test() starts...");
        int res = 0;

        int[] arr1 = {10,20,30,40,50};

        try{
            res = 100/num;
            System.out.println(arr1[res]);
        }
        catch(Exception e){
            System.out.println("Exception Handled...");
        }
        finally{
            System.out.println("It's a finally block...");
        }

        System.out.println("result: "+res);
        System.out.println("Test() ends");
    }
    public static void main(String[] args) {
        System.out.println("Programs starts...");
        test(2);
        System.out.println("Programs ends...");
    }
}
