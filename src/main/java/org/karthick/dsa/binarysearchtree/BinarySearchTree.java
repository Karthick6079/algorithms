package org.karthick.dsa.binarysearchtree;

public class BinarySearchTree {

    static class TreeNode{

        public TreeNode(TreeNode left, int data, TreeNode right) {
            this.left = left;
            this.data = data;
            this.right = right;
        }

        TreeNode left;
        int data;
        TreeNode right;

    }


    private TreeNode root = null;

    public void insert(int key){
        if(root == null){
            root = new TreeNode(null, key, null);
        }
        root = insert(root, key);
    }

    public TreeNode search(int key){
        if(root == null){
            System.out.printf("\nElement %d not found", key);
        }

        if(root.data == key) {
            System.out.printf("\nElement %d found", key);
            return root;
        }

        return search(this.root, key);
    }

    private TreeNode search(TreeNode node, int key) {
        if (node == null){
            System.out.printf("\nElement %d not found", key);
            return null;
        }

        if(key < node.data){
            node = search(node.left, key);
        } else if (key > node.data) {
            node = search( node.right, key);
        } else {
            System.out.printf("\nElement %d found", key);
            return node;
        }

        return node;
    }


    private TreeNode insert(TreeNode root, int key){

        TreeNode ptr = root;

        if(ptr == null){
            ptr = new TreeNode(null, key, null);
            return ptr;
        }

        if( key < ptr.data){
            ptr.left = insert(ptr.left, key);
        } else if (key > ptr.data){
            ptr.right = insert(ptr.right, key);
        }
        return ptr;
    }
    public void inOrderTraversal(){
        inOrderTraversal(this.root);
    }

    public void preOrderTraversal(){
        preOrderTraversal(this.root);
    }

    public void postOrderTraversal(){
        postOrderTraversal(this.root);
    }


    private void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(" " + root.data);
            inOrderTraversal(root.right);
        }
    }

    private void preOrderTraversal(TreeNode root){
        if(root != null){
            System.out.print(" " + root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(" " + root.data);
        }
    }

    public void delete(int key){
        root  = delete(this.root, key);

    }

    private TreeNode delete(TreeNode root, int key){

        if(root == null)
            return null;

        if(root.left == null && root.right == null){
            if(this.root == root){
                this.root = null;
            }
            return null;
        }


        if(key < root.data){
            root.left = delete(root.left, key);
        } else if (key > root.data){
            root.right = delete(root.right, key);
        } else {
            if(height(root.left) > height(root.right)){
                TreeNode inOrderPredecessor = inOrderPredecessor(root.left);
                root.data = inOrderPredecessor.data;
                root.left = delete(root.left, inOrderPredecessor.data);
            } else{
                TreeNode inOrderSuccessor = inOrderSuccessor(root.right);
                root.data = inOrderSuccessor.data;
                root.right = delete(root.right, inOrderSuccessor.data);
            }
        }
        return root;
    }

    private int height(TreeNode root) {
        if(root == null)
            return 0;

        int x = height(root.left);
        int y = height(root.right);

        return x>y ? x+1: y+1;
    }

    private TreeNode inOrderPredecessor(TreeNode node){
        while(node != null && node.right != null){
            node = node.right;
        }
        return node;
    }
    private TreeNode inOrderSuccessor(TreeNode node){
        while(node != null && node.left != null){
            node = node.left;
        }
        return node;
    }

}
