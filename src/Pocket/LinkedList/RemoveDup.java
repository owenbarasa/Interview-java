/**
 * 
 */
package Pocket.LinkedList;

/**
 * Created by Wenqi Zhu
 * 12:17:59 AM Aug 11, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class RemoveDup {

	public void removeDup(Node node){
		if(node == null){
			return;
		}
		Node current = node;
		while(current!=null){
			Node runner = current;
			while(runner.next!=null){
				if(runner.next.val== current.val){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList test = new LinkedList();
		test.add(1);
		test.add(2);
		test.add(2);
		test.add(3);
		test.add(3);
		
		RemoveDup result = new RemoveDup();
		result.removeDup(test.head);
		test.printer(test.head);
	}

}
