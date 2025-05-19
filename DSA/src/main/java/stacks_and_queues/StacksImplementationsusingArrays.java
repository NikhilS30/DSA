package stacks_and_queues;

//stacks implementation using arrays

class StacksImplementationsusingArrays {
	private int[] arr;
	private int top;
	private int capacity;

	// Constructor to initialize the stack
	public StacksImplementationsusingArrays(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Push element onto the stack
	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top] = x;
	}

	// Pop element from the stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top--];
	}

	// Return the top element without removing it
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return arr[top];
	}

	// Check if the stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Check if the stack is full
	public boolean isFull() {
		return top == capacity - 1;
	}

	// Return the current size of the stack
	public int size() {
		return top + 1;
	}

	// Display all elements of the stack
	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.print("Stack elements: ");
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

//    public class Main {
	public static void main(String[] args) {
		StacksImplementationsusingArrays stack = new StacksImplementationsusingArrays(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();

		System.out.println("Top element is: " + stack.peek());
		System.out.println("Removed element: " + stack.pop());
		stack.display();
	}
//    }
}