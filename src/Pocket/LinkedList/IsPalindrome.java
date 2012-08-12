/**
 * 
 */
package Pocket.LinkedList;

import java.util.Stack;


/**
 * Created by Wenqi Zhu
 * 1:25:34 AM Aug 12, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class IsPalindrome {

	public boolean isPalindrome1(Node head){//reverse the list and compare
		if(head==null) return true;
		
		Node newHead = new Node(head.val);
		Node newNode = newHead;
		Node running = head;
		int count = 1;
		while(running.next!=null){
			newNode.next = new Node(running.next.val);
			newNode = newNode.next;
			running = running.next;
			count++;
		}
		
		Node current = head;
		Node next = current.next;
		Node loop = null;
		while(next!=null){
			current.next = loop;
			loop = current;
			current = next;
			next = next.next;
		}
		head = current;
		head.next = loop;
		
		count = count/2;
		while(head!=null){
			System.out.print(head.val + " ");
			if(head.val!= newHead.val){
				return false;
			}
			head = head.next;
			newHead = newHead.next;
		}
		
		return true;
	}
	
	public boolean isPalindrome2(Node head){ //implement with stack
		Node slow = head;
		Node fast = head;
		Stack<Object> stack = new Stack<Object>();
		
		while(fast!=null && fast.next!=null){
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast!=null){ // odd number of elements.skip the middle one.
			slow = slow.next;
		}
		
		while(slow!=null){
			Object top = stack.pop();
			if(top == slow.val)
				slow = slow.next;
			else{
				return false;
			}
		}
		return true;
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList test = new LinkedList();
		test.add(1);
		test.add('a');
		test.add(1);
		test.add('a');
		test.add(1);
		
		IsPalindrome result = new IsPalindrome();
		boolean n = result.isPalindrome1(test.head);
		boolean m = result.isPalindrome2(test.head);
		System.out.println(n);
		System.out.println(m);
	}

}
