/**
 * 
 */
package Queue;



/**
 * Created by Wenqi Zhu
 * 12:58:10 PM Apr 28, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 */
public class Node {
	    private Object val;
	    private Node next;
	    
	    public Node(Object o){
		val = o;
		next = null;
	    }

	    public Object getVal() {
	        return val;
	    }

	    public void setVal(Object val) {
	        this.val = val;
	    }

	    public Node getNext() {
	        return next;
	    }

	    public void setNext(Node next) {
	        this.next = next;
	    }

	}

