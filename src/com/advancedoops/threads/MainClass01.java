package com.advancedoops.threads;

class TaskOne extends Thread{
    int num;
    public TaskOne(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Task-1 starts");
        for(int i = 1; i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Task-1 ends...");
    }
}

class TaskTwo extends Thread{
    int num;
    public TaskTwo(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Task-2 starts");
        for(int i = num; i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Task-2 ends...");
    }
}
public class MainClass01 {
    public static void main(String[] args) {
        System.out.println("Main() starts...");
        TaskOne t1 = new TaskOne(5);
        TaskTwo t2 = new TaskTwo(3);

        t1.start();
        t2.start();
        System.out.println("Main() ends...");
    }
}
