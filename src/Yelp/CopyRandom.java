/**
 * 
 */
package Yelp;

/**
 * Created by Wenqi Zhu
 * 3:11:42 PM Sep 28, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class CopyRandom {
	public Node copyRandom(Node node){
		Node current = node;
		Node copy;
		while(current!=null){
			copy = new Node(current.val);
			copy.next = current.next;
			current.next = copy;
			current = current.next.next;
		}
		
		current = node;
		while(current!=null){
			current.next.random= current.random.next;
			current = current.next.next;
		}
		
		current = node;
		copy = current.next;
		Node newHead = copy;
		while(current!=null){
			current.next =current.next.next;
			current = current.next;
			if(copy.next!=null){
				copy.next = copy.next.next;
				copy = copy.next;
			}	
		}
		return newHead;
		
	}
}

class Node{
	int val;
	Node next;
	Node random;
	Node(int n){
		val = n;
		next = null;
		random = null;
	}
}