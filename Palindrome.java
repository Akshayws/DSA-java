package p1;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class Palindrome {

	private ListNode frontPointer;

	public boolean isPalindrome(ListNode head) {
		frontPointer = head;
		return recursivelyCheck(head);
	}

	private boolean recursivelyCheck(ListNode currentNode) {
		if (currentNode != null) {
			if (!recursivelyCheck(currentNode.next)) {
				return false;
			}
			if (frontPointer.val != currentNode.val) {
				return false;
			}
			frontPointer = frontPointer.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome list = new Palindrome();

		// Creating a linked list
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(1);

		boolean result = list.isPalindrome(head);
		System.out.println("Is the linked list a palindrome? " + result);
	}

}
