/**
 * 
 */
package LinkedList;
import java.util.*;

/**
 * Created by Wenqi Zhu
 * 9:54:27 AM Apr 27, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 * Implement a function to check if a linked list is a palindrome.
 */
public class IsPalindrome {
	
	public boolean isPalindrome1(Node head){ //reverse the list and compare the reversed list to the original list.
		if(head == null) return true;
        Node newHead = new Node(head.getVal());
        Node newNode = newHead;
        Node running = head;
        //int count = 1;
        while(running.getNext()!=null) {
        	newNode.setNext(new Node(running.getNext().getVal()));
        	newNode = newNode.getNext();
        	running = running.getNext();
        	//count++;
        }
        
		Node current= head;
		Node next = current.getNext();
		Node loop = null;
		
		while(next!=null){
			current.setNext(loop);
			loop = current;
			current = next;
			next = next.getNext();
		}
		head = current;
		head.setNext(loop);
		
		
		//count = count/2;
        while(head != null) {
        	System.out.print(head.getVal() + " ");
        	if(head.getVal() != newHead.getVal()) {
        		return false;
        	}
        	head = head.getNext();
        	newHead = newHead.getNext();
        	//count--;
        }
		return true;
	}	
	
	public boolean isPalindrome2(Node head){//stack
		Node slow = head;
		Node fast = head;
		Stack<Object> stack = new Stack<Object>();
		
		while(fast!=null && fast.getNext()!=null){
			stack.push(slow.getVal());
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		if (fast != null){ // has odd number of elements.skip the middle element
			slow = slow.getNext();
		}
		
		while(slow != null){
			Object top = stack.pop();
			if(top == slow.getVal()){
				slow = slow.getNext();
			}
			else{
				return false;
			}
			}
		return true;
		
	}
	

	
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add(1);
		test.add('a');
		test.add(1);
		test.add('a');
		test.add(1);
		
		IsPalindrome result = new IsPalindrome();
		boolean n = result.isPalindrome2(test.getHead());
		System.out.print(n);
		
		
	}

}
