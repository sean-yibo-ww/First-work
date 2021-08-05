package com.demo03;

import java.util.Scanner;
import java.util.Stack;

public class zhan {
    public static void main(String[] args) {
    Stack<Integer> stack=new Stack<Integer>();
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(stack.empty()==true){
        stack.push(number);
        System.out.println("栈中的数字为： "+stack);
        System.out.println("转化为二进制为： "+two(number));
        System.out.println("转化为八进制为： "+eight(number));
        System.out.println("转化为十六进制为： "+sixteen(number));
    }else{
        System.out.println("错误");
    }

    }

    public static int two(int number){
        return Integer.parseInt(Integer.toBinaryString(number)); //Integer.parseInt()解析字符串并返回一个整数
    }

    public static int eight(int number){
        return Integer.parseInt(Integer.toOctalString(number));
    }

    public static String sixteen(int number){
        return Integer.toHexString(number);
    }
}
