package com.fadellh.LinkedListStr;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int number){
            this.value = number;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public void addLast(int value) {
        var node = new Node(value);

        if(first == null){
            first = node;
            last = node;
        }else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int value){
        var node = new Node(value);

        if(first == null){
            first = node;
            last = node;
        }else{
            node.next = first;
            first = node;
        }
        size ++;
    }

    public int indexOf(int value){
        int index = 0;
        var current = first;
        while (current != null){
            if(current.value == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        if(indexOf(item) == -1) return false;
        return true;
    }

    public void removeFirst () {
        if(first == null){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
        }else{
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if(first == null){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
        }else {
            //var previous = getPrevious(last);
            last= getPrevious(last);;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int sizeLoop () {
        int count = 1;
        var current = first;
        while (current != null){
            if(current.next == last) return count + 1;
            current = current.next;
            count++;
        }
        return 0;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        var array = new int[size];
        var current = first;
        var index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse(){
        Node prev = null;
        Node current = first;
        Node next = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = last;
        last = current;
    }

    public void reverseAlt() {
        var previous= first;
        var current = first.next;
        while (current!=null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last=first;
        last.next = null;
        first = previous;
    }

    public void getKthFromTheEnd(int k){
        var point1 = first;

    }

    public void print(LinkedList item){
        System.out.println();
    }
}
