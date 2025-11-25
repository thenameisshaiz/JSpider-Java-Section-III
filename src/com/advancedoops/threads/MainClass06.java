package com.advancedoops.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainClass06 {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        Runnable task1 = () ->{
            System.out.println("Task-1 starts...");
            System.out.println("One-time Task.");
            System.out.println("Task-1 ends...");
        };

        Runnable task2 = () ->{
            System.out.println("Task-2 starts...");
            System.out.println("Periodic-time Task");
            System.out.println("Task-2 ends...");
        };

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores: "+cores);

        ScheduledExecutorService sch = Executors.newScheduledThreadPool(cores);

        sch.schedule(task1, 3, TimeUnit.SECONDS);
        sch.scheduleAtFixedRate(task2, 5,3,TimeUnit.SECONDS);
//        sch.shutdown();
        System.out.println("Program ends..");
    }
}
