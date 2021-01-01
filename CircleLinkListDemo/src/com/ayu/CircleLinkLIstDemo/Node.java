package com.ayu.CircleLinkLIstDemo;

public class Node<T> {     //结点类
    public Node(T t){
        this.data=t;
    }
    T data;
    Node pre;
    Node next;
}
