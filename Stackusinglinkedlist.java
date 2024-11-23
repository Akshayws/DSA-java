package ak;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stackusinglinkedlist {
    
    static Node head ;

    // Push an element onto the stack
    static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Data pushed: " + data);
    }

    // Pop an element from the stack
    static void pop() {
        if (head == null) {
            System.out.println("Stack is empty. Nothing to pop.");
            return;
        }
        System.out.println("Data popped: " + head.data);
        head = head.next;
    }

    // Peek at the top element of the stack
    static void peek() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + head.data);
    }

    // Display all elements in the stack
    static void display() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        display();  // Should display: Stack elements: 30 20 10
        peek();     // Should display: Top element: 30
        pop();      // Should display: Data popped: 30
        display();  // Should display: Stack elements: 20 10
        peek();     // Should display: Top element: 20
    }
}
