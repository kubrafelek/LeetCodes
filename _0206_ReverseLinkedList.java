public class _0206_ReverseLinkedList {

	ListNode first;
	ListNode last;

	public static void main(String[] args) {

		_0206_ReverseLinkedList t1 = new _0206_ReverseLinkedList();

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		
		t1.insertFirst(l1);
		t1.insertFirst(l2);
		t1.insertFirst(l3);
		t1.insertFirst(l4);
		System.out.println(t1.toString());
	
		t1.reverseList(l4);
		t1.insertFirst(l3);
		t1.insertFirst(l2);
		t1.insertFirst(l1);
		System.out.println(t1.toString());
	}

	public ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode current = head;

		while (current != null) {
			ListNode nextTemp = current.next;
			current.next = prev;
			prev = current;
			current = nextTemp;
		}
		return prev;
	}

	public void insertFirst(ListNode newNode) {
		if (first == null) {
			first = newNode;
			last = newNode;
		} else {
			newNode.next = first;
			first = newNode;
		}
	}

	public String toString() {

		ListNode tmp = first;
		String str = "";

		while (tmp != null) {
			str += tmp.val + " -> ";
			tmp = tmp.next;
		}

		return str + "NULL";
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return "\nListNode [val=" + val + ", next=" + next + "]";
	}

}