package com.company;

import java.time.Clock;

public class ExecClock extends Thread{
    clock.Clock hour=new clock.Clock(24);
    clock.Clock minute=new clock.Clock(60);
    clock.Clock second=new clock.Clock(60);

    public ExecClock(int hour,int minute,int second){
        this.hour.setTime(hour);
        this.minute.setTime(minute);
        this.second.setTime(second);
    }

    public void ExecTime(){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try{
                        sleep(1000);
                        second.increase(); //运行秒针
                        if(second.getTime()==0){ //分针+1
                            minute.increase();
                        if (minute.getTime()==0){ //时针+1
                            hour.increase();
                        }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }
    public void getTime(){
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while(true) {
                        sleep(1000);
                        System.out.println("2021年07月22日");
                        System.out.printf("%d:%d:%d  ",hour.getTime(),minute.getTime(),second.getTime());

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
    }
}
