/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 4:29:34 PM Sep 14, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDupFromSortedList {
	
	public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(head == null || head.next ==null) return head;
        ListNode current = head;
        ListNode next = current.next;
        while(current!=null && next!=null){
            if(next.val!=current.val){
            	current = current.next;
            	next = next.next;
            }
            else{
        	while(next!=null && next.val==current.val){
        		next = next.next;
        	}
        	if(next==null){
        		current.next = null;
        	}
        	else{
        		current.next=next;
        		current = current.next;
        		next = next.next;
        	}
            }
        }
        
        return head;
        
    }
	
	public ListNode deleteDuplicates2(ListNode head) { // Better logic
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
       
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;// when the node after slow are all duplicates of slow.
        return head;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
