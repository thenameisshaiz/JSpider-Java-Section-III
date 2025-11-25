package com.advancedoops.threads;
// Creating thread by using the Lambda Function.

public class MainClass03 {
    public static void main(String[] args) {
        System.out.println("Main() starts...");

        Runnable task1 = ()->
        {
            int num1 = 5;
            System.out.println("Task1 starts...");
            for(int i = 1; i<num1; i++){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("Task1 ends...");
        };

        Runnable task2 = ()->
        {
            int num2 = 3;
            System.out.println("Task2 starts...");
            for(int i = num2; i>=1; i--){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("Task2 ends...");
        };

        Thread th1 = new Thread(task1);
        Thread th2 = new Thread(task2);
        th1.start();
        th2.start();

        System.out.println("Main() ends" +
                "...");
    }
}
