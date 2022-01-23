package com.flank.liststudy;

import com.flank.datacache.Node;

/**
 * 使用链表来实现栈
 * @author flank
 * @date 2021/4/21 13:57
 */
public class MyStack {
    Node top=null;

    /**
     * 进栈
     * @param data
     */
    public void push(int data) {
        Node node = new Node(data);
        node.next=top;
        top=node;
    }

    /**
     * 出栈
     * @return
     */
    public int pop() {
        if (top == null) {
            return -1;
        }
        int value = top.value;
        top = top.next;
        return value;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }


}

