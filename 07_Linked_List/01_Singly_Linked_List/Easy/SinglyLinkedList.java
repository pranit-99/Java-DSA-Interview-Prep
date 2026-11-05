/*Problem 1 — Create and Traverse a Singly Linked List
Problem Statement:
Create a Singly Linked List containing:
10 → 20 → 30 → 40 → null

Then traverse the Linked List and print every element.
Expected Output:
10
20
30
40

What you need to practice
You should:
1. Create a Node class containing:
int data;
Node next;

2. Create four nodes.
3. Connect them using next.
4. Create a head pointing to the first node.
5. Use a current reference and while loop to traverse. */
public class SinglyLinkedList {
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

        //Connect Nodes
        first.next = second;
        second.next = third;
        third.next = fourth;

        //Head points to first node
        Node head = first;

        //transverse thi list
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
