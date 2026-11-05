/*ProblemE — Delete Nodes in a Singly Linked List Manually
Absolute Beginner — DSA
Topic: Singly Linked List → Node Deletion and Reference Management

This is the fifth and final guided problem in your first series. After this, you will start solving problems independently.

In your Java Collections Framework practice, you used:
numbers.removeFirst();
numbers.removeLast();
numbers.remove(2);
numbers.remove(Integer.valueOf(60));


Now we will implement these four operations manually using Node, head, current, and next, without importing java.util.LinkedList.
1. Problem statement
Write a Java program named ProblemE.java that performs the following operations:
1. Create a singly linked list containing 10, 20, 30, 40, 50, 60, 70, 80.
2. Display the original linked list.
3. Delete the first node.
4. Delete the last node.
5. Delete the node at index 2.
6. Delete the node containing value 60.
7. Display the updated linked list.
8. Count the remaining nodes.
Expected output
Original List: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> null
Updated List: 20 -> 30 -> 50 -> 70 -> null
Total Nodes: 4 */
public class ProblemE {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]){
        Node head = new Node(10);
         Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        Node seventh = new Node(70);
        Node eighth = new Node(80);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;

        // Step 2: Display Original List
        System.out.print("Original List: ");

        Node current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.print("null");

        //Step 3: Delete First Node
        head = head.next;

        //Step 4: Delete Last Node
        current = head;

        while(current.next.next != null){
            current = current.next;
        }

        current.next = null;

        //Step 5: Delete Node at Index 2
        current = head;
        for (int i = 0; i < 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;

        //Step 6: Delete Node with value 60
        current = head;
        while(current.next != null && current.next.data != 60){
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        }

        //Step 7: Display Updated List
        System.out.print("Updated List: ");
        current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Step 8: Count Remaining Nodes
        int count = 0;
        current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Total Nodes: " + count);
    }
    }

