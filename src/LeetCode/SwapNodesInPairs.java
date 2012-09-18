/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 2:37:05 PM Sep 18, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null || head.next == null){
        	return head;
        }
        ListNode runner = head;
        int size =0;
        while(runner!=null){
        	runner = runner.next;
        	size++;
        }
        if(size<2) return head;
        
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;
        while(count<2){
        	next = current.next;
        	current.next = prev;
        	prev = current;
        	current = next;
        	count++;
        }
        
        if(next!=null){
        	head.next = swapPairs(next);
        }
        
        return prev;
        
    }
	
	
}
