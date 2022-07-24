class Stack {

    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();
    }

    public void push(int x) {
        if (isFull())
            System.out.println("Stack is full");
        else {
            arr[++top] = x;
            System.out.println("inserted " + x);
        }
    }

    public void pop() {
        if (isEmpty())
            System.out.println("array is empty");
        else {
            System.out.println("popped " + arr[top--]);
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++)
            System.out.println(arr[i]);
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }
}