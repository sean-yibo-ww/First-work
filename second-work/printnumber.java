package com.vv;

public class printnumber {
    public static class CreateRunnable implements Runnable{

        @Override
        public void run() {
            for(int i=1;i<121;i++){
                System.out.println(i);
            }
        }
    }


}
