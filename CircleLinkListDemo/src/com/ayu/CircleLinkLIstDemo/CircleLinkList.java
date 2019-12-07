package com.ayu.CircleLinkLIstDemo;

public class CircleLinkList{
    public int length;
    public Node head;
    public Node tail;
    public CircleLinkList(){}
    public void add(Node node){
        if(this.head==null){
            this.head=node;
            this.head.next=this.tail;
            this.head.pre=this.tail;
            this.tail=node;
            this.tail.pre=node;
            this.tail.next=node;
            this.length++;
        }else{
            node.pre=this.tail;
            node.next=this.head;
            this.tail.next=node;
            this.tail=this.tail.next;
            this.head.pre=this.tail;
            this.length++;
        }
    }
    public void delete(){
        if(this.length==0){
            System.out.println("空的");
            return;
        }else{
            this.tail.pre.next=this.head;
            this.tail=this.tail.pre;
            this.head.pre=this.tail;
            this.length--;
            if(length==0){
                this.head=this.tail=null;
            }
        }
    }
    public void displayList(){
        if(this.length==0){
            System.out.println("空的");
            return;
        }else{
            System.out.println("====================================== ");
            Node t=this.head;
            for (int i = 0; i <this.length ; i++) {
                System.out.println(t.data);
                t=t.next;
            }
        }
    }
}
class Node <T>{
    public Node(T t){
        this.data=t;
    }
    T data;
    Node pre;
    Node next;
}
