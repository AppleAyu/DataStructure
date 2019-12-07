package com.ayu.ArrayQueueDemo;

public class ArrayQueue {
    private int maxSize;
    private int[] Queue;
    private int front = 0;
    private int rear = 0;

    public ArrayQueue() {
        this.maxSize = 256;
        Queue = new int[maxSize];

    }

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        Queue = new int[maxSize];
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public boolean isFull() {
        return (this.rear + 1) % maxSize == this.front;
    }

    public void addElem(int x) {
        if (this.isFull()) {
            System.out.println("满了");
        } else {
            this.Queue[this.rear] = x;
            this.rear = (this.rear + 1) % maxSize;
        }
    }

    public void deleteElem() {
        if (this.isEmpty()) {
            System.out.println("空的");
        } else {
            this.front = (this.front + 1) % maxSize;
        }
    }

    public void displayQueue() {
       if(this.isEmpty()){
            System.out.println("空的");
            return;
        }
        for (int i = this.front; i!=this.rear ; i=(i+1)%maxSize) {
            System.out.println(this.Queue[i]);
        }
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.addElem(1);
        arrayQueue.addElem(2);
        arrayQueue.addElem(3);
        arrayQueue.addElem(4);
        arrayQueue.displayQueue();
        System.out.println();
        arrayQueue.deleteElem();
        arrayQueue.deleteElem();
        arrayQueue.deleteElem();
        arrayQueue.deleteElem();
        arrayQueue.addElem(3);
        arrayQueue.addElem(4);
        arrayQueue.deleteElem();
        arrayQueue.deleteElem();
        arrayQueue.displayQueue();
    }
}

