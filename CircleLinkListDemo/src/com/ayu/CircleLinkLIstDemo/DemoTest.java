package com.ayu.CircleLinkLIstDemo;

public class DemoTest {
    public static void main(String[] args) {
        CircleLinkList circleLinkList = new CircleLinkList();
        circleLinkList.add(new Node(1));
        circleLinkList.add(new Node(2));
        circleLinkList.add(new Node(3));
        circleLinkList.add(new Node(4));
        circleLinkList.add(new Node(5));
        circleLinkList.add(new Node(6));
        circleLinkList.add(new Node(7));
        circleLinkList.add(new Node(8));
        circleLinkList.add(new Node(9));
        circleLinkList.add(new Node(10));
        Node t=circleLinkList.head;
        for (int i = 0; circleLinkList.length!=1 ; i=(i+1)%3,t=t.next) {
            if(i==2){
                t.next.pre=t.pre;
                t.pre.next=t.next;
                circleLinkList.length--;
            }
        }
        System.out.println(t.data);
    }
}
