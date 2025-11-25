package com.advancedoops.threads;

public class MainClass09 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("world");

        Runnable task1 = () ->{
            System.out.println("Thread-1 starts...");
            System.out.println("Thread-1 waiting to LOCK s1");

            synchronized (s1){
                System.out.println("Thread-1 LOCK s1");
                System.out.println("Thread-1 waiting to LOCK s2");
                try{
                    System.out.println("Thread-1 PAUSE the executio...n");
                    s1.wait();
                    System.out.println("Thread-1 RESUME execution");
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                synchronized (s2){
                    System.out.println("Thread-1 LOCKED s2");
                }
                System.out.println("Thread-1 UNLOCKS s2");
            }
            System.out.println("Thread-1 UNLOCKS s1");
            System.out.println("Thread-1 ends...");
        };

        Runnable task2 = () ->{
            System.out.println("Thread-2 starts...");
            System.out.println("Thread-2 waiting to LOCK s2");

            synchronized (s2){
                System.out.println("Thread-2 LOCK s2");

                System.out.println("Thread-2 waiting to LOCK s1");
                synchronized (s1){
                    s1.notifyAll();
                    System.out.println("Thread-2 LOCKED s1");
                }
                System.out.println("Thread-2 UNLOCKS s1");
            }
            System.out.println("Thread-2 UNLOCKS s2");
            System.out.println("Thread-2 ends...");
        };

        Thread th1 = new Thread(task1);
        Thread th2 = new Thread(task2);

        th1.start();
        th2.start();

    }
}
