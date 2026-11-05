/*Priority Queue Using Array
Now we move to Priority Queue 1/2.
Since we're currently focusing on array implementation, we will build the Priority Queue manually using an array rather than Java's PriorityQueue.
Problem Statement
Create a simple Priority Queue using an array.
Each element represents a task number. For this basic problem:
Smaller number = Higher priority */
public class PriorityQueueArray {

    int[] queue = new int[5];
    int size = 0;

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == queue.length;
    }

    // Add element
    public void enqueue(int value) {

        if (isFull()) {
            System.out.println("Priority Queue is full");
            return;
        }

        queue[size] = value;
        size++;

        System.out.println(value + " added to queue");
    }

    // Find index of highest priority element
    public int getHighestPriorityIndex() {

        int highestPriorityIndex = 0;

        for (int i = 1; i < size; i++) {

            if (queue[i] < queue[highestPriorityIndex]) {
                highestPriorityIndex = i;
            }
        }

        return highestPriorityIndex;
    }

    // Remove highest priority element
    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return;
        }

        int index = getHighestPriorityIndex();

        System.out.println(queue[index] + " removed from queue");

        // Shift elements left
        for (int i = index; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }

        size--;
    }

    // Display highest priority element
    public void peek() {

        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return;
        }

        int index = getHighestPriorityIndex();

        System.out.println("Highest priority element: " + queue[index]);
    }

    // Display all elements
    public void display() {

        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        PriorityQueueArray q = new PriorityQueueArray();

        q.enqueue(30);
        q.enqueue(10);
        q.enqueue(40);
        q.enqueue(20);

        q.display();

        q.peek();

        q.dequeue();

        q.display();
    }
}