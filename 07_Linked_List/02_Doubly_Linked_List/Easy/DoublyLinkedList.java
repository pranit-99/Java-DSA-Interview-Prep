/*Problem Statement
Create:
null ← 10 ⇄ 20 ⇄ 30 ⇄ 40 → null

Traverse from head and print:
10
20
30
40

Solution */
public class DoublyLinkedList {

    static class Node {

        int data;
        @SuppressWarnings("unused")
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
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Connect first and second
        first.next = second;
        second.prev = first;

        // Connect second and third
        second.next = third;
        third.prev = second;

        // Connect third and fourth
        third.next = fourth;
        fourth.prev = third;

        // Head points to first node
        Node head = first;

        // Traverse forward
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
