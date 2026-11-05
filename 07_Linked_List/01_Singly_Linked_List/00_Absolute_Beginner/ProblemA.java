/*ProblemA — Create a Singly Linked List Manually
Absolute Beginner
Objective: Understand how nodes are created, how next connects them, and how head identifies the beginning of the list.
1. Understand the structure
A singly linked list consists of nodes. Every node contains two fields:
- data: Stores the value.
- next: Stores a reference to the next node.
Each arrow represents a next reference, not a physical memory connection. 
10 -> 20 -> 30 -> 40 -> 50 -> null
*/
public class ProblemA {
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

        //Display Linked List
        Node current = head;
        int count = 0;

        while(current != null){
            System.out.print(current.data + " ->");
            count++;
            current = current.next;
        }
        System.out.println("null");

        System.out.println("Total Nodes: " + count);
        System.out.println("Is Empty: " + (count == 0));
    }
}
