package com.vv;

public class printText {
        public static void main(String[] args) {
            System.out.println("---线程开始---");
            printnumber.CreateRunnable createRunnable=new printnumber.CreateRunnable();
            System.out.println("---线程启动---");
            Thread thread=new Thread(createRunnable);
            thread.start();
            System.out.println("---线程结束---");
        }
}
