/*Problem 2 — Backward Traversal
Problem Statement
Create:
5 ⇄ 10 ⇄ 15 ⇄ 20

as a Circular Doubly Linked List.
Start from tail and traverse backward once. */
public class CircularDoublyBackward {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Create nodes
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);

        // Forward connections
        first.next = second;
        second.next = third;
        third.next = fourth;

        // Backward connections
        second.prev = first;
        third.prev = second;
        fourth.prev = third;

        Node head = first;
        Node tail = fourth;

        // Make circular
        tail.next = head;
        head.prev = tail;

        // Start from tail
        Node current = tail;

        // Traverse backward
        do {

            System.out.println(current.data);

            current = current.prev;

        } while (current != tail);
    }
}
