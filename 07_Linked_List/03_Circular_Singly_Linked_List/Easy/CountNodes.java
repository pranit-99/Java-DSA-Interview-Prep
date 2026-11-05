/*Problem 2 — Count Nodes in a Circular Singly Linked List
Problem Statement
Given:
5 → 10 → 15 → 20 → 25
↑                   ↓
└───────────────────┘

Count the total number of nodes.
Expected Output
Total Nodes: 5 */
public class CountNodes {
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

        // Make circular
        fifth.next = first;

        Node head = first;
        int count = 0;
        Node current = head;
        do { 
            count++;
            current = current.next;
        } while (current != head);
        System.out.println("Total Nodes: " + count);
    }
}
