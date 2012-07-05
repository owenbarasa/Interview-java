/**
 * 
 */
package LinkedList;

/**
 * Created by Wenqi Zhu
 * 5:42:18 PM Apr 26, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 */
public class AddLists {
	
	public Node addLists(Node list1,Node list2,int carry){
		if(list1==null && list2==null && carry ==0){
			return null;
		}
		Node result = new Node(carry);
		int value = carry;
		if(list1!=null){
			value += (Integer)list1.getVal();
		}
		if(list2!=null){
			value += (Integer)list2.getVal();
		}
		result.setVal(value%10);
		
		/*Recurse*/
		if(list1!= null || list2!=null || value >=10){
			Node next = addLists(list1 == null ? null : list1.getNext(),list2== null?null:list2.getNext(),value>=10?1:0);
			result.setNext(next);
			}
		return result;
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList test1 = new LinkedList();
		LinkedList test2 = new LinkedList();
		LinkedList test = new LinkedList();
		test1.add(7);
		test1.add(1);
		test1.add(6);
		test2.add(5);
		test2.add(9);
		test2.add(2);
		
		AddLists result = new AddLists();
		test.setHead(result.addLists(test1.getHead(), test2.getHead(), 0));
		test.printer(test.getHead());

	}

}
