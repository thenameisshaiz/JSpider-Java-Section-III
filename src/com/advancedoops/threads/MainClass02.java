package com.advancedoops.threads;

class TaskOneV1 implements Runnable{
    int num;
    public TaskOneV1(int num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("TaskOneV1 starts...");
        for(int i = 1; i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("TaskOneV1 ends...");
    }
}

class TaskTwoV1 implements Runnable{
    int num;
    public TaskTwoV1(int num){
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("TaskTwoV1 starts...");
        for(int i = 2; i<=num; i = i+2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("TaskTwoV1 ends...");
    }
}

public class MainClass02 {
    public static void main(String[] args) {
        System.out.println("Main() starts...");
        TaskOneV1 t1 = new TaskOneV1(5);
        TaskTwoV1 t2 = new TaskTwoV1(10);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
        System.out.println("Main() ends...");
    }
}
