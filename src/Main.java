public class Main {
    public static void main(String[] args) {
        Node root = new Node(10);
        BinaryTree bt = new BinaryTree();
        bt.root = root;
        bt.insert(root,30);
        bt.insert(root,40);
        bt.insert(root,40);
        bt.insert(root,440);
        bt.insert(root,6);
        bt.insert(root,20);
        bt.insert(root,15);

        bt.inOrderTraversal(root);
        System.out.println();
        bt.preOrderTraversal(root);
        System.out.println();
        bt.postOrderTraversal(root);

    }
}


class BinaryTree<Integer>{
    Node root;
    public Node insert(Node root, int val){
        Node new_Node = new Node(val);
        if(root==null) return new_Node;
        if(root.data>val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }
    public void inOrderTraversal(Node root){
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void postOrderTraversal(Node root){
        if(root == null) return;
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
}

class Node<Integer>{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}