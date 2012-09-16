/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 12:53:24 AM Sep 16, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

	If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
	You may not alter the values in the nodes, only nodes itself may be changed.
	Only constant memory is allowed.
	
	For example,
	Given this linked list: 1->2->3->4->5
	For k = 2, you should return: 2->1->4->3->5
	For k = 3, you should return: 3->2->1->4->5
 */
public class ReverseNodesInKGroup {
	 public ListNode reverseKGroup(ListNode head, int k) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        ListNode running = head;
	        int size = 0;
	        while(running!=null){
	        	running = running.next;
	        	size++;
	        }
	        if(size<k){
	        	return head;
	        }
	        
	        ListNode current = head;
	        ListNode next = null;
	        ListNode prev = null;
	        int count = 0;
	        while(count<k){
	        	next = current.next;
	        	current.next = prev;
	        	prev = current;
	        	current = next;
	        	count++;
	        }
	        if(next!=null){
	        	head.next = reverseKGroup(next,k);
	        }
	        return prev;
	    }
}
