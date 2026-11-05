/*Problem 2 — Implement Stack Using Linked List
Since you just completed Linked Lists, this implementation should connect both concepts.
Problem Statement
Create a Stack using a Singly Linked List.
Implement:
- push(int value)
- pop()
- peek()
- isEmpty()
- display()
Unlike the array implementation, we don't need a fixed capacity. */
public class LinkedListStack {
    //Node class
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    //Push Element
    public void push(int value){
        Node newNode  = new Node(value);

        newNode.next = top;
        top = newNode;

        System.out.println(value + "pushed into stack");
    }

    //pop element
    public void pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data + "Popped from stack");
        top = top.next;
    }

    //peek top element
    public void peek(){
        if(top == null){
           System.out.println("Stack is empty");
            return; 
        }
        System.out.println("Top element: " + top.data);
    }

    // Check if empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack
    public void display() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node current = top;

        System.out.println("Stack elements:");

        while (current != null) {

            System.out.println(current.data);

            current = current.next;
        }
    }

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();

        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
