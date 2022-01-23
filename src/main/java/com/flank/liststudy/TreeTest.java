package com.flank.liststudy;

/**
 * @author flank
 * @date 2021/4/21 11:05
 */
public class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.createBinTree();
        int height = tree.height(tree.root);
        System.out.println("height = " + height);
        int size = tree.size(tree.root);
        System.out.println("size = " + size);

        System.out.println("------------------------先根遍历：ABDECF-----------------------");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("------------------------中根遍历：DBEACF-----------------------");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("------------------------后根遍历：DEBFCA -----------------------");
        tree.backOrder(tree.root);
    }
}
