package com.advancedoops.threads;

class Counter{
    private int num = 0;

    synchronized public void increment(){
        num++;
    }

    synchronized public void decrement(){
        num--;
    }

    synchronized public void printNum(String thread) {
        System.out.println(thread + "-> Num: " + num);
    }
}

public class MainClass07 {
    public static void main(String[] args) {
        Counter c1 = new Counter();

//        int cores = Runtime.getRuntime().availableProcessors();
//        System.out.println("Cores: "+cores);

        Runnable task1 = () ->{
            c1.increment();
            c1.printNum("Thread1");
        };

        Runnable task2 = ()->{
            c1.decrement();
            c1.printNum("Thread2");
        };

        Thread th1 = new Thread(task1);
        Thread th2 = new Thread(task2);

        th1.start();
        th2.start();
    }

}
