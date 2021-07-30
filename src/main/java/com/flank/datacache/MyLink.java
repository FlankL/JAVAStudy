package com.flank.datacache;

import org.junit.Test;

/**
 * @author flank
 * @date 2021/4/19 10:00
 */
public class MyLink {
    Node head = null;

    /**
     * 向链表中添加数据
     *
     * @param data
     */
    public void addNode(int data) {
        Node node = new Node(data);
        //先判断是否有元素
        if (head == null) {
            head = node;
            return;
        }
        //如果有元素就找到最后一个 元素
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        //找到最后一个节点
        tmp.next = node;
    }

    /**
     * 返回链表的长度
     *
     * @return
     */
    public int getLength() {
        int count = 0;
        Node tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    /**
     * 删除第index个节点
     *
     * @param index
     * @return
     */
    public boolean deleteNode(int index) {
        // index合法性判断
        if (index < 1 || index > getLength()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int count = 1;
        Node preNode = head;//当前节点的前一个节点
        Node curNode = preNode.next;//当前节点
        while (curNode != null) {
            if (count == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            count++;
        }
        return false;
    }

    /**
     * 打印链表中的数据
     */
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }


    /**
     * 在不知道头节点的情况下删除指定节点
     *
     * @param node
     * @return
     */
    public boolean deleteNode2(Node node) {
        if (node == null || node.next == null) {
            return false;
        }
        int tmp = node.value;
        node.value = node.next.value;
        node.next = node.next.next;
        System.out.println("删除成功");
        return true;
    }

    /**
     * 反转单链表:采用指针的方式实现单链表
     */
    public void reverse() {
        // Node pre=head;
        // Node curr = head.next;
        Node pre = null;//如果不设置为null会有循环依赖的问题
        Node curr = head;
        while (curr != null) {
            //记录下个节点
            Node tmp = curr.next;
            //反转，让下一个节点指向前
            curr.next = pre;
            //指針移动
            pre = curr;
            curr = tmp;
        }
        head = pre;
    }

    /**
     * 单链表反转之：部分链表反转
     */
    public void reversePart(int k) {
        Node pre = null;
        Node curr = head;
        int count = 0;
        while (curr != null) {
            Node tmp = curr.next;
            if (k == count) {
                break;
            }
            curr.next = pre;
            count++;
            pre = curr;
            curr = tmp;
        }
        head.next = curr;
        //pre就是最后一个节点，也就是反转后的头节点
        head = pre;
    }

    /**
     * 采用快慢指针的方式查找链表的中间节点，快指针一次走两步，慢指针一次走一步，快指针走完时，慢指针刚好到达中间节点
     */
    public int searchMid() {
        Node quick = head;
        Node slow = head;
        while (quick != null && quick.next != null && quick.next.next != null) {
            quick = quick.next.next;
            slow = slow.next;
        }
        return slow.value;
    }

    /**
     * 找到链表的倒数第K个元素
     */
    public int getValue(int index) {
        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < index; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.value;
    }

    /**
     * 使用冒泡排序对链表中的元素进行排序
     */
    public void sort() {
        Node p1 = head;
        while (p1 != null) {
            Node p2 = p1.next;
            while (p2 != null) {
                if (p2.value < p1.value) {
                    int tmp = p1.value;
                    p1.value = p2.value;
                    p2.value = tmp;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
        }
    }

    /**
     * 删除链表中的重复节点
     */
    public void deleteCopy() {
        Node p1 = head;
        while (p1 != null) {
            Node curr = p1;
            while (curr.next != null) {
                if (p1.value == curr.next.value) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }
            p1 = p1.next;
        }
    }

    /**
     * 倒着输出链表 -采用递归的方式
     */
    public void printReverse(Node node) {
        if (node != null) {
            printReverse(node.next);
            System.out.println(node.value);
        }
    }

    /**
     * 判断链表是否存在环
     */
    public boolean judgeCircle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {

            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取环的长度
     */
    public int getCircleLength() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        // 碰撞点一定在环内，以碰撞点开始出发等到最后又回到碰撞点的时候就是环的长度
        int count = 0;
        Node tmp = slow;//快慢指针的碰撞点
        while (tmp != null) {
            tmp = tmp.next;
            count++;
            if (tmp == slow) {
                break;
            }
        }
        return count;
    }

    /**
     * 获取环的入口点
     */
    public int getStart() {
        Node fast = head;
        Node slow = head;
        //找碰撞点
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        //找到碰撞点之后重新触发
        Node tmp=head;
        while (tmp != null) {
            if (slow == tmp) {
                break;
            }
            slow = slow.next;
            tmp = tmp.next;
        }
        return tmp.value;

    }

    /**
     * 用来测试单链表是否存在环
     */
    @Test
    public void testCircle() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        MyLink myLink = new MyLink();
        myLink.head = node1;
        //判断是否存在环
        System.out.println("是否存在环： "+myLink.judgeCircle());
        //判断环的长度
        System.out.println("环的长度： "+myLink.getCircleLength());
        //判断环的入口点
        System.out.println("环的入口点： "+myLink.getStart());

    }


    public static void main(String[] args) {
        MyLink myLink = new MyLink();
        myLink.addNode(1);
        myLink.addNode(3);
        myLink.addNode(3);
        myLink.addNode(3);
        myLink.addNode(5);

        System.out.println("linkLength: " + myLink.getLength());
        myLink.printList();
        // myLink.deleteNode(2);
        System.out.println("-------------------------------------");
        myLink.printList();
        System.out.println("-------------searchmid------------------------");
        System.out.println(myLink.searchMid());
        // System.out.println("-------------reverse------------------------");
        // myLink.reversePart(2);
        // myLink.printList();

        System.out.println("---------------返回倒数第k个元素---------------");
        System.out.println(myLink.getValue(4));

        // System.out.println("---------------排序前---------------");
        // myLink.printList();
        // System.out.println("---------------排序后---------------");
        // myLink.sort();
        // myLink.printList();

        System.out.println("--------------删除重复节点后-----------");
        myLink.deleteCopy();
        myLink.printList();

        myLink.printReverse(myLink.head);

    }


}
