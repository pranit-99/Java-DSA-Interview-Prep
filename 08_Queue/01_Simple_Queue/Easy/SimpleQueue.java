/*Problem Statement
Create a Simple Queue using an integer array with a capacity of 5.
Implement these operations:
- enqueue(int value) — add an element at the rear.
- dequeue() — remove an element from the front.
- peek() — display the front element.
- display() — display all elements currently in the queue.
Perform these operations:
enqueue(10)
enqueue(20)
enqueue(30)
enqueue(40)

dequeue()

peek()

display()

Expected Output
10 added to queue
20 added to queue
30 added to queue
40 added to queue

10 removed from queue

Front element: 20

Queue: 20 30 40 */
public class SimpleQueue {
    int queue[] = new int[5];
    int front = -1;
    int rear = -1;

    //Add element to queue
    public void enqueue(int value){
        if(rear == queue.length - 1){
            System.out.println("Queue id full");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear++;
        queue[rear]  = value;
        System.out.println(value + " added to queue");
    }

    //Remove element from queue
    public void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queue[front] + "removed from queue");
        front++;
    }

    //Display front element
    public void peek(){
        if(front == -1 || front > rear){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    //Display
    public void display(){
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

}
