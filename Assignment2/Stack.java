import java.util.EmptyStackException;

public class Stack {
    private static final int MAX_SIZE = 1000; // Maximum size of the stack
    private int[] stackArray;  // Array to store stack elements
    private int top;  // Index of the top element in the stack

    // Constructor to initialize an empty stack
    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;  // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int item) {
        if (top == MAX_SIZE - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top] = item;  // Increment top and then push item
        System.out.println("Pushed " + item + " onto the stack");
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedItem = stackArray[top--];  // Access item and then decrement top
        System.out.println("Popped " + poppedItem + " from the stack");
        return poppedItem;
    }

    // Method to peek the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];  // Return top element without removing it
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;  // Stack is empty if top is -1
    }

    // Method to get the size of the stack
    public int size() {
        return top + 1;  // Size of the stack is the number of elements from 0 to top
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Current stack size: " + stack.size());
        System.out.println("Top element of the stack: " + stack.peek());

        stack.pop();
        System.out.println("After pop, top element of the stack: " + stack.peek());
    }
}
