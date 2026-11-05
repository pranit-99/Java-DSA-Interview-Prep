/*ProblemC — Access Elements in a Singly Linked List Manually
Absolute Beginner — DSA
Topic: Singly Linked List → Traversal and Accessing Nodes

In your Java Collections Framework practice, you used:
numbers.getFirst();
numbers.getLast();
numbers.get(2);
numbers.get(4);


Now we will perform these operations manually using Node, head, next, and traversal, without importing java.util.LinkedList.
1. Problem statement
Write a Java program named ProblemC.java that performs the following operations:
1. Create a singly linked list containing 10, 20, 30, 40, 50, 60.
2. Retrieve the first node's value.
3. Retrieve the last node's value.
4. Retrieve the value at index 2.
5. Retrieve the value at index 4.
6. Display all retrieved values.
2. Understand how accessing nodes works
Green nodes represent the elements at indexes 2 and 4.
Operation 1 — Access the first node */
public class ProblemC {
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
        Node third  = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        //Step 2: Display Original List
        System.out.println("Original List");
        Node current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");

        //First Element
        System.out.println("First Element: " + head.data);

        //Access LAst Element
        current = head;

        while(current.next != null){
            current = current.next;
        }
        System.out.println("Last Element: " + current.data);

        //Access Index 2
        current = head;
        for(int i = 0; i < 2; i++){
            current = current.next;
        }

        System.out.println("Element at Index 2:" + current.data);

        //Access Index 4
        current = head;
        for(int i = 0; i < 4; i++){
            current = current.next;
        }

        System.out.println("Element at index 4:" + current.data);
    }
}
