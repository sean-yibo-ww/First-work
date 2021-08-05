package com.demo03;

import java.util.Scanner;
import java.util.List;
public class ListNode {

        private com.vv.ListNode next;

        public com.vv.ListNode reserveNode(com.vv.ListNode head){
            com.vv.ListNode pre=null;
            com.vv.ListNode cur=head;

            while(cur!=null){
                com.vv.ListNode temp=cur.next;
                cur.next=pre;
                pre=cur;
                cur=temp;
            }
            return pre;
        }

        public static void main(String[] args) {
            com.vv.ListNode list=new com.vv.ListNode();
            Scanner input=new Scanner(System.in);
            String str=input.next();
            char[] ch=str.toCharArray();

        }

    }


