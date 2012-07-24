package LinkedList;
//import java.util.*;

/**
 * Created by wenqizhu 
 * Apr 15, 2012 3:54:06 PM
 * linkedlist
 **/
public class LinkedList {

    private Node head;
    private int size;
    
    public LinkedList() {
	this.head = null;
	this.size = 0;
    }
    
    public Node getHead(){
    	return this.head;
    }
    
    public void setHead(Node head){
    	this.head = head;
    }
    
    //Insert in front of linklist
    public Node insertInFront(Node head, Object data) {
	Node newNode = new Node(data);
	newNode.setNext(head);
	this.head= newNode;
	this.size++;
	return head;
    }
    
    
    //Add new node to the end of linkedlist
    public void add(Object data) {
	Node newNode = new Node(data);
	if (head == null) {
	    head = newNode;
	    this.size++;
	    }
	else {
	    Node current = head;
	    while(current.getNext() != null)
	    {
		current = current.getNext();
	    }
	    current.setNext(newNode);
	    this.size++;	  
	}
    }
    
    //Insert new node after index;
    public void insert(Object data, int index) {
	Node newNode = new Node(data);
	
	if ( index <= 0) {
	    System.out.println("Invalid index.");
	    }
	
	else if(index>size) {
	    this.add(data);
	}
	else {
	    Node current = head;
	    Node temp = null;
	    for(int i = 1; i < index && current != null; i++ ) {
	    current = current.getNext();
	    }
	    temp = current; 
	    current = current.getNext();
	    temp.setNext(newNode);
	    newNode.setNext(current);
	    this.size++;
	}
    }
    
    public Object get(int index) {
	if(index <= 0 || index>this.size) {
	    return null;}
	Node current = head;
	for(int i = 1;i < index; i++) {
	    current = current.getNext();
	}
	return current.getVal();
	    
	}
    
    public void delete(int index) {
	//delete the head
	if(index==1) {
	    head = head.getNext();
	    this.size--;
	    return;
	}
	else if(index<=0 ||index>this.size) {
	    System.out.println("Invalid index.");
	    return;
	}
	
	Node current = head;
	
	Node temp = null;
	
	for( int i=1; i<index-1 && current.getNext()!=null; i++) {
	    current = current.getNext();
	}
	temp = current;
	current = current.getNext();
	temp.setNext(current.getNext());
	this.size--;
	
    }
    
   
    public boolean deleteNode(Node n){//except last node
    	if(n==null||n.getNext()==null) return false;
    	Node next = n.getNext();
    	n.setVal(next.getVal());
    	n.setNext(next.getNext());
    	return true; 	
    }
    
    public Node deleteNthFromEnd(Node head, int n) {
	if(n == this.size) {
	    head = head.getNext();
	    return head;
	}
	Node current = head;
	Node previous = head;
	Node temp = null;
	
	for(int i = 1; i<=n ; i++) {
	    current= current.getNext();
	}
	while(current.getNext()!= null) {
	    current = current.getNext();
	    previous = previous.getNext();
	}
	
	temp = previous;
	temp = temp.getNext();
	previous.setNext(temp.getNext());
	this.size--;
	return head;
	    
    }
    
   
    
    public Node deleteList(Node head) {
	head = null;
	return head;
    }
    
    public Node reverse(Node head) {
	 
	if(head == null)  return head;
	if(head.getNext() == null)  return head;
	
	Node current = head;
	Node next = current.getNext();
	Node loop = null;
	
	while(next!=null) {
	    current.setNext(loop);
	    loop = current; 
	    current = next;
	    next = next .getNext();
	}
	head = current;
	head.setNext(loop);
	return head;
    }
    
    
    
    public boolean findCircle(Node head){
    	Node slow = head;
    	Node fast = head;
    	while(true){
    		if(fast == null || fast.getNext()==null) return false;
    		else if(fast == slow || fast.getNext() == slow) return true;
    		else{
    			slow = slow.getNext();
    			fast = fast.getNext().getNext();
    		}
    		
    	}
    }
    
    public int size() {
	return this.size;
    }
       
    public void printer(Node node) {
	System.out.print("[ ");
	while(node != null) {
		System.out.print(node.getVal() + " ");
		node = node.getNext();
	}
	System.out.println("]");
}

public static void main(String args[]) {
	LinkedList test = new LinkedList();
	test.add(1);
	test.add(2);
	test.add(3);
	test.add(4);
	test.add(5);
	System.out.println(test.size());
	
	//test.insert(9,2);
	
			
	test.printer(test.head);
	//test.head= test.deleteList(test.head);
	//test.head= test.reverse(test.head);
	//test.printer(test.head);
	
	
	test.printer(test.head);
//	test.head = test.deleteNthFromEnd(test.head, 5);
//	test.printer(test.head);
//	

	
	//System.out.println(test.get(3));
//	System.out.println(test.size());
        
//	test.insertInFront(test.head, 6);
//	test.printer(test.head);
	
	
	//System.out.println(test.get(7));
}
}