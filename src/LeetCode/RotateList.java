/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 10:31:40 PM Sep 16, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a list, rotate the list to the right by k places, where k is non-negative.

	For example:
	Given 1->2->3->4->5->NULL and k = 2,
	return 4->5->1->2->3->NULL.
 */
public class RotateList {
	 public ListNode rotateRight(ListNode head, int n) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        if(head==null||head.next==null) return head;
	        ListNode runner = head;
	        ListNode current = head;
	        int size =1;
	        while(runner.next!=null){
	            runner = runner.next;
	        	size++;
	        }
	        
	        int k = n%size;
	        runner.next = current;
	        
	        
	        for(int i = 0;i<size-k;i++){
	        	current =current.next;
	        	runner = runner.next;
	        }
	        runner.next =null;
	        return current;
	        
	    }
}
