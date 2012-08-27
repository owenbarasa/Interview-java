/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 2:50:32 AM Aug 27, 2012
 * @SanFrancisco
 * LeetCode Problems
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit.
 *  Add the two numbers and return it as a linked list.
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
		return addTwoNumbers(l1,l2,0);      
    }
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry){
		if(l1 == null && l2 == null && carry == 0){
			return null;
		}
		
		ListNode result = new ListNode(carry);
		int value = carry;
		if(l1!=null){
			value += l1.val;
		}
		if(l2!=null){
			value += l2.val;
		}
		
		result.val = value % 10;
		carry = value/10;
		
		if(l1!=null || l2!=null || value>= 10){
			ListNode more = addTwoNumbers(l1==null?null:l1.next, l2==null?null:l2.next, carry);
			result.next = more;
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}