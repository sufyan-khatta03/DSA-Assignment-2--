import java.util.Scanner;

public class Q1 {

    // Stack variables
    static int size = 5;
    static int stack[] = new int[size];
    static int top = -1;

    // Push operation
    static void push(int value) {

        // Overflow check
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            stack[top] = value;
            System.out.println("Element pushed.");
        }
    }

    // Pop operation
    static void pop() {

        // Underflow check
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    // Peek operation
    static void peek() {

        // Empty check
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Display operation
    static void display() {

        // Empty check
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");

            // Reverse traversal
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        int choice;
        int value;

        // Menu loop
        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            // Choice selection
            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = input.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        // Close scanner
        input.close();
    }
}
