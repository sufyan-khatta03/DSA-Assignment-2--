
public class Q3 {

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
            System.out.println("Enqueued: " + value);
            display();
        }
    }

    // Dequeue method
    static void dequeue() {

        if (front > rear) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println("Dequeued: " + queue[front]);
            front++;
            display();
        }
    }

    // Front method
    static void showFront() {

        if (front > rear) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }

    // Display method
    static void display() {

        if (front > rear) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue: ");

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Given operations
        enqueue(10);
        enqueue(20);
        enqueue(30);

        // Front element
        showFront();

        // Remove element
        dequeue();

        // Display queue
        display();
    }
}
