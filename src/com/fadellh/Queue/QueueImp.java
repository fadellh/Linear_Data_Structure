package com.fadellh.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueImp {
    public Queue<Integer> reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()) throw new IllegalArgumentException();

        var stack = new Stack<Integer>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.empty()){
            queue.add(stack.pop());
        }

        return queue;
    }
}
