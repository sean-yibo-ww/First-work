package com.vv;

public class printText_2 extends Thread{
    public void run(){
        for(int i=1;i<121;i++){
            currentThread();
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("---线程开始---");
        printText_2 thread=new printText_2();
        Thread thread1=new Thread(thread);
        System.out.println("---线程启动---");
        thread1.start();
        System.out.println("---线程结束---");
    }
}
