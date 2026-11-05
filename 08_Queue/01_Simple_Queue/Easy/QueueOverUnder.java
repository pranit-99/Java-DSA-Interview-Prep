/*Problem 2/8 — Simple Queue: Overflow & Underflow
This problem focuses specifically on understanding isFull(), isEmpty(), Queue Overflow, and Queue Underflow.
Problem Statement
Create a simple queue using an array of size 3.
Implement:
- enqueue(int value)
- dequeue()
- isFull()
- isEmpty()
- display() */
public class QueueOverUnder {
    int queue[] = new int[3];
    int front = -1;
    int rear = -1;

    //Check if queue is full
    public boolean isFull(){
        return rear == queue.length -1;
    }

    //check if queue is empty
    public boolean isEmpty(){
        return front == -1 || front > rear;
    }

    public void enqueue(int value){
        if (isFull()){
            System.out.println("Queue Overflow! Cannot add " + value);
            return;
        }

        if(front == -1){
            front  = 0;
        }

        rear++;
        queue[rear] = value;
        System.out.println(value + "added to queue");
    }

    //Remove element
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow! Queue is empty");
            return;
        }
        System.out.println(queue[front] + " removed from queue");
        front++;
    }

    // Display queue
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueOverUnder q = new QueueOverUnder();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);

        // Queue is already full
        q.enqueue(400);

        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();

        // Queue is already empty
        q.dequeue();
    }
}
