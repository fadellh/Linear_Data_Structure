package com.fadellh.Array;

public class ArrayOpt {
    private int[] item;
    private int count;

    public ArrayOpt(int length){
        item = new int[length];
    }

    public void insert(int input){
        if(count == item.length){
            var oldItem = item;
           item = new int[2*item.length];
           for(var i = 0;i< oldItem.length;i++){
               item[i] = oldItem[i];
           }
        }
        item[count++] = input;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException("index error");
        }
        //[10,20,40,50,60,60]
        for(var i = index; i < count; i++){
            if(i != count-1){
                item[i] = item[i+1];
            }else{
                item[count-1] = 0;
            }
        }
        count--;
    }

    public int indexOf(int value){
        for(var i = 0;i < count;i++){
            if(item[i] == value){
                return value;
            }
        }
        return -1;
    }

    public void print() {
        for(var i=0;i<count;i++){
            System.out.println(item[i]);
        }
    }
}
