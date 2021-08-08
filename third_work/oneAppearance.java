package com.demo04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class oneAppearance {
    /*public static char firstUniqChar(String s) {
            if(s==null || s.length()==0){
                return ' ';
            }
            char[] chars=s.toCharArray(); //将字符串转换为char类型的字符数组
            for(char c:chars){ //遍历该字符数组
                if(s.indexOf(c)==s.lastIndexOf(c)){  //第一次索引的下标与最后一次索引的下标相同，说明只出现一次该字符
                    return c;
                }
            }
            return ' ';*/

    public static Object firstUniqChar(String s) {
        Queue<String> queue=new LinkedList<String>();
        queue.offer(s);
        int sum=0;
        for(String str1:queue){
            sum=0;
            for(String str2:queue){
                if(str1.equals(str2)){
                    sum++;
                    if(sum==2){
                        queue.poll();
                        break;
                    }
                }
            }
            if(sum==1){
                break;
            }
        }
        return queue.peek();
    }

     /* Queue<String> queue = new LinkedList<String>();
        queue.add(s);

        String[] str=s.split(" ");
        for(int j=0;j<s.length();j++){
            int sum=0;
            for(int i=0;i<s.length();i++){
                if(str[i].equals(queue.peek())){
                    sum++;
                    if(sum==2){
                        queue.poll();
                        break;
                    }else{
                        continue;
                    }
                }
            }
            if(sum<2){
                return queue.peek();
                break;
            }else{
                return ' ';
            }
        }

        return s;

 */


    private static Queue<String> getQueue(Queue<String> queue) {
        return queue;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a="";
        a= (String) firstUniqChar(s);
        if(a.isEmpty()){
            System.out.println(' ');
        }else{
            System.out.println(a);
        }


    }
}
