/*Problem 3/8 — Circular Queue Using Array
Now we move to Circular Queue 1/2.
The main goal of this problem is understanding how a circular queue reuses empty array positions.
Problem Statement
Create a Circular Queue using an array of size 5.
Implement:
- enqueue(int value)
- dequeue()
- peek()
- display()
Perform these operations:
enqueue(10)
enqueue(20)
enqueue(30)
enqueue(40)
enqueue(50)

dequeue()
dequeue()

enqueue(60)
enqueue(70)

display()
peek()

The important part is that after removing 10 and 20, the positions at indexes 0 and 1 should be reused. */
public class CircularQueue {

    int[] queue = new int[5];

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
            System.out.println("Queue is full");
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
            System.out.println("Queue is empty");
            return;
        }

        System.out.println(queue[front] + " removed from queue");

        // Only one element is present
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    // Display front element
    public void peek() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element: " + queue[front]);
    }

    // Display queue
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

        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.dequeue();
        q.dequeue();

        q.enqueue(60);
        q.enqueue(70);

        q.display();
        q.peek();
    }
}
