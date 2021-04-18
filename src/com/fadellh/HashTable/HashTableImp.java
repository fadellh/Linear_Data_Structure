package com.fadellh.HashTable;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class HashTableImp {
    private class MyEnrty{
        private Integer key;
        private String value;

        public MyEnrty(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<MyEnrty>[] list;
    private MyEnrty keyValuePair;

    public HashTableImp(Integer size){
        list = new LinkedList[size];
    }

    public void put(Integer key, String val){
        var index = hashFunction(key);
        if(list[index] == null){
            list[index] = new LinkedList<>();
        }
        var bucket = list[index];

        for(var entry : bucket){
            if(entry.key == key){
                entry.value =val;
                return;
            }
        }

        bucket.addLast(new MyEnrty(key,val));

    }

    public String get(int key){
        var index = hashFunction(key);
        var bucket = list[index];

        if(bucket != null){
            for(var item : bucket){
                if(item.key == key){
                    return item.value;
                }
            }
        }
        return null;
    }

    public void remove(int key){
        var index = hashFunction(key);
        var bucket = list[index];

        if(bucket == null){
            throw new IllegalArgumentException();
        }

        for(var item : bucket){
            if(item.key == key){
               bucket.remove(item);
               return;
            }
        }
        throw new IllegalStateException();
    }

    private Integer hashFunction(Integer key){
        return key % 5;
    }
}
