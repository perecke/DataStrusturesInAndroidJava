package com.example.datastructuresinandroid.graphs;

import java.util.Stack;

/**
 * DepthFirstSearch
 */

public class DepthFirstSearch {
    int size;
    AdjustList[] array;
    public DepthFirstSearch(int size) {
        this.size = size;
        array = new AdjustList[size];

        for (int i = 0; i < size; i++) {
            array[i] = new AdjustList();
            array[i].head = null;
        }
    }

    public void add(int src, int dest) {
        Node n = new Node(dest, null);
        n.next = array[src].head;
        array[src].head = n;
    }

    public void depthForSearchExplore(int startVertex) {
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++) {
            visited[i] = false;
        }

        Stack<Integer> trackedNodes = new Stack<>();
        trackedNodes.push(startVertex);
        while (!trackedNodes.isEmpty()) {
            int n = trackedNodes.pop();
            trackedNodes.push(n);
            visited[n] = true;
            Node head = array[n].head;
            boolean isDone = true;

            while (head != null) {
                if (!visited[head.value]) {
                    trackedNodes.push(head.value);
                    visited[head.value] = true;
                    isDone = false;
                    break;
                } else {
                    head = head.next;
                }
            }
            if (isDone) {
                int out = trackedNodes.pop();
                System.out.println("Julia visited node: " + out);
            }
        }
    }
}
