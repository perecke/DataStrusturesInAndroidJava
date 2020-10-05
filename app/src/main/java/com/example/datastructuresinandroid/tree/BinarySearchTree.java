package com.example.datastructuresinandroid.tree;

import java.util.ArrayList;

/**
 * Binary search tree
 */

public class BinarySearchTree {
    public Node root;
    ArrayList<Integer> visitedNodes = new ArrayList<>();
    int steps = 0;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node createRootNode(int value) {
        return new Node(value, null, null);
    }

    public void displayResult() {
        System.out.println("Julia visited: " + visitedNodes);
        System.out.println("Julia steps: " + steps);
    }


    /**
     * Example: path between 4 and 6 valued node
     * foundPath(4, bst.root)
     * foundPath(6, bst.root)
     * displayResult();
     */
    public void foundPath(int searcValue, Node currentNode) {

        if (!visitedNodes.contains(currentNode.getValue())) {
            steps++;
            visitedNodes.add(currentNode.getValue());
        } else {
            steps--;
        }
        if (currentNode.getValue() == searcValue) {
            return;
        }

        if (searcValue > currentNode.getValue()) { //should be on the RIGHt side because it is greater
            foundPath(searcValue, currentNode.getRight());
        }

        if (searcValue < currentNode.getValue()) { //should be on the LEFT side because it is smaller
            foundPath(searcValue, currentNode.getLeft());
        }
    }

    public void add(int value, Node rootClone) {
        if (root == null) {
            root = new Node(value, null, null);
            return;
        }

        if (value > rootClone.getValue()) { //should be on the RIGHt side because it is greater
            if (rootClone.getRight() == null) {
                rootClone.setRight(new Node(value, null, null));
            }
            add(value, rootClone.getRight());
        }

        if (value < rootClone.getValue()) { //should be on the LEFT side because it is smaller
            if (rootClone.getLeft() == null) {
                rootClone.setLeft(new Node(value, null, null));
            }
            add(value, rootClone.getLeft());
        }
    }

    public void addNode(Node start, Node newNode) {
        if (root == null) {
            root = newNode;
            return;
        }

        if (newNode.getValue() > start.getValue()) { //should be on the RIGHt side because it is greater
            if (start.getRight() == null) {
                start.setRight(newNode);
            }
            addNode(start.getRight(), newNode);
        }

        if (newNode.getValue() < start.getValue()) { //should be on the LEFT side because it is smaller
            if (start.getLeft() == null) {
                start.setLeft(newNode);
            }
            addNode(start.getLeft(), newNode);
        }
    }

    public void search(int value, Node start) {
        if (start == null) {
            System.out.println("Julia not found");
            return;
        }
        if (value == start.getValue()) {
            System.out.println("Julia found: " + value);
            return;
        }
        if (value > start.getValue()) { //go to the right side
            search(value, start.getRight());
        }
        if (value < start.getValue()) { //go to the left side
            search(value, start.getLeft());
        }
    }
}
