package com.vv;

import java.util.Scanner;


public class ExceptionText{
        public int add(int a,int b) {
            try {
                return a+b;
            }catch(Exception e){
                System.out.println("错误");
            }finally {
                System.out.println("正常");
            }
            return 0;
        }
        public static void main(String[] args) {
            ExceptionText t=new ExceptionText();
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("结果为: "+t.add(a, b));
        }

}
