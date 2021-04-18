package com.fadellh.Array;

import java.util.Arrays;

public class Array {
    private final int length;
    private int[] collection;
    private int pointer = 0;

    Array (int length) {
        this.length = length;
        collection = new int[length];
    }

    public void insert(int input) {
        if(length > pointer){
            collection[pointer] = input;
        }else{
            handleCollection(collection,pointer,input);
        }
        pointer ++;
    }

    private void handleCollection(int[] oldItem, int pointer, int input) {
        var index = 0;
        collection = new int[pointer+1];
        for(var list: oldItem){
            collection[index] = list;
            index++;
        }
        collection[pointer] = input;
    }

    public void removeAt(int index){
        int i = 0;
        int[] oldItem = collection;
        collection = new int[pointer-1];
        pointer--;
        for(var list :oldItem){
            if(oldItem[index] != list){
                collection[i] = list;
                i++;
            }
        }

    }

    public int indexOf(int number){
        for(var item: collection){
            if(item == number){
                return number;
            }
        }
        return -1;
    }

    public void print(){
        System.out.println(collection);
        for (var item: collection) {
            System.out.println(item);
        }
      //  System.out.println(Arrays.toString(collection));
    }


}
