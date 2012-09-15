/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 2:49:31 PM Sep 15, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.


 */
public class RemoveDupFromSortedListII {
	 public static ListNode deleteDuplicates(ListNode head) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		 if(head==null || head.next==null) return head;
	     ListNode current = head;
	     ListNode prev = null;
	     ListNode next =current.next;
	     
	     while(next!=null && current.val == next.val){ //remove the head duplicates
	    	 while( next!=null &&current.val == next.val){
	    	 next=next.next;
	    	 }
	    	 if(next == null) return null;
	    	 else{
	    		 head = next;
	    		 current = next;
	    		 next = next.next;
	    	 }
	     }
	     
	     while(next!=null){
	    	 
	    	 if(next.val!=current.val){
	    		 prev = current;
	    		 current = current.next;
	    		 next = next.next;
	    	 }
	    	 else{
	    		 while(next!=null && current.val == next.val){
	    			 next = next.next;
	    		 }
	    		 if(next ==null){
	    			 prev.next = null;
	    		 }
	    		 else{
	    			 prev.next = next;
	    			 current = next;
	    			 next = next.next;
	    		 } 
	    		 
	    	 }
	     }
	     return head;
	    }
	 public static void main(String[] args){
		 ListNode node = new ListNode(1);
		 node.next = new ListNode(1);
		 node.next.next = new ListNode(2);
		 node = deleteDuplicates(node);
		 while(node!=null){
			 System.out.print(node.val);
			 node = node.next;
		 }
	 }
}
