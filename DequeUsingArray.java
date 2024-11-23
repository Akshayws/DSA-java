package ak;

public class DequeUsingArray {
    int Msize;
    int[] Darr;
    int front;
    int rear;

    public DequeUsingArray(int size) {
        Msize = size;
        Darr = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (rear + 1) % Msize == front;
    }

    public void insertFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert " + item + " at front.");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + Msize) % Msize; // Circular increment
        }
        Darr[front] = item;
        System.out.println("Inserted at front: " + item);
    }

    public void insertRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot insert " + item + " at rear.");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % Msize; // Circular increment
        }
        Darr[rear] = item;
        System.out.println("Inserted at rear: " + item);
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete from front.");
            return;
        }
        System.out.println("Deleted from front: " + Darr[front]);
        if (front == rear) { // Only one element was present
            front = -1;
            rear = -1; // Reset to initial state
        } else {
            front = (front + 1) % Msize; // Circular increment
        }
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete from rear.");
            return;
        }
        System.out.println("Deleted from rear: " + Darr[rear]);
        if (front == rear) { // Only one element was present
            front = -1;
            rear = -1; // Reset to initial state
        } else {
            rear = (rear - 1 + Msize) % Msize; // Circular decrement
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }
        System.out.print("Deque elements: ");
        int i = front;
        while (true) {
            System.out.print(Darr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % Msize; // Circular increment
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeUsingArray deque = new DequeUsingArray(7);

        deque.insertRear(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.insertFront(1);
        deque.insertFront(2);
        deque.insertFront(3);
        deque.insertFront(9);
        //deque.insertFront(7);
        deque.display();

        deque.deleteFront();
        deque.display();

        deque.deleteRear();
        deque.display();

        deque.insertRear(30);
        deque.insertFront(0);
        deque.display();
    }
}