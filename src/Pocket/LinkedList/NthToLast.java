
/**
 * 
 */
package Pocket.LinkedList;

/**
 * Created by Wenqi Zhu
 * 1:00:06 AM Aug 11, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class NthToLast {

	
	public Node nthToLast(Node node,int n){//return the nth to last element;
		if(n<=0){
			return null;
		}
		
		Node p1 = node;
		Node p2 = node;
		
		for(int i = 0;i<n-1;i++){
			if(p2==null) return null;
			p2 = p2.next;
		}
		if(p2 == null) return null;
		
		while(p2.next!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
		
	}
	
	public Node deleteNthToLast(Node head,int n){
		Node p1 = head;
		Node p2 = head;
		int i;
		for(i = 0;i<n && p1!=null;i++){
			p1= p1.next;
		}
		if(p1==null){
			head.val= head.next.val;
			head.next = head.next.next;
			return head;		
		}
		else{
		while(p1.next!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		p2.next=p2.next.next;
		return head;
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
		list.printer(list.head);
		NthToLast result = new NthToLast();
		//Node nth = result.nthToLast(list.head,5);
		//System.out.println(nth.val);
		result.deleteNthToLast(list.head, 5);
		list.printer(list.head);
	}

}
