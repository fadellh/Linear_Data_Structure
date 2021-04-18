package com.fadellh;

import com.fadellh.HashTable.FirstNonRepeatChar;
import com.fadellh.HashTable.HashTableImp;
import com.fadellh.LinkedListStr.LinkedList;
import com.fadellh.Queue.ArrayyQueue;
import com.fadellh.Queue.PriorityQueue;
import com.fadellh.Queue.QueueImp;
import com.fadellh.Queue.StackQueue;
import com.fadellh.Stack.BalancedExpression;
import com.fadellh.Stack.ReverseString;
import com.fadellh.Stack.StackImp;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
 /*       var number = new String[3];
        number[0] = "hai";
        number[1] = "hsai";
        number[2] = "shai";
        System.out.println(Arrays.toString(number));

        var number2 = new String[4];
        int index = 0;
        for(var list: number){
            //index = 0;
            number2[index] = list;
            index++;
        }
        number2[3] = "keempat";
        System.out.println(Arrays.toString(number2));*/
// ========================Array Fadel============================================================================
// ========================Array Fadel============================================================================
// ========================Array Fadel============================================================================
  /*      var list = new Array(3);
        list.insert(10);

        list.insert(20);
        list.insert(30);

        list.insert(40);
        list.insert(50);
        list.removeAt(2);
        list.removeAt(2);
        list.print();
        System.out.println(list.indexOf(30));*/

        //=====================Array Mosh============================================================================
        //=====================Array Mosh============================================================================
        //=====================Array Mosh============================================================================
/*        var number = new ArrayOpt(3);
        number.insert(10);
        number.insert(20);
        number.insert(30);
        number.insert(40);
        number.insert(50);
        number.insert(60);
        number.removeAt(3);
        System.out.println(number.indexOf(10));
       // number.removeAt(3);
        //number.removeAt(3);
        number.print();*/

        //=======================LinkedList============================================================================
        //=======================LinkedList============================================================================
        //=======================LinkedList============================================================================
/*        var list = new LinkedList();
        System.out.println(list.size());
        list.addFirst(10);
        //list.removeFirst();
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(400);
        list.addFirst(50);
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));*/
     /*   list.removeFirst();
        list.removeFirst();*/
    /*    list.removeLast();
        list.removeLast();
        System.out.println(list.size());
        System.out.println(list.sizeLoop())*/;
      /*  list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(400);
        list.addLast(50);*/
 /*       System.out.println(list.contains(800));
        System.out.println(list.indexOf(400));*/

        //========================Stack==============================================================================
        //========================Stack==============================================================================
        //========================Stack==============================================================================

        //=============REVERSE STRING========================================================================
        //=============REVERSE STRING========================================================================
/*        String str = "abcd";
        var stack = new ReverseString();
        System.out.println(stack.ReverseStr(str));*/

        //============Balance Expression=======================================================
        //============Balance Expression=======================================================
 /*        String bracket = "((()<>[<[]]))";
        //String bracket = "()";
        var checkBalance = new BalancedExpression();
        System.out.println(checkBalance.CheckBracktetBalance(bracket));
        System.out.println(checkBalance.isBalance(bracket));*/

        //============Stack implementation========================================
        //============Stack implementation========================================

 /*       var stack = new StackImp(5);
        stack.push(10);
        stack.push(20);
        stack.pop();
        System.out.println(stack);
*/
        //=========================Queue================================================================
        //=========================Queue================================================================
        //=========================Queue================================================================

/*        var tryQueue = new QueueImp();
        var Queue = new ArrayDeque<Integer>();
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);
        System.out.println(tryQueue.reverseQueue(Queue));*/

        var arrqueue = new ArrayyQueue(4);
/*        System.out.println(arrqueue.isEmpty());
        arrqueue.enqueue(10);
        arrqueue.enqueue(20);
        arrqueue.enqueue(30);
        System.out.println(arrqueue.isFull());
        arrqueue.enqueue(40);
      //  arrqueue.print();
        var remove = arrqueue.dequeu();
        arrqueue.dequeu();
        arrqueue.dequeu();
        System.out.println(arrqueue.isEmpty());
        System.out.println(arrqueue);*/
        //System.out.println(remove);
//        var circularArray = new ArrayyQueue(4);
//        circularArray.enqueueCircular(10);
//        circularArray.enqueueCircular(20);
//        circularArray.enqueueCircular(30);
//        circularArray.dequeuCircular();
//        circularArray.dequeuCircular();
//        circularArray.dequeuCircular();
//        circularArray.enqueueCircular(50);
//        circularArray.enqueueCircular(60);
//        System.out.println(circularArray);

//        var stackQueue = new StackQueue();
//        stackQueue.add(10);
//        stackQueue.add(20);
//        stackQueue.add(30);
//        stackQueue.remove();
//        stackQueue.remove();
//        stackQueue.add(40);
//        stackQueue.add(50);
//        stackQueue.print();


//        var priority = new PriorityQueue();
//        priority.insert(1);
//        priority.insert(3);
//        priority.insert(7);
//        priority.insert(2);
//        var test =  priority.remove();
//        System.out.println(priority);
//        System.out.println(test);

        //=================================Hash Table===================================================
        //=================================Hash Table===================================================
        //=================================Hash Table===================================================

//        var hash = new FirstNonRepeatChar();
//        var exp = "green apple";
//        var result = hash.checker(exp);
//        System.out.println(result);
//
//        System.out.println(hash.firstNonRepeat(exp));
//        System.out.println(hash.firstRepeatChar(exp));
//        System.out.println(hash.firstRepeaterCharAlt(exp));

        //==========================Hash Table Implementation==========================================
        //==========================Hash Table Implementation==========================================

        var hash = new HashTableImp(5);

        hash.put(1,"Mosh");
        hash.put(2,"Hai");
        hash.put(12,"ini");
        hash.remove(12);

        System.out.println(hash.get(12));


    }


}
