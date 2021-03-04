package com.imooc.thread1;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(getName() + "正在运行" + i);
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("thread1");
        MyThread mt2 = new MyThread("thread2");
        mt1.start();
        mt2.start(); //顺序随机
    }

}
