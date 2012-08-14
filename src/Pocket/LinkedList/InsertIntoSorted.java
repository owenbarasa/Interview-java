/**
 * 
 */
package Pocket.LinkedList;

/**
 * Created by Wenqi Zhu
 * 11:06:58 AM Aug 14, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class InsertIntoSorted {

	public static Node insert(Node head, int val){
		if(head == null || val <= (Integer)head.val){
			Node temp = new Node(val);
			temp.next = head;
			head = temp;
			return head;
		}
		
		Node curr = head;
		Node prev = null;
		
		while(curr!=null){
			if(val<(Integer)curr.val){
				Node temp = new Node(val);
				temp.next = curr;
				prev.next = temp;
				prev = prev.next;
				break;
			}else{
				prev = curr;
				curr = curr.next;
			}
		}
		
		if(curr == null){
			Node temp = new Node(val);
			prev.next = temp;
		}
		
		return head;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();

		list.add(1);

		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		
		list.head = insert(list.head, 4);
		list.printer(list.head);
	}

}
