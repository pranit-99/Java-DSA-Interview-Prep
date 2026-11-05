/*Problem 6/8 — Priority Queue: Task Processing
This is Priority Queue 2/2.
In the previous problem, the value itself represented priority. Now we'll make it slightly more realistic by storing a task name and its priority.
Problem Statement
Create a Priority Queue using an array.
Each task contains:
Task Name
Priority

Priority rule:
1 = High Priority
2 = Medium Priority
3 = Low Priority

Add:
Task: Backup Files       Priority: 3
Task: Fix Server         Priority: 1
Task: Send Report        Priority: 2
Task: Update Software    Priority: 3

Then:
display()
peek()
dequeue()
display()

Fix Server should be processed first because it has priority 1. */
class Task {

    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}


public class TaskPriorityQueue {

    Task[] queue = new Task[5];
    int size = 0;


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean isFull() {
        return size == queue.length;
    }


    // Add task
    public void enqueue(String name, int priority) {

        if (isFull()) {
            System.out.println("Priority Queue is full");
            return;
        }

        Task newTask = new Task(name, priority);

        queue[size] = newTask;
        size++;

        System.out.println(name + " added with priority " + priority);
    }


    // Find highest priority task
    public int getHighestPriorityIndex() {

        int highestPriorityIndex = 0;

        for (int i = 1; i < size; i++) {

            if (queue[i].priority < queue[highestPriorityIndex].priority) {
                highestPriorityIndex = i;
            }
        }

        return highestPriorityIndex;
    }


    // Remove highest priority task
    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return;
        }

        int index = getHighestPriorityIndex();

        System.out.println(
                queue[index].name + " removed from queue"
        );

        // Shift elements
        for (int i = index; i < size - 1; i++) {
            queue[i] = queue[i + 1];
        }

        size--;
    }


    // Display highest priority task
    public void peek() {

        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return;
        }

        int index = getHighestPriorityIndex();

        System.out.println(
                "Next Task: " + queue[index].name
                + " | Priority: " + queue[index].priority
        );
    }


    // Display all tasks
    public void display() {

        if (isEmpty()) {
            System.out.println("Priority Queue is empty");
            return;
        }

        System.out.println("\nTasks:");

        for (int i = 0; i < size; i++) {

            System.out.println(
                    queue[i].name
                    + " | Priority: "
                    + queue[i].priority
            );
        }
    }


    public static void main(String[] args) {

        TaskPriorityQueue q = new TaskPriorityQueue();

        q.enqueue("Backup Files", 3);
        q.enqueue("Fix Server", 1);
        q.enqueue("Send Report", 2);
        q.enqueue("Update Software", 3);

        q.display();

        q.peek();

        q.dequeue();

        q.display();
    }
}
