
public class _0876_MiddleoftheLinkedList {
	public static void main(String[] args) {
		
	}
	public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }
        
        current = head;
        for(int i = 0; i < count / 2; i++) {
            current = current.next;
        }
        
        return current;
    }
}
