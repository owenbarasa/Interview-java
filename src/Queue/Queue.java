/**
 * 
 */
package Queue;

/**
 * Created by Wenqi Zhu
 * 12:27:19 PM Apr 28, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 */
public class Queue {

	Node first,last;
	public void enqueue(Object item){
		if (first == null){
			last = new Node(item);
			first = last;
		}else{
			last.setNext(new Node(item));
			last = last.getNext();
		}
	}
	public Object dequeue(){
		if(first!=null){
			Object item = first.getVal();
			first = first.getNext();
			return item;
		}
		return null;
	}
}
	

