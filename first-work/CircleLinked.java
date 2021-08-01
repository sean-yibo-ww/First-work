package com.company;

import java.util.Scanner;

public class CircleLinked {
    private Element header = null;

    private class Element {
        public String data = null;
        private Element next = null;

        public Element(String data) {
            this.data = data;
        }

        public Element(){

        }
    }

    public void initList(){
        header=new Element();
        header.data=null;
        header.next=header;
    }

    //插入
    public void insertList(String data){
        Element node=new Element();
        node.data=data;

        if(header.next==header){ //判断是否是第一次插入
            header.next=node;
            node.next=header;
        }else{
            Element temp=header;
            while (temp.next!=header){
                temp=temp.next;
            }
            temp.next=node;
            node.next=header;
        }
    }

    //删除
    public void deleteList(String data){
        Element temp=header;
        while(temp.next!=header){
            //判断temp的下一个节点是否为要删除的节点

            if(temp.next.data.equals(data)){
                temp=temp.next;//temp指针后移
            }
        }
    }

    //更改
    public void changeList(String data){
        Element temp=header;
        while (temp.next==header){
            temp=null;
            data= String.valueOf(temp.next);
        }
    }

    //查找
    public void findList(String data){
        Element temp=header;
        while(temp.next==header){
            if(data==temp.data){
                System.out.println("已找到");
            }else{
                System.out.println("未找到");
            }

        }
    }

    //打印链表
    public void print() {
        System.out.println("打印链表!");
        Element temp=header;
        while(temp.next!=header) {
            temp=temp.next;
            System.out.print(temp.data+"\t");
        }
        System.out.println();
    }

    public static class LinkText{
        public static void main(String[] args) {
            CircleLinked clist=new CircleLinked();
            clist.initList();
            Scanner sc=new Scanner(System.in);
            while (true){
                String str=sc.toString();
                clist.insertList(str);
                if(str.equals(false)){
                    break;
                }
            }
            clist.print(); //打印原字符串

            String a=sc.toString();
            clist.deleteList(a); //删除a
            clist.print();

            String b=sc.toString();
            clist.changeList(b);//更改为b
            clist.print();

            String c=sc.toString();
            clist.findList(c);//查找c
            clist.print();

        }
    }
}
