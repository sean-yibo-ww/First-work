package com.demo03;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class differentWord {

        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String[] A=sc.nextLine().split("\\s");
                String[] B=sc.nextLine().split("\\s");
                String[] strs = (A + " " + B).split(" ");
                String[] ans = new String[strs.length];
                int index = 0;
                Map<String, Integer> map = new HashMap<>();
                for (String str : strs)
                        map.put(str, map.getOrDefault(str, 0) + 1);
                for (Map.Entry<String, Integer> entry : map.entrySet())
                        if (entry.getValue() == 1)
                                ans[index++] = entry.getKey();
               for(int i=0;i<A.length+B.length;i++){
                        System.out.println(Arrays.copyOfRange(ans, 0, index)[i]);
                }


        }

}




