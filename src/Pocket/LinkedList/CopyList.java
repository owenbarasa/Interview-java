/**
 * 
 */
package Pocket.LinkedList;
import LinkedLists.Node;
/**
 * Created by Wenqi Zhu
 * 5:01:48 PM Aug 8, 2012
 * @SanFrancisco
 * Pocket questions
 * Copy a linked list
 */
public class CopyList {

	public Node copyLinkedList(Node head){
		Node n1 = head;
		Node copy = new Node(n1.getVal());
		Node n2 = copy;
		while(n1.getNext()!=null){
			n2.setNext(new Node(n1.getNext().getVal()));
			n1 = n1.getNext();
			n2 = n2.getNext();
		}
		return copy;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);

		head.setNext(new Node(2));
		head.getNext().setNext(new Node(3));
		head.getNext().getNext().setNext(new Node(4));
 
		CopyList test = new CopyList();

		Node h = test.copyLinkedList(head);
		while(h!=null){
			System.out.print(h.getVal()+" ");
			h = h.getNext();
		}

	}

}
