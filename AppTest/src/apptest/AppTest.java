package apptest;

import java.util.Scanner;

public class AppTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum size of the stack: ");
        int maxSize = scanner.nextInt();

        Stack s = new Stack(maxSize);
        Queue q = new Queue(maxSize);

        int choice;

        // Menu-driven loop for user interaction
        do {
            System.out.println("\n---- Stack Menu ----");
            System.out.println("1. Push an element to the stack");
            System.out.println("2. Find an element in the stack");
            System.out.println("3. Print the stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    s.push(element);

                    break;
                case 2:
                    // Find an element in the stack
                    System.out.print("Enter the element to find: ");
                    int target = scanner.nextInt();
                    boolean found = searchQS(s, q, target);
                    if (found) {
                        System.out.println("Element " + target + " found in the stack!");
                    } else {
                        System.out.println("Element " + target + " not found in the stack.");
                    }
                    break;
                case 3:
                    s.OriginalOrder();
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

    }

    public static boolean searchQS(Stack s, Queue q, int t) {
        boolean res = false;
        for (int i = s.size(); i > 0; i--) {
            if (t == s.top()) {
                res = true;
            }
            q.enQueue(s.pop());
        }

        for (int i = q.size(); i > 0; i--) {
            s.push(q.deQueue());
        }
        return res;
    }
}
