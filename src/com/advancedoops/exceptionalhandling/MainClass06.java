package com.advancedoops.exceptionalhandling;

public class MainClass06 {
    public static void test(int num) throws InterruptedException{
        System.out.println("test() starts...");
        Thread.sleep(num);
        System.out.println("test() ends...");
    }
    public static void main(String[] args) {
        System.out.println("Program starts...");
        try{
            test(0);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Program ends...");
    }
}
