public class Q2 {

    // Stack variables
    static int stack[] = new int[5];
    static int top = -1;

    // Push operation
    static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
            System.out.println("Push: " + value);
            display();
        }
    }

    // Pop operation
    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println("Pop: " + stack[top]);
            top--;
            display();
        }
    }

    // Display stack
    static void display() {
        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Given operations
        push(10);
        push(20);
        push(30);
        pop();
        push(40);
        pop();

        // Final result
        System.out.println("Top element: " + stack[top]);
    }
}
