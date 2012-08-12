/**
 * 
 */
package Pocket.LinkedList;


/**
 * Created by Wenqi Zhu
 * 12:16:18 AM Aug 12, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class FindLoop {
	public Node findLoop(Node head){
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) break;
		}
		
		if(fast==null || fast.next==null){
			System.out.print("No loop.");
			return null;
		}
		
		slow = head;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add(1);
		test.add(2);
		test.add(3);
		Node n = test.head;
		while(n.next!=null){
			n = n.next;
			}
		
		
		test.add(4);
		test.add(5);
		
		Node m = test.head;
		while(m.next!=null){
			m = m.next;
		}
		m.next = n;
	    FindLoop result = new FindLoop();
	    Node loopstart = result.findLoop((test.head));
	    
	    System.out.print(loopstart.val);
	    

	}

}
