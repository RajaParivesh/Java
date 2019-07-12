package collections;

import collections.tree.Node;

public class TreeRun {

    public static void testTree(){
        Node n = new Node(1);
        n.insert(5);
        n.insert(2);
        n.insert(8);
        n.insert(3);
        n.insert(7);
        n.insert(0);
//        n.printInOrder();
        n.printPreOrder();
    }
    public static void main(String[] args) {
        testTree();
    }
}

