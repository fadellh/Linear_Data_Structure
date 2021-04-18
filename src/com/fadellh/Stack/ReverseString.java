package com.fadellh.Stack;

import java.util.Stack;

public class ReverseString {

    public String ReverseStr(String input){
        if(input == null) throw new IllegalArgumentException();
        var stack = new Stack<Character>();

        for (var ch: input.toCharArray()) {
            stack.push(ch);
        }
        var reverseResult = new StringBuffer();
        while (!stack.empty()){
            reverseResult.append(stack.pop());
        }
        return reverseResult.toString();
    }
}
