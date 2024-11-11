class Stacks{
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to hold the stack elements
    private int head; // Index of the head element in the stack

    // Constructor to initialize the stack
    public Stacks(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.head = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++head] = value; // Increment head and add the value
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 if stack is empty
        }
        return stackArray[head--]; // Return the head value and decrement head
    }

    // Method to peek at the head element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return -1 if stack is empty
        }
        return stackArray[head]; // Return the head value
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (head == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (head == maxSize - 1);
    }

    // Method to display the stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= head; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

// Example usage
public class StackArray {
    public static void main(String[] args) {
        Stacks stack = new Stacks(5); // Create a stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Display stack

        System.out.println("head element is: " + stack.peek()); // Peek at head

        System.out.println("Popped element: " + stack.pop());
        stack.display(); // Display stack after pop

        stack.push(40);
        stack.push(50);
        stack.push(60); // This should show "Stack is full."
        stack.display(); // Display stack
    }
}
