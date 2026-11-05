/*ProblemD — Modify Node Data in a Singly Linked List Manually
Absolute Beginner — DSA
Topic: Singly Linked List → Traversal and Updating Node Data

In your Java Collections Framework practice, you used:
numbers.set(1, 25);
numbers.set(3, 45);
numbers.set(numbers.size() - 1, 100);


Now we will implement the same operations manually using Node, head, current, next, and data, without importing java.util.LinkedList.
1. Problem statement
Write a Java program named ProblemD.java that performs the following operations:
1. Create a singly linked list containing 10, 20, 30, 40, 50, 60.
2. Display the original linked list.
3. Replace the value at index 1 with 25.
4. Replace the value at index 3 with 45.
5. Replace the last node's value with 100.
6. Display the updated linked list.
7. Count and display the total number of nodes.
2. Understand how updating nodes works
Remember our previous discussion:
- current = current.next → Moves to the next node.
- current.data → Accesses the current node's value.
- current.data = newValue → Changes the value stored in the current node.
Important: Updating node data does not change the next references or the number of nodes. */
public class ProblemD {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
        //Creating Nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        System.out.print("Original List:-" );

        Node current  = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");

        //Update index 1 with 25;
        current = head;

        for(int i = 0; i < 1; i++){
            current = current.next;
        }

        current.data = 25;

        //Update index 3 with 45
        current  = head;
        for(int i = 0; i < 3; i++){
            current = current.next;
        }
        current.data = 45;

        //Update last node with 100;
        current = head;
        while(current.next != null){
            current = current.next;
        }
        current.data = 100;

        // Step 6: Display Updated List
        System.out.println("Updated List: ");

        current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");

        // Step 7: Count Total Nodes
        int count = 0;
        current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        System.out.println("Total Nodes: " + count);
    }
}
