/**
 * 
 */
package linkedlist;

/**
 * Created by Wenqi Zhu
 * 9:38:29 PM Apr 26, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 * Given a circular linked list, returns the node at the beginning of the loop.
 */
public class FindBeginning {
	public Node findBeginning(Node head){
		Node slow = head;
		Node fast = head;
		
		while(true){
			slow= slow.getNext();
			fast= fast.getNext().getNext();
			if (slow == fast) break;
		}
		
		if (fast==null || fast.getNext()==null){
			return null;
		}
		
		slow = head;
		while(slow!=fast){
			slow=slow.getNext();
			fast=fast.getNext();
		}
		Node loopstart=slow;
		return loopstart;
		
	}	
	
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add(1);
		test.add(2);
		test.add(3);
		Node n = test.getHead();
		while(n.getNext()!=null){
			n = n.getNext();
			}
		
		
		test.add(4);
		test.add(5);
		
		Node m = test.getHead();
		while(m.getNext()!=null){
			m = m.getNext();
		}
		m.setNext(n);
	    FindBeginning result = new FindBeginning();
	    Node loopstart = result.findBeginning((test.getHead()));
	    
	    System.out.print(loopstart.getVal());
	    

	}

}
