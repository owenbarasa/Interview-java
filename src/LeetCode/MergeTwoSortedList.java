/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 1:29:02 PM Sep 11, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function

		ListNode head = null;
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.val<l2.val){
			head = new ListNode(l1.val);
			l1 = l1.next;
		}
		else{
			head = new ListNode(l2.val);
			l2 = l2.next;
		}
		ListNode l3 = head;
		while(l1!=null && l2!=null){
			if(l1.val<=l2.val){
				l3.next = new ListNode(l1.val);	
				l1 = l1.next;
			}
			else{
				l3.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			l3 = l3.next;
		}
		
		while(l1!=null){
			l3.next = new ListNode(l1.val);
			l3 = l3.next;
			l1 = l1.next;
		}
		
		while(l2!=null){
			l3.next = new ListNode(l2.val);
			l3 = l3.next;
			l2 = l2.next;
		}
		
		return head;	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
