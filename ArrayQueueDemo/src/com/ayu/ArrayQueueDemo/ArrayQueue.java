package com.ayu.ArrayQueueDemo;

public class ArrayQueue {
    private int maxSize;
    private int[] Queue;
    private int front = -1;
    private int rear = -1;

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
        return (this.rear - this.front + 1 + maxSize) % maxSize == 0;
    }

    public void addElem(int x) {
        if (!this.isFull()) {
            this.rear = (this.rear + 1) % maxSize;
            this.Queue[this.rear] = x;
        }else{
            System.out.println("满了");
        }
    }

    public void deleteElem() {
        if (!this.isEmpty()) {
            this.front = (this.front + 1) % maxSize;
        }
    }

    public void displayQueue() {
        for (int i = (this.front +1)%maxSize;i<=this.rear;i=(i+1)%maxSize){
            System.out.println(Queue[i]);
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
        arrayQueue.addElem(4);
        arrayQueue.displayQueue();
    }
}

