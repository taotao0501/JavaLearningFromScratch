package com.imooc.Priority;

class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        this.name=name;
    }
    public void run() {
        for(int i=1;i<=20;i++){
            System.out.println("线程" + name + "正在执行！" + i);
        }
    }
}


public class PriorityDemo {
    public static void main(String[] args) {
        int mainPriority=Thread.currentThread().getPriority();
        System.out.println("主线程的优先级为： " + mainPriority);

        MyThread mt1 = new MyThread("线程1");
        mt1.setPriority(Thread.MAX_PRIORITY);

        MyThread mt2 = new MyThread("线程2");
        mt2.setPriority(Thread.MIN_PRIORITY);
        mt2.start();
        mt1.start();
        System.out.println("线程1的优先级：" + mt1.getPriority());
    }
}
