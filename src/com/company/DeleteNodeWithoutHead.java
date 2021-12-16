package com.company;

public class DeleteNodeWithoutHead {
    void deleteNode(Node del) {
        Node nextNode = del.next;
        del.data = nextNode.data;
        del.next = nextNode.next;
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}