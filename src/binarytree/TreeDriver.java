/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author J392018
 */
public class TreeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        
        root.setLeft(node2);
        node2.setLeft(node4);
        node2.setRight(node5);
        node5.setLeft(node7);
        root.setRight(node3);
        node3.setRight(node6);
        
        root.printInorder(root);
        System.out.println();
        root.printPostorder(root);
        System.out.println();
        root.printPreorder(root);
        
        System.out.println();
        root.print();
        */
        
        System.out.println("Create Tree");
        BTree tree = new BTree();
        
        System.out.println("Count nodes in empty tree");
        System.out.println(tree.countNode());
        
        System.out.println("Create Nodes with data 1");
        Node root = new Node(1);
        
        System.out.println("Set node as root");
        tree.setRoot(root);
        
        System.out.println("Count nodes in tress with only root added");
        System.out.println(tree.countNode());
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        
        root.setLeft(node2);
        node2.setLeft(node4);
        node2.setRight(node5);
        node5.setLeft(node7);
        root.setRight(node3);
        node3.setRight(node6);
        
        System.out.println("Set the current node to be the root");
        tree.setCurrent(tree.getRoot());
        
        System.out.println("Display the current node");
        System.out.println(tree.getCurrent().getData());
        
        Node currentNode = tree.getCurrent();
        
        System.out.println("Count nodes in tree with 7 nodes added");
        System.out.println(tree.countNode());
        
        System.out.println("In Order print");
        tree.printInorder();
        
        System.out.println("\nPre order print");
        tree.printPreorder();
        
        System.out.println("\nPost order print");
        tree.printPostorder();
        
        System.out.print("\nDisplay the nodes as tree diagram\n");
        tree.print();
    }
    
}
