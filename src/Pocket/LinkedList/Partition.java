/**
 * 
 */
package Pocket.LinkedList;

/**
 * Created by Wenqi Zhu
 * 10:49:47 PM Aug 11, 2012
 * @SanFrancisco
 * Pocket questions
 * Write code to partition linked list around a value x,such that all nodes less than x
 * come before all nodes greater than x.
 */
public class Partition {

	/**
	 * @param args
	 */
	public Node partition(Node head,int x){
		Node start1 = null;
		Node end1 = null;
		Node start2 = null;
		Node end2 =null;
		while(head!=null){
			Node next = head.next;
			head.next = null;
			if((Integer)head.val< x){
				if(start1==null){
					start1 = head;
					end1 = start1;
				}
				else{
					end1.next = head;
					end1 = head;
				}	
			}
			else{
				if(start2==null){
					start2 = head;
					end2 = start2;
				}
				else{
					end2.next=head;
					end2 = head;
				}
			}
			head = next;
		}
		
		if(start1 == null){
			return start2;
		}
		
		end1.next = start2;
		return start1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertf(list.head, 2);
		list.insertf (list.head, 4);

		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(1);
		//list.insert(2, 2);
		list.add(6);
		//System.out.print(list.get(2));

		
		list.printer(list.head);
		//list.delete(2);
		//list.delete(0);
		//list.printer(list.head);
		Partition result = new Partition();
		list.head = result.partition(list.head, 3);
		list.printer(list.head);
		
	}

}
