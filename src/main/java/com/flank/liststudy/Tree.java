package com.flank.liststudy;

/**
 * @author flank
 * @date 2021/4/21 10:45
 */
public class Tree {
    //这棵树的根节点
     TreeNode root=null;
    /**
     * 树的节点内部类
     */
    private class TreeNode{
        private String value=null;
        private boolean isVisted=false;
        private TreeNode leftNode=null;
        private TreeNode rightNode = null;

        public TreeNode(String value) {
            this.value = value;
        }
    }

    /**
     * 创建一个二叉树
     *       A
     *    B     C
     * D    E     F
     */
    public void createBinTree() {
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");

        this.root=a;
        root.leftNode=b;
        root.rightNode = c;
        b.leftNode=d;
        b.rightNode=e;
        c.rightNode=f;
    }

    /**
     * 返回树的高度
     */
    public int height(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        } else {
            int i = height(treeNode.leftNode);
            int j = height(treeNode.rightNode);
            return (i < j) ? (j + 1) : (i + 1);
        }
    }

    /**
     * 返回节点的个数
     */
    public int size(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        } else {
            return 1 + size(treeNode.leftNode) + size(treeNode.rightNode);
        }
    }

    /**
     * 先根遍历
     */
    public void preOrder(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.print(treeNode.value);
            preOrder(treeNode.leftNode);
            preOrder(treeNode.rightNode);
        }
    }

    /**
     * 中根遍历
     */
    public void inOrder(TreeNode treeNode) {
        if (treeNode != null) {
            inOrder(treeNode.leftNode);
            System.out.print(treeNode.value);
            inOrder(treeNode.rightNode);
        }
    }

    /**
     * 后根遍历
     */
    public void backOrder(TreeNode treeNode) {
        if (treeNode != null) {
            backOrder(treeNode.leftNode);
            backOrder(treeNode.rightNode);
            System.out.print(treeNode.value);
        }
    }

}
