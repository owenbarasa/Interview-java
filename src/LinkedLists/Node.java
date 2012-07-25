package LinkedLists;
/**
 * Created by wenqizhu 
 * Apr 15, 2012 6:32:28 PM
 * linkedlist
 **/
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
