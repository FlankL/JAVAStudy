package com.flank.datacache;

/**
 * @author flank
 * @date 2021/4/19 10:44
 */
public class MyList {
    private Node head;

    public void addValue(int value) {
        Node node = new Node(value);
        if (head == null) {
            head=node;
            return;
        }
        Node tmp=head;
        while (tmp.next != null) {
            tmp=tmp.next;
        }
        tmp.next=node;
    }

    public int getLength() {
        int count=0;
        Node tmp=head;
        while (tmp.next != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
    public void printList(){
        Node tmp=head;
        while (tmp.next!=null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public boolean deleteNode(int index) {
        if (index < 1 || index > getLength()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i=0;
        Node preNode=head;
        Node curNode =preNode.next;
        while (curNode.next != null) {
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode=curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addValue(1);
        myList.addValue(2);
        myList.addValue(3);
        myList.addValue(4);

        System.out.println("list 's length: "+ myList.getLength());
        myList.printList();
        myList.deleteNode(2);
        System.out.println("==============================");
        myList.printList();
    }

}
