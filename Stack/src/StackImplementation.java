//implement stack using linked list
import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class
class Stack {

   private Node head;

    public Stack() {
        this.head = null;
    }

    // Push method to add an element
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Pop method to remove an element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Indicate that the stack is empty
        }
        int poppedValue = head.data;
        head = head.next; // Move the head to the next node
        return poppedValue;
    }

    // Peek method to view the head element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Indicate that the stack is empty
        }
        return head.data; // Return the head value
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return head == null; // Stack is empty if head is null
    }

    // Display the stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = head; // Start from the head
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // Move to the next node
        }
        System.out.println();
    }
}

// Main class for the menu-driven program
public class StackImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;
                case 3:
                    int peekValue = stack.peek();
                    if (peekValue != -1) {
                        System.out.println("head value: " + peekValue);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
