/**
 * 
 */
package Stack;
/**
 * Created by Wenqi Zhu
 * 2:28:02 PM Apr 23, 2012
 * @Buffalo
 */

public class Node{
	private Node next;
	private Object data;
	
	public Node(Object o){
		data = o;
		next = null;
		
	}
	
	public Node getNext(){
		return next;
	}	
	public void setNext(Node next) {
		this.next = next;
	}
	
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object o) {
		this.data = o;
	}
	
}



