package com.ayu.ArrayStackDemo;

public class StackDemo {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.pushStack(1);
        arrayStack.pushStack(2);
        arrayStack.pushStack(3);
        arrayStack.pushStack(4);
        arrayStack.pushStack(5);
        arrayStack.popStack();
        arrayStack.popStack();
        arrayStack.popStack();
        arrayStack.popStack();
        arrayStack.popStack();
        arrayStack.popStack();
        arrayStack.displayStack();
        arrayStack.displayStack();
    }
}
