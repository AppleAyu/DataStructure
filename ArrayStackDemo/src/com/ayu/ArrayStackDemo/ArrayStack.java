package com.ayu.ArrayStackDemo;

import com.sun.tools.corba.se.idl.constExpr.BooleanOr;

public class ArrayStack {
    private int maxSize = 8;//栈的默认大小是8
    private int top = -1;//栈顶指针
    private int[] Stack;//储存栈的实际数组

    public ArrayStack() {
        Stack = new int[this.maxSize];
    }

    //重载的构造器，允许用户自定栈的大小
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        Stack = new int[this.maxSize];
    }

    //判断栈是否满
    public boolean isFull() {
        return this.top == this.maxSize - 1;//因为下标是从0到n-1
    }

    //判断栈是否为空
    public Boolean isEmpty() {
        return this.top == -1;
    }

    //入栈操作
    public void pushStack(int data) {
        if (isFull()) {//先判断满没满
            System.out.println("满了");
            return;
        } else {
            this.top++;//
            this.Stack[top] = data;
            return;
        }
    }

    //出栈操作
    public void popStack() {
        if (isEmpty()) {//先判断栈里面是否有数据
            System.out.println("空的");
            return;
        } else {
            this.top--;
            return;
        }
    }

    //读栈操作
    public Object readStack() {
        if (isEmpty()) {
            System.out.println("空的");
            return null;
        } else {
            return Stack[this.top];
        }
    }

    //打印所有栈元素
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("空的");
            return;
        } else {
            for (int i = this.top; i >= 0; i--) {
                System.out.println(Stack[i]);
            }
        }
    }
}
