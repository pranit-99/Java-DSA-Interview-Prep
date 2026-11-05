/*Problem 1 — Forward Traversal
Problem Statement
Create:
10 ⇄ 20 ⇄ 30 ⇄ 40

as a Circular Doubly Linked List and traverse it forward once. */
public class CircularDoubly {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        //Create Node
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        //Connect nodes forward
        first.next = second;
        second.next = third;
        third.next = fourth;

        // Connect nodes backward
        second.prev = first;
        third.prev = second;
        fourth.prev = third;

        //Head and tail
        Node head = first;
        Node tail = fourth;

        //Make the list Circular
        tail.next = head;
        head.prev = tail;

        //Forward transversal
        Node current = head;

       do { 
           System.err.println(current.data);
           current = current.next;
       } while (current != head);

    }
}
