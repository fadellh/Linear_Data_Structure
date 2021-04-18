package com.fadellh.HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatChar {
    // a green apple
    private Map<Character,Integer> unique;

    public FirstNonRepeatChar(){
        unique = new HashMap<>();
    }

    public String checker (String value) {

        for (var item: value.toCharArray()) {
            if(unique == null) unique.put(item,1);

            if(!unique.containsKey(item)){
                unique.put(item,1);
            }else{
                var number = unique.get(item);
                unique.put(item,number+1);
            }
            unique.remove(null);
        }
        var result= "";
        for(var item: unique.entrySet()){
            if (item.getValue() == 1){
                result = result + item.getKey() + " ";
            }
        }
        return result;
    }

    public char firstNonRepeat(String value){
        Map<Character, Integer> map = new HashMap<>();

        for(var ch: value.toCharArray()){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count + 1);
        }

        for (var ch: value.toCharArray()){
            if(map.get(ch) == 1) return ch;
        }

        return Character.MAX_VALUE;
    }

    public char firstRepeatChar(String value){
        Map<Character, Integer> map = new HashMap<>();

        for(var ch : value.toCharArray()){
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count+1);
        }

        for(var ch: value.toCharArray()){
            if(map.get(ch)>1) return ch;
        }
        return 0;
    }

    public char firstRepeaterCharAlt(String value){
        Set<Character> sets = new HashSet<>();

        for(var ch : value.toCharArray()){
            if(sets.contains(ch)) return ch;
            sets.add(ch);
        }

        return Character.MAX_VALUE;
    }
}
