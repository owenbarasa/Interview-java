/**
 * 
 */
package LinkedLists;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 5:38:02 PM Apr 24, 2012
 * @Buffalo
 * programming interviews exposed
 */
public class DeleteDuplicate {

	public static void deleteDuplicate(Node head){
		Hashtable table = new Hashtable();
		Node previous = null;
		Node current = head;
		while(current != null){
			if(table.containsKey(current.getVal())){
				previous.setNext(current.getNext());
			} else{
				table.put(current.getVal(),true);
				previous=current;
				}
			current = current.getNext();
	       }
       }
	public static void deleteDuplicate2(Node head){
		if(head==null) return;
		Node current = head;
		while(current!=null){
			Node runner = current.getNext();
			Node previous = current;
			while(runner!=null){
			if(runner.getVal() == current.getVal()){
				
				while(previous.getNext()!=runner){// previous references to the Node preceding runner.
					previous= previous.getNext();
				}
				previous.setNext(runner.getNext());
				runner= runner.getNext();
				}
			else{
				runner= runner.getNext();
			}
			
		}
	  current = current.getNext();		
	}
	}
	
	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add('F');
		test.add('O');
		test.add('L');
		test.add('L');
		test.add('O');
		test.add('W');
		test.add(' ');
		test.add('U');
		test.add('P');
		test.add('P');
		
		test.printer(test.getHead());
		//DeleteDuplicate result = new DeleteDuplicate();
		//DeleteDuplicate.deleteDuplicate(test.getHead());
		//test.printer(test.getHead());
		DeleteDuplicate.deleteDuplicate2(test.getHead());
		
		test.printer(test.getHead());	
		
	}

}
