package com.fadellh.Queue;

import java.util.Arrays;

public class ArrayyQueue {
    private int[] items;
    private int front;
    private int rear;
    private int count;

    public ArrayyQueue (int size) {
        items = new int[size];
    }

    public void enqueue (int number) {
        if(count == items.length){
            var oldItem = items;
            items = new int[items.length*2];
           for(var i =0; i<oldItem.length;i++){
               items[i]=oldItem[i];
           }
        }
        items[rear++] = number;
        count++;
    }

    //Using circular Array
    public void enqueueCircular(int number){
        if(isFull()) throw new IllegalArgumentException();
        items[rear] = number;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeuCircular () {
        if(front == rear) return 0;
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int dequeu (){
        if(front == rear) return 0;
        var item = items[front];
        items[front++] = 0;
        return item;
    }

    private int peek () {
        var peek = front;
        return peek;
    }

    public boolean isEmpty(){
        if(front == rear) return true;
        return false;
    }

    public boolean isFull() {
        if(items.length == count) return true;
        return false;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

}
