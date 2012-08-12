/**
 * 
 */
package Pocket.LinkedList;

/**
 * Created by Wenqi Zhu
 * 1:26:02 PM Aug 10, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class LinkedList {

	Node head;
	int size;
	
	LinkedList(){
		this.head = null;
		this.size = 0;
	}
	
	//Insert in front of LinkedList
	
	Node insertf(Node node,Object data){
		Node newNode = new Node(data);
		if(node == null){
			this.head = newNode;
			this.size++;
		}
		
		else{
		newNode.next = head;
		this.head = newNode;
		this.size++;
		}
		return head;
	}
	
	//Add a node to the end of list
	void add(Object data){
		Node newNode = new Node(data);
		if(head == null){
			this.head = newNode;
			this.size++;
		}
		else{
			Node current = head;
			while(current.next!=null){
				current = current.next;
			}
			current.next = newNode;
			this.size++;
		}
		
	}
	
	//Insert a new node after index:
	void insert(Object data,int index){
		Node newNode = new Node(data);
		if(index<0){
			insertf(newNode,data);
		}
		else if(index>=size){
			this.add(data);		
		}
		else{
			Node current = head;
			Node temp = null;
			for(int i = 0; i<index && current!=null;i++){
				current = current.next;
			}
			temp = current;
			current = current.next;
			temp.next = newNode;
			newNode.next = current;
			this.size++;
		}
		
	}
	
	Object get(int index){
		if(index<0 || index>this.size){
			return null;
		}
		Node current = head;
		for(int i=0;i<index;i++){
			current = current.next;
		}
		
		return current.val;
	}
	
	void delete(int index){
		if(index == 0){//delete the head
			head = head.next;
			this.size--;
			return;
		}
		else if(index<0 ||index>this.size){
			System.out.println("Invalid index");
			return;
		}
		Node current = head;
		
		
		for(int i = 0; i< index-1;i++){
			current = current.next;
		}
		current.next = current.next.next;
		this.size--;
	}
	
	Node reverse(Node node){
		if(node == null) return null;
		Node curr,next,prev;
		curr = node;
		next = null;
		prev = null;
		
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		//node = prev;
		return prev;
	}
	
	
	
	void printer(Node node) {
		System.out.print("[ ");
		while(node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println("]");
	}
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.insertf(list.head, 2);
		list.insertf (list.head, 4);

		list.add(3);

		list.add(5);

		list.insert(2, 2);
		
		//System.out.print(list.get(2));

		
		//list.printer(list.head);
		//list.delete(2);
		//list.delete(0);
		list.printer(list.head);
		
		list.head = list.reverse(list.head);
		list.printer(list.head);
		
		
	}
}
