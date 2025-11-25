package com.advancedoops.threads;

class CounterV1{
    private int num = 0;

    public void increment(){
        num++;
    }

    public void decrement(){
        num--;
    }

    public void printNum(String thread) {
        System.out.println(thread + "-> Num: " + num);
    }
}

public class MainClass08 {
    public static void main(String[] args) {
        Counter c1 = new Counter();

        Runnable task1 = () ->{
            synchronized (c1){
                c1.increment();
                c1.printNum("Thread1");
            }
        };

        Runnable task2 = ()->{
            synchronized (c1){
                c1.decrement();
                c1.printNum("Thread2");
            }
        };

        Thread th1 = new Thread(task1);
        Thread th2 = new Thread(task2);

        th1.start();
        th2.start();
    }

}
