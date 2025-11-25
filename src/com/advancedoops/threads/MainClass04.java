package com.advancedoops.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass04 {
    public static void main(String[] args) {
        System.out.println("Main() starts..");
        Runnable task1 = () ->
        {
            int num1 = 5;
            System.out.println("Task1 starts...");
            for(int i = 1; i<num1; i++){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("Task1 ends...");
        };

        Runnable task2 = () ->
        {
            int num2 = 5;
            System.out.println("Task2 starts...");
            for(int i = num2; i>=1; i--){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("Task1 ends...");
        };

        ExecutorService e1 = Executors.newSingleThreadExecutor();
        ExecutorService e2 = Executors.newSingleThreadExecutor();
        e1.submit(task1);
        e2.submit(task2);
        e1.shutdown();
        System.out.println("Main() ends...");
    }
}
