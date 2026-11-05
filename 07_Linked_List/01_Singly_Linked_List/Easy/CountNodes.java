/*Problem 2 — Count Nodes in a Singly Linked List
Problem: Given:
5 → 10 → 15 → 20 → 25 → null

count the total number of nodes.
Expected:
Total Nodes: 5 */
public class CountNodes {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Create nodes
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        // Connect nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node head = first;

        // Count nodes
        int count = 0;
        Node current = head;

        while (current != null) {

            count++;

            current = current.next;
        }

        System.out.println("Total Nodes: " + count);
    }
}
