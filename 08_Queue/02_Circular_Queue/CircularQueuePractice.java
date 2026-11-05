/*Overflow + Underflow
This is our second and final basic Circular Queue problem. We'll reinforce the three important concepts:
wrap-around → overflow → underflow
Problem Statement
Create a Circular Queue of size 4.
Perform: */
public class CircularQueuePractice {

    int[] queue = new int[4];

    int front = -1;
    int rear = -1;

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return (rear + 1) % queue.length == front;
    }

    // Add element
    public void enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add " + value);
            return;
        }

        // First element
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % queue.length;
        }

        queue[rear] = value;

        System.out.println(value + " added to queue");
    }

    // Remove element
    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty");
            return;
        }

        System.out.println(queue[front] + " removed from queue");

        // Only one element present
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    // Display elements
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueuePractice q = new CircularQueuePractice();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        // Overflow
        q.enqueue(50);

        q.dequeue();
        q.dequeue();

        // Reuse empty positions
        q.enqueue(50);
        q.enqueue(60);

        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        // Underflow
        q.dequeue();
    }
}