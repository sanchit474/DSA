import java.util.Scanner;

class CircularQueueImp {
    private int[] arr;
    private int front, rear, capacity, size;

    public CircularQueueImp(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];//queue initialize
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to enqueue an element
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue.");
    }

    // Method to dequeue an element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(item + " dequeued from queue.");
        return item;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        CircularQueueImp queue = new CircularQueueImp(capacity);

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
                    queue.enqueue(item);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
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
