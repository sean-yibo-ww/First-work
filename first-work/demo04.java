package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String a = sc.next();            //用a来接收键盘输入的字符串
        int upper = 0;
        int lower = 0;
        int number = 0;
        char[] chars = a.toCharArray(); //将字符串转换为字符数组存在chars中
        int sum=chars.length;
        for (int i = 0; i < chars.length; i++) {//遍历字符数组
            char ch = chars[i];         //定义一个字符变量ch用来表示数组中的各个元素
            if ('A' <= ch && 'Z' >= ch) {
                upper++;
            } else if ('a' <= ch && 'z' >= ch) {
                chars[i]= (char) (chars[i]-32);
                lower++;
            } else if ('0' <= ch && '9' >= ch) {
                number++;
            } else {
                break;
            }
        }
        if(sum==upper){
            System.out.println("全是大写");
            Arrays.sort(chars);
        }
        else if(sum==lower){
            System.out.println("全是小写");
            Arrays.sort(chars);
        }
        else if(sum==number){
            System.out.println("全是数字");
            Arrays.sort(chars);
        }else if(sum==lower+upper){
            Arrays.sort(chars);
        }
        System.out.println(chars);
    }
    }

