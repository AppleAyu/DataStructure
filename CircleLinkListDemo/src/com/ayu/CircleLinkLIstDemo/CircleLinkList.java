package com.ayu.CircleLinkLIstDemo;

public class CircleLinkList{
    public int length;//循环链表的结点数
    public Node head;//首结点
    public Node tail;//尾结点
    public CircleLinkList(){}

    //添加结点
    public void add(Node node){
        //如果首结点是空，那么加入的结点是第一个结点
        if(this.head==null){
            this.head=node;
            this.head.next=this.tail;
            this.head.pre=this.tail;
            this.tail=node;
            this.tail.pre=node;
            this.tail.next=node;
            this.length++;
        }else{
            //如果不是第一个结点，用尾插法插入
            node.pre=this.tail;
            node.next=this.head;
            this.tail.next=node;
            this.tail=this.tail.next;
            this.head.pre=this.tail;
            this.length++;
        }
    }

    //删除方法使用的是尾删
    public void delete(){
        if(this.length==0){
            System.out.println("空的");
            return;
        }else{
            this.tail.pre.next=this.head;
            this.tail=this.tail.pre;
            this.head.pre=this.tail;
            this.length--;
            //如果删完之后length是0，说明没有结点了，让首尾结点都指向空
            if(length==0){
                this.head=this.tail=null;
            }
        }
    }

    //打印链表元素
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

class Node<T> {     //结点类
    public Node(T t){
        this.data=t;
    }
    T data;
    Node pre;
    Node next;
}
