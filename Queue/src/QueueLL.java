import java.util.Scanner;

// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class using a linked list
class Queue {
    private Node front; // Pointer to the front of the queue
    private Node rear;  // Pointer to the rear of the queue

    public Queue() {
        front = null;
        rear = null;
    }

    // Method to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            // If the queue is empty
            front = rear = newNode;
        } else {
            // Add new node at the end of the queue
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued to the queue");
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }

        int data = front.data;
        front = front.next;

        if (front == null) {
            // If the queue is now empty, set rear to null as well
            rear = null;
        }

        System.out.println(data + " dequeued from the queue");
        return data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to peek at the front element of the queue
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }
        return front.data;
    }

    // Method to display the elements in the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to test the Queue implementation
public class QueueLL{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println("Front element is: " + queue.peek());
                    break;
                case 4:
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;
                case 5:
                    queue.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
