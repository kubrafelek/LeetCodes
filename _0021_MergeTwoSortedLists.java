public class _0021_MergeTwoSortedLists {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		ListNode head;

		if (l1.val < l2.val) {
			head = new ListNode(l1.val);
			l1 = l1.next;
		} else {
			head = new ListNode(l2.val);
			l2 = l2.next;
		}

		ListNode current = head;

		while (l1 != null && l2 != null) {
			// compare do it
			if (l1.val < l2.val) {
				current.next = new ListNode(l1.val);
				current = current.next;
				l1 = l1.next;
			} else {
				current.next = new ListNode(l2.val);
				current = current.next;
				l2 = l2.next;
			}
		}

		while (l1 != null) {
			current.next = new ListNode(l1.val);
			current = current.next;
			l1 = l1.next;
		}

		while (l2 != null) {
			current.next = new ListNode(l2.val);
			current = current.next;
			l2 = l2.next;
		}

		return head;
	}
}
