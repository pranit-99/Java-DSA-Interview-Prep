/*Problem 2 — Traverse a Doubly Linked List Backward
Problem Statement
Given:
null ← 5 ⇄ 10 ⇄ 15 ⇄ 20 → null

Start from the tail and print the values backward.
Expected Output
20
15
10
5 */
public class ReverseTraversal {

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

        // Connect first and second
        first.next = second;
        second.prev = first;

        // Connect second and third
        second.next = third;
        third.prev = second;

        // Connect third and fourth
        third.next = fourth;
        fourth.prev = third;

        // Head and Tail
        Node head = first;
        Node tail = fourth;

        // Start from tail
        Node current = tail;

        // Traverse backward
        while (current != null) {

            System.out.println(current.data);

            current = current.prev;
        }
    }
}
