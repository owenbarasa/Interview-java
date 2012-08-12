/**
 * 
 */
package Pocket.LinkedList;

/**
 * Created by Wenqi Zhu
 * 9:55:20 PM Aug 11, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class ReturnMiddle {

	public Node returnMiddle(Node head){
		Node first = head;
		Node second = head;
		while(first!=null && first.next!=null && first.next.next !=null){
			second = second.next;
			first = first.next.next;
		}
		if(first!=null && first.next==null){
			System.out.println("the middle element is "+ second.val);
			return second;
		} 
		else{
			System.out.println("the middle elements are " + second.val + " and "+ second.next.val);
			return second;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertf(list.head, 2);
		list.insertf (list.head, 4);

		list.add(3);

		list.add(5);

		list.insert(2, 2);
		list.add(6);
		//System.out.print(list.get(2));

		
		list.printer(list.head);
		//list.delete(2);
		//list.delete(0);
		//list.printer(list.head);
		ReturnMiddle result = new ReturnMiddle();
		result.returnMiddle(list.head);
		
	}

}
