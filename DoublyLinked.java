package ak;

class DoublyNode {
    int data;
    DoublyNode previous;
    DoublyNode next;

    public DoublyNode(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

public class DoublyLinked {

    DoublyNode head;

    // Add at the beginning
    public void addBeginning(int data) {
        DoublyNode node = new DoublyNode(data);

        if (head != null) {
            head.previous = node;
            node.next = head;
        }
        head = node;
    }

    // Add at the end
    public void addEnd(int data) {
        DoublyNode node = new DoublyNode(data);

        if (head == null) {
            head = node;
            return;
        }

        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.previous = temp;
    }

    // Insert in between
    public void atBetween(int data, int val) {
        DoublyNode node = new DoublyNode(data);
        DoublyNode temp = head;

        if (head == null) {
            head = node;
            System.out.println("List is empty, added the first node.");
            return;
        }

        while (temp != null && temp.data != val) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value " + val + " not found in the list.");
            return;
        }

        node.next = temp.next;
        node.previous = temp;
        if (temp.next != null) {
            temp.next.previous = node;
        }
        temp.next = node;
    }

    // Display the list in forward direction
    void displayForward() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public static void main(String[] args) {
        DoublyLinked dl = new DoublyLinked();
        dl.addBeginning(10);
        dl.addEnd(20);
        dl.atBetween(15, 10);  // Insert 15 after the node with value 10
        dl.displayForward();
    }
}
