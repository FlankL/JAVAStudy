package com.flank.liststudy;

import com.flank.datacache.Node;

/**
 * 使用链表来实现队列
 *
 * @author flank
 * @date 2021/4/21 14:03
 */
public class MyQueue {
    Node top = null;

    public void push(int data) {
        Node node = new Node(data);
        if (top == null) {
            top = node;
            return;
        }
        Node tmp=top;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next=node;
    }

    public int pop() {
        if (top != null) {
            int value = top.value;
            top = top.next;
            return value;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }
}
