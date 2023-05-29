package apptest;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Integer> data;
    private int capacity;

    private int front = 0;
    private int rear = -1;
    private int size = 0;

    Queue(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>(capacity);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enQueue(int element) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        data.add(rear, element);
        size++;
    }

    public int first() {
        if (isEmpty()) {
            return 0;
        }

        return data.get(front);
    }

    public int deQueue() {
        if (isEmpty()) {
            return 0;
        }

        int answer = data.get(front);
        front++;
        size--;

        return answer;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(data.get(i) + " ");
        }

        System.out.println("\n");
    }
}
