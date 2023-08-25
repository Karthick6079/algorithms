package org.karthick.dsa.avltree;


public class AVLTree {

    private TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }


    static class TreeNode{

        public TreeNode(TreeNode left, int data, TreeNode right, int height) {
            this.left = left;
            this.data = data;
            this.right = right;
            this.height = height;
        }

        TreeNode left;
        int data;
        TreeNode right;
        
        int height;

    }

    public void insert(int key){
        if(this.root == null){
            this.root = new TreeNode(null, key, null, 1);
        }
        this.root = insert(this.root, key);
    }

    private TreeNode insert(TreeNode ptr, int key){

        if(ptr == null){
            ptr = new TreeNode(null, key, null, 1);
            return ptr;
        }

        if( key < ptr.data){
            ptr.left = insert(ptr.left, key);
        } else if (key > ptr.data){
            ptr.right = insert(ptr.right, key);
        }

        ptr.height = nodeHeight(ptr);

        if(balanceFactor(ptr) == 2 && balanceFactor(ptr.left) == 1)
            ptr = llRotation(ptr);
        else if(balanceFactor(ptr) == 2 && balanceFactor(ptr.left) == -1)
            ptr = lrRotation(ptr);
        else if(balanceFactor(ptr) == -2 && balanceFactor(ptr.right) == -1)
            ptr = rrRotation(ptr);
        else if(balanceFactor(ptr) == -2 && balanceFactor(ptr.right) == 1)
            ptr = rLRotation(ptr);


        return ptr;
    }

    private TreeNode rLRotation(TreeNode p) {

        TreeNode pr = p.right;
        TreeNode prl = pr.left;
        TreeNode prll = prl.left;
        TreeNode prlr = prl.right;

        prl.left = p;
        prl.right = pr;
        p.right = prll;
        pr.left = prlr;


        if(this.root == p)
            this.root = prl;

        prl.height = nodeHeight(prl);
        pr.height = nodeHeight(pr);
        p.height = nodeHeight(p);

        return prl;

    }

    private TreeNode rrRotation(TreeNode p) {
        TreeNode pr = p.right;
        TreeNode prl = pr.left;

        pr.left = p;
        p.right = prl;

        if(p == this.root)
            this.root = pr;

        p.height = nodeHeight(p);
        pr.height = nodeHeight(pr);

        return pr;
    }

    private TreeNode lrRotation(TreeNode p) {
        TreeNode pl = p.left;
        TreeNode plr = pl.right;

        pl.right = plr.left;
        p.left = plr.right;
        plr.right = p;
        plr.left = pl;


        if(this.root == p)
            this.root = plr;

        plr.height = nodeHeight(plr);
        pl.height = nodeHeight(pl);
        p.height = nodeHeight(p);

        return plr;
    }

    private TreeNode llRotation(TreeNode p) {
        TreeNode pl = p.left;
        TreeNode plr = pl.right;

        pl.right = p;
        p.left = plr;

        if(p == this.root)
            this.root = pl;

        pl.height = nodeHeight(pl);
        p.height = nodeHeight(p);
        return pl;
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
            node =  search(node.left, key);
        } else if (key > node.data) {
            node = search( node.right, key);
        } else {
            System.out.printf("\nElement %d found", key);
            return node;
        }
        return node;
    }
    
    

    public int nodeHeight(TreeNode node){
        int hl, hr;
        hl = node !=null && node.left != null ? node.left.height : 0;
        hr = node !=null && node.right != null ? node.right.height: 0;

        return hl > hr ? hl + 1: hr + 1;
    }

    public int balanceFactor(TreeNode node){
        int hl, hr;
        hl = node !=null && node.left != null ? node.left.height : 0;
        hr = node !=null && node.right != null ? node.right.height: 0;
        return hl - hr;
    }

    public void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(" " + root.data);
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(TreeNode root){
        if(root != null){
            System.out.print(" " + root.data);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(" " + root.data);
        }
    }

}
