package com.flank.liststudy.linkedlist;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 单链表实现
 *
 * @author flank
 * @date 2021/6/30 14:22
 */
public class Link {
    Node head=null;
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addNode(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        }
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        current.next = node;
    }

    public int getLength() {
        int count=1;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean removeNode(int index) {
        if (index <1||index >getLength()) {
            return false;
        }
        if (index == 1) {
            head=head.next;
            return true;
        }
        Node current = head;
        int count=1;
        Node nextNode = head.next;
        while (current != null) {
            if (count == index) {
                current.next = nextNode.next;
                return true;
            }
            count++;
            current=nextNode;
            nextNode=nextNode.next;
        }
        return false;
    }

    public void reverse(){
        Node preNode=null;
        Node current = head;
        while (current != null) {
            Node tmp = current.next;
            current.next=preNode;
            preNode=current;
            current=tmp;
        }
        head=preNode;
    }

    public int searchMid(){
        Node quick=head;
        Node slow=head;
        while (quick != null && quick.next != null && quick.next.next != null) {
            quick = quick.next.next;
            slow = slow.next;
        }
        return slow.value;

    }



}
