import nodes.Node;
import trees.BST;

public class Main {
    public static void main(String[] args) {
        Node root = null;
        BST bst = new BST();
        int[] values = {10,20, 80, 15, 19, 22};
        for(int value: values) root = bst.insert(root, value);
        bst.inOrderTraversal(root);
        System.out.println("Hello world!");
    }
}
