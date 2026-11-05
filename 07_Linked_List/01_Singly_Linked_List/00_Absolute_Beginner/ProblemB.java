/*ProblemB — Insert Nodes in a Singly Linked List Manually
Absolute Beginner — DSA
Topic: Singly Linked List → Insertion Operations

In your Java Collections Framework practice, you used:
numbers.addFirst(5);
numbers.addLast(60);
numbers.add(3, 25);


Now we will implement these operations manually using Node, head, and next, without importing java.util.LinkedList.
1. Problem statement
Write a Java program named ProblemB.java that performs the following operations:
1. Create a singly linked list containing 10, 20, 30, 40, 50.
2. Insert 5 at the beginning.
3. Insert 60 at the end.
4. Insert 25 at index 3 (zero-based indexing).
5. Display the original and updated linked list.
2. Understand how insertion works */
public class ProblemB {
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
        Node second  = new Node(20);
        Node third  = new Node(30);
        Node fourth  = new Node(40);
        Node fifth = new Node(50);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        //Print Original
        System.out.println("Original List:");
        Node current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        //Step 2: Insert 5 t beginning
        Node newFirst = new Node(5);
        newFirst.next = head;
        head = newFirst;

        //Step 3: Insert at End
        Node newLast = new Node(60);
        current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newLast;

        //Step4: Insert 25 at index 3
        Node newMiddle = new Node(25);
        current = head;

        for(int i = 0; i < 2; i++){
            current = current.next;
        }

        newMiddle.next = current.next;
        current.next = newMiddle;

        //Displaying Updated List
        System.out.print("Updated List: ");
        current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current  = current.next;
        }
        System.out.println("null");
    }
}
