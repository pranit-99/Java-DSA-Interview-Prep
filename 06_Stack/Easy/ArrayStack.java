/*Problem 1 — Implement Stack Using Array
Problem Statement
Create a Stack using an integer array of capacity 5.
Implement:
- push(int value)
- pop()
- peek()
- isEmpty()
- display()
Solution */
public class ArrayStack {
    int stack[] = new int[5];
    int top = -1;

    //Push Element into stack
    public void push(int value){
        if(top == stack.length - 1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println(value + " pushed into stack");
    }

    //Remove top element
    public void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top] + " popped from stack");
        top--;
    }

    //Display top element
    public void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Top element" + stack[top]);
    }

    //check if stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //Display stack
    public void display(){
        if( top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack elements");
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        ArrayStack stack  = new ArrayStack();
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
