package com.fadellh.Queue;

import java.util.ArrayList;
import java.util.Arrays;

public class PriorityQueue {
    private int size = 6;
    private int[] items;
    private int count;

    public PriorityQueue(){
        items = new int[6];
    }

    public void insert(int number){

        int i;
        for(i = count-1; i >= 0; i--){
            if(items[i] > number){
                items[i+1] = items[i];
            }else {
             break;
            }
        }
            items[i +1] = number;
            count++;
        //[3,,0,0,0] 2
    }

    public int remove(){
        return items[--count];
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
