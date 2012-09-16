/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 9:30:17 PM Sep 15, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

	For example:
	Given 1->2->3->4->5->NULL, m = 2 and n = 4,
	
	return 1->4->3->2->5->NULL.
	
	Note:
	Given m, n satisfy the following condition:
	1 ≤ m ≤ n ≤ length of list.
 */
public class ReverseLinkedListBetween {

	public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(head == null || m==n) return head;
		
		ListNode start = head;
        ListNode before = null;
        
        for(int i = 1;i<m;i++){
        	before = start;
        	start = start.next;
        }
        
        
        ListNode current = start;
        ListNode prev = null;
        ListNode next = null;
        
        for(int i = 0; i< n-m+1; i++){
        	next = current.next;
        	current.next = prev;
        	prev = current;
        	current = next;
        }
        
        if(m == 1){
        start.next = current;
        return prev;
        }
        
        start.next = current;
        
        before.next = prev;
        
        return head;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
