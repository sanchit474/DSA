import java.util.Scanner;

public class QueueA {
    private static int[] queue;
    private static int front = 0, rear = -1, capacity;

    // Method to initialize the queue
    public static void initializeQueue(int cap) {
        capacity = cap;
        queue = new int[capacity];
    }

    // Method to enqueue an element
    public static void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        queue[++rear] = item;
        System.out.println(item + " enqueued to queue.");
    }

    // Method to dequeue an element
    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int item = queue[front++];
        System.out.println(item + " dequeued from queue.");
        return item;
    }

    // Method to check if the queue is empty
    public static boolean isEmpty() {
        return front > rear;
    }

    // Method to display the queue elements
    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        initializeQueue(capacity);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int item = scanner.nextInt();
                    enqueue(item);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
