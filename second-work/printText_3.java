package com.vv;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class printText_3 {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
            int i=0;
            for(;i<121;i++);
            return i;
        });
        for(int i=1;i<121;i++){
            System.out.println(i);
            new Thread(task).start();
        }
    }
}
