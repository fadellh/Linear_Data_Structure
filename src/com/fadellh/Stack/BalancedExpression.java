package com.fadellh.Stack;

import java.util.Stack;

public class BalancedExpression {

    public boolean CheckBracktetBalance(String input){
        if(input == null) throw new IllegalArgumentException();
        var stack = new Stack<Character>();
        Character check;

        for (var ch: input.toCharArray()) {
            if(isOpenBracket(ch)){
                stack.push(ch);
                continue;
            }
            if(stack.empty()) return false;
            switch (ch){
                case ')':
                    check = stack.pop();
                    if(check == '(') continue;
                    return false;
                case '>':
                    check = stack.pop();
                    if(check == '<') continue;
                    return false;
                case ']':
                    check = stack.pop();
                    if(check == '[') continue;
                    return false;
                default:
                    continue;
            }
        }
        return true;
    }

    public boolean isBalance(String input){
        var stack = new Stack<Character>();

        for (var ch: input.toCharArray()){
            if(isOpenBracket(ch)){
                stack.push(ch);
            }
            if(isCloseBracket(ch)){
                if(stack.empty()) return false;

                var top = stack.pop();

                if(bracketMatch(top,ch)) return false;
            }
        }
        return stack.empty();
    }

    private boolean isOpenBracket(char ch){
        return ch == '(' || ch == '[' || ch == '<';
    }

    private boolean isCloseBracket(char ch){
        return ch == ')' || ch == ']' || ch == '}' || ch == '>';
    }

    private boolean bracketMatch(char left, char right){
        return  left != '(' && right == ')' ||
                left != '[' && right == ']' ||
                left != '<' && right == '>' ||
                left != '{' && right == '}';
    }
}
