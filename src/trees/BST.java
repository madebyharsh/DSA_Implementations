package trees;

import interfaces.Tree;
import nodes.BSTNode;
import nodes.Node;

public class BST implements Tree {
    BSTNode root;

    public BST() {
        this.root = null;
    }

    @Override
    public Node insert(Node root, int val) {
        if (root == null) return new BSTNode(val);
        else if (root.value > val) {
            root.left =  insert(root.left, val);
        } else root.right = insert(root.right, val);
        return root;
    }

    @Override
    public void traverse(Node root) {

    }

    @Override
    public void search(int val) {

    }
    public void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.value+" ");
        inOrderTraversal(root.right);
    }
}
