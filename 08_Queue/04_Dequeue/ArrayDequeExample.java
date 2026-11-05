/*Deque Using Array
Now we move to Deque 1/2.
Deque = Double-Ended Queue, meaning we can insert and remove elements from both ends.
          DEQUE

Front                    Rear
  ↓                        ↓
[10] [20] [30] [40]

↑                         ↑
Insert/Delete       Insert/Delete

Problem Statement
Create a Deque using an array of size 5.
Implement:
insertFront()
insertRear()

deleteFront()
deleteRear()

display()

Perform:
insertRear(20)
insertRear(30)

insertFront(10)
insertFront(5)

display()

deleteFront()
deleteRear()

display()

Expected logical result:
After insertion:
5 10 20 30

After deletion:
10 20 */
public class ArrayDequeExample {

    int[] deque = new int[5];

    int front = -1;
    int rear = -1;


    // Check if deque is empty
    public boolean isEmpty() {
        return front == -1;
    }


    // Check if deque is full
    public boolean isFull() {

        return (front == 0 && rear == deque.length - 1)
                || front == rear + 1;
    }


    // Insert at front
    public void insertFront(int value) {

        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        // First element
        if (isEmpty()) {

            front = 0;
            rear = 0;

        } else if (front == 0) {

            front = deque.length - 1;

        } else {

            front--;
        }

        deque[front] = value;

        System.out.println(value + " inserted at front");
    }


    // Insert at rear
    public void insertRear(int value) {

        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        // First element
        if (isEmpty()) {

            front = 0;
            rear = 0;

        } else if (rear == deque.length - 1) {

            rear = 0;

        } else {

            rear++;
        }

        deque[rear] = value;

        System.out.println(value + " inserted at rear");
    }


    // Delete from front
    public void deleteFront() {

        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println(
                deque[front] + " deleted from front"
        );

        // Only one element
        if (front == rear) {

            front = -1;
            rear = -1;

        } else if (front == deque.length - 1) {

            front = 0;

        } else {

            front++;
        }
    }


    // Delete from rear
    public void deleteRear() {

        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.println(
                deque[rear] + " deleted from rear"
        );

        // Only one element
        if (front == rear) {

            front = -1;
            rear = -1;

        } else if (rear == 0) {

            rear = deque.length - 1;

        } else {

            rear--;
        }
    }


    // Display deque
    public void display() {

        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }

        System.out.print("Deque: ");

        int i = front;

        while (true) {

            System.out.print(deque[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % deque.length;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        ArrayDequeExample dq = new ArrayDequeExample();

        dq.insertRear(20);
        dq.insertRear(30);

        dq.insertFront(10);
        dq.insertFront(5);

        dq.display();

        dq.deleteFront();
        dq.deleteRear();

        dq.display();
    }
}
