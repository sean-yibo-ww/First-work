package com.demo04;

import org.w3c.dom.Node;


public class deleteNode {
    public ListNode1 deleteNode(ListNode1 head, int val) {
        while(head!=null){
            if(head.val!=val){
                break;
            }
            head=head.next;
        }                          //跳出循环后不再考虑头节点问题
        ListNode1 cur=head;
        ListNode1 pre=head;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;   //遍历到指定数字的节点，将这个位置的节点指向下一个节点，该节点被删除
            }else{
                pre=cur;            //没找到指定节点，该位置节点不动
            }
            cur=cur.next;           //没找到，继续向下找
        }
        return head;                //从头节点重新遍历，指定数字位置的节点已经被删除

    }

    public class ListNode1 {
        public String head=null;
        public int val=0;
        public deleteNode.ListNode1 next;
    }

}
