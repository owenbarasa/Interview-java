/**
 * 
 */
package linkedlist;


/**
 * Created by Wenqi Zhu
 * 5:44:17 PM Apr 25, 2012
 * @Buffalo
 */
public class Partition {
	public Node partition(Node head,int n){
		Node smallhead = null;
		Node smalltail = null;
		Node largehead = null;
		Node largetail = null;
		
		while(head!=null){
			Node next = head.getNext();
			head.setNext(null);
			
			if ((Integer)head.getVal() < n){
				if(smallhead==null){
				smallhead = head;
				smalltail = smallhead;
				} else{
				smalltail.setNext(head);
				smalltail = head;
				}
		   }else{
			    if(largehead==null){
			    largehead = head;
			    largetail = largehead;
			   }else{
				largetail.setNext(head);
				largetail = head;
			   }
			}
			head = next;	
		}
		if (smallhead == null){
			return largehead;
		}
		smalltail.setNext(largehead);
		return smallhead;
	}
	
		
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add(7);
		test.add(2);
		test.add(6);
		test.add(9);
		test.add(5);
		test.add(3);
		test.add(1);
		test.add(4);
		test.add(8);
		test.add(0);
		
		Partition result = new Partition();
		test.setHead(result.partition(test.getHead(), 5));
		test.printer(test.getHead());
			
	}

}
