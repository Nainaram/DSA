import java.util.EmptyStackException;

public class StackExample {
    
    private int maxSize;            // Maximum size of the stack
    private int[] stackArray;       // Array to store stack elements
    private int top;                // Index of the top element in the stack
    
    // Constructor to initialize the stack
    public StackExample(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = 0;  // Stack is empty initially
    }
    
    // Method to push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element " + element);
            return;
        }
        stackArray[++top] = element;
        System.out.println("Pushed element: " + element);
    }
    
    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }
    
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
    
    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample(5); // Creating a stack of size 5
        
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Peeking at the top element
        System.out.println("Top element of the stack: " + stack.peek());
        
        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        
        // Trying to pop from an empty stack
        //stack.pop();  // Uncomment this line to see the EmptyStackException
    }
}
