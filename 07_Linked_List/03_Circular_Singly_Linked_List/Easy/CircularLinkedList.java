/*Problem 1 — Create and Traverse a Circular Singly Linked List
Problem Statement
Create:
10 → 20 → 30 → 40
↑              ↓
└──────────────┘

Traverse it once and print all nodes. */
public class CircularLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        //Create Nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        //Connect nodes
        first.next = second;
        second.next = third;
        third.next = fourth;

        //circuler
        fourth.next = first;

        Node head = first;

        //Transverse circular linked list
        Node current = head;

        do { 
            System.err.println(current.data);
            current = current.next;
        } while (current != head);
    }
}
