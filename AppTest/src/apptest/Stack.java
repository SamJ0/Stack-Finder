package apptest;

public class Stack {

    int capacity = 1000;

    int[] array;
    int top = -1;

    public Stack(int capacity) {
        this.capacity = capacity;
        array = new int[this.capacity];
    }

    public Integer top() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return array[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);

    }

    public void push(int pushedElement) {
        if (top == capacity - 1) {
            System.out.println("----Satck OverFlow!!!----");
        } else {
            top++;
            array[top] = pushedElement;
            System.out.println("Element " + pushedElement + " pushed to the stack.");

        }
    }

    public int pop() {
        int x = 0;
        if (top == -1) {
            System.out.println("----Satck UnderFlow!!!----");
        } else {
            x = array[top];
            top--;
            System.out.println("----Stack ppopped!!!----");
        }
        return x;
    }

    public void Display() {
        if (top == -1) {
            System.out.println("----Satck is empty!!!----");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + "  ");
            }
            System.out.println();
        }
    }

    public void OriginalOrder() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements in original order:");
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public int size() {
        return top + 1;
    }
}
