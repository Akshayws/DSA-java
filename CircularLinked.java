

package ak;

class SinglyNode {
    int data;
    SinglyNode next;

    SinglyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinked {
    static SinglyNode head;

    // Add at the beginning
    public void addBeginning(int data) {
        SinglyNode node = new SinglyNode(data);
        if (head == null) {
            head = node;
            head.next = head;  // Point to itself to make it circular
            System.out.println("List was empty, added the first node.");
        } else {
            SinglyNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            node.next = head;
            head = node;
            temp.next = head;  // Maintain circular nature
        }
    }

    // Add at the end
    public void addEnd(int data) {
        SinglyNode node = new SinglyNode(data);
        if (head == null) {
            head = node;
            head.next = head;  // Point to itself to make it circular
            System.out.println("List was empty, added the first node.");
        } else {
            SinglyNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;  // Maintain circular nature
        }
    }

    // Insert in between
    public void inBetween(int data, int value) {
        SinglyNode node = new SinglyNode(data);
        if (head == null) {
            head = node;
            head.next = head;  // Point to itself to make it circular
            System.out.println("List was empty, added the first node.");
        } else {
            SinglyNode temp = head;
            do {
                if (temp.data == value) {
                    node.next = temp.next;
                    temp.next = node;
                    return;
                }
                temp = temp.next;
            } while (temp != head);
            System.out.println("Value " + value + " not found in the list.");
        }
    }

    // Display the list
    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        SinglyNode temp = head;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinked sl = new CircularLinked();
        sl.addBeginning(10);
        sl.addEnd(20);
        sl.inBetween(30, 10);
        sl.display();
    }
}

