package interfaces;

import nodes.Node;

public interface Tree {
    public Node insert(Node root, int val);
    void traverse(Node root);
    void search(int val);
}
