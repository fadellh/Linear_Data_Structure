package com.fadellh.Stack;

import com.fadellh.Array.Array;

import java.util.Arrays;

public class StackImp {
    int[] array;
    int count;

    public StackImp (int size){
        array = new int[size];
    }

    public void push(int input){
        if(count == array.length) throw new StackOverflowError();
        array[count++] = input;
    }

    public int pop(){
        if(count == 0) throw new IllegalArgumentException();
        count--;
        return array[count];
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(array, 0,count);
        return Arrays.toString(content);
    }

    public void print(){
        System.out.println(Arrays.toString(array));
    }
}
