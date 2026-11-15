public class Q4 {

    // Queue array
    static int queue[] = new int[5];

    // Queue variables
    static int front = 0;
    static int rear = -1;

    // Enqueue method
    static void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow!");
        } else {
            queue[++rear] = value;
            System.out.println("Enqueue: " + value);
            display();
        }
    }

    // Dequeue method
    static void dequeue() {

        if (front > rear) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println("Dequeue: " + queue[front]);
            front++;
            display();
        }
    }

    // Display method
    static void display() {

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Given operations
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        enqueue(40);
        dequeue();

        // Final result
        System.out.println("Final Queue:");
        display();

        // Front element
        System.out.println("Front Element: " + queue[front]);
    }
}
