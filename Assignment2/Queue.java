import java.util.*;

public class Queue {

    private static final int MAX_SIZE = 1000; // Maximum size of the queue
    private int[] queueArray;  // Array to store queue elements
    private int front;  // Index of the front element
    private int rear;   // Index of the rear element
    private int size;   // Current size of the queue

    // Constructor to initialize an empty queue
    public Queue() {
        queueArray = new int[MAX_SIZE];
        front = 0;  // Initialize front index
        rear = -1;  // Initialize rear index
        size = 0;   // Initialize size to 0
    }

    // Method to add an element to the rear of the queue (enqueue operation)
    public void enqueue(int item) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % MAX_SIZE;  // Circular increment of rear index
        queueArray[rear] = item;  // Add item to the rear
        size++;  // Increment size
        System.out.println("Enqueued: " + item);
    }

    // Method to remove an element from the front of the queue (dequeue operation)
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int dequeuedItem = queueArray[front];  // Get item at the front
        front = (front + 1) % MAX_SIZE;  // Circular increment of front index
        size--;  // Decrement size
        System.out.println("Dequeued: " + dequeuedItem);
        return dequeuedItem;
    }

    // Method to peek the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queueArray[front];  // Return item at the front
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;  // Queue is empty if size is 0
    }

    // Method to get the size of the queue
    public int size() {
        return size;  // Return current size of the queue
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Current queue size: " + queue.size());
        System.out.println("Front element of the queue: " + queue.peek());

        queue.dequeue();
        System.out.println("After dequeue, front element of the queue: " + queue.peek());
    }
}
