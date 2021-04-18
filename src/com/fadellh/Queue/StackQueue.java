package com.fadellh.Queue;

import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;
    private int front;

    public StackQueue(){
        firstStack = new Stack<Integer>();
        secondStack = new Stack<Integer>();
    }

    public void add(Integer number){
        firstStack.push(number);
    }

    public Integer remove(){
        if(secondStack.empty() && firstStack.empty()) throw new IllegalArgumentException();

        if(secondStack.empty()){
            while (!firstStack.empty()){
                secondStack.push(firstStack.pop());
            }
        }
        return secondStack.pop();
    }

    public void print() {
        while (!secondStack.empty()){
            firstStack.push(secondStack.pop());
        }
        System.out.println(firstStack);
    }

//    @Override
//    public String toString() {
//        return (Arrays.toString(secondStack.toArray()));
//    }
}
