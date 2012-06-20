/**
 * 
 */
package Tree;
import java.util.*;


/**
 * Created by Wenqi Zhu
 * 3:32:29 PM May 28, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 */
public class BST {
	private Node root;
	private int size;
	 //Node current = root;
	public BST(){
		root = null;
		size = 0;
	}
	public Node getRoot(){
		return root;
	}
	public Node create(int x){
		Node node = new Node(x);
		return node;
	}
	public boolean isEmpty(){
		return root == null ? true:false;
	}
	public int getSize(){
		return root == null ? 0 : size;
	}
	public int getSize(Node node){
		return root == null ? 0 : (getSize(node.getLeft())+1+getSize(node.getRight()));
	}
	
	public void insert(int data){
		Node current = insert(root,data);
		if(isEmpty()==true && current !=null){
			root = current;
		}
		size++;
		
	}
	private Node insert(Node node,int data){
		if(node == null){
			node = create(data);
			return node;
		}
		else if (node.compareTo(data)<0){
			if (node.getRight() == null) 
				node.setRight(create(data));
			else{
				node = insert(node.getRight(),data);
			}
		}
		else if (node.compareTo(data)>=0){
			if(node.getLeft()==null)
				node.setLeft(create(data));
			else{
				node = insert(node.getLeft(),data);
			}
		}
		return null;
	}
	
	public boolean search(int data){
		if(isEmpty()){
			return false;
		}
		else{
			Node current = find(root, data);
			if (current!= null) return true;
			else return false;
		}
	}
	
    private Node find(Node node, int data){
    	while(node.getData()!=data && node!= null){
    		if (node.compareTo(data)>0){
    			node = node.getLeft();
    		}else{
    			node = node.getRight();
    		}
    	}
    	return node;	
    }
    
    public boolean deleteNorecursion(int data){
    	if(isEmpty()) return false;
    	else {
    			Node current=root,parent =root;
    			boolean found = false;
    			while(current != null && !found){
    				if(current.compareTo(data) == 0){
    				    found = true;
    				    
    				    if(current == parent.getLeft()){
    					parent.setLeft(replacement(current));
    				    }
    				    else if(current == parent.getRight()){
    				    	parent.setRight(replacement(current));
    				    }
    				    else{
    				    	current = replacement(current);
    				    	size--;
    				    	return true;
    				    }
    				    
    				}
    				else{
    					parent = current;
    					if(current.compareTo(data)>0){
    						current = current.getLeft();
    					}
    					else{
    						current = current.getRight();
    					}
    				}
    			}
    			if(!found) return false;
    			else{
    				size--;
    				return true;
    			}
    	}
    }

	private Node replacement(Node node){// return the node that will replace in the deleted one
		Node result = null;
		Node current=node, parent = node;
		
		if (node.getLeft() == null && node.getRight() == null){//node to be deleted is a leaf node
			return null;
		}
		else if (node.getLeft()!=null && node.getRight()== null){//node to be deleted has no rightchild
			result = node.getLeft();
		}
		else if (node.getLeft()== null && node.getRight()!= null){//node to be deleted has no leftchild
			result = node.getRight();
		}
		else{/*node to be deleted has both left and right children
			  find the leftmost child in its right subtree.
			*/
			current = node.getRight();
		
		    while(current.getLeft()!=null){
			parent = current;
			current = current.getLeft();
		    }
		   if(node.getRight() == current){//the right child of deleted node is a leaf node.
		     current.setLeft(node.getLeft());
		   }
		   else{
			   parent.setLeft(current.getRight());
			   current.setLeft(node.getLeft());
			   current.setRight(node.getRight());
		   }
		   result = current;
		}
		   return result;	   
	       }

	public void delete(int data){
		root = delete(root,data);	
	}
	
	private Node delete(Node node, int data){ //given the root, delete the node with specific data value.
		if(node == null)
			return null;
		if(node.compareTo(data)>0){
			node.setLeft(delete(node.getLeft(),data));
		}else if(node.compareTo(data)<0){
			node.setRight(delete(node.getRight(),data));
		}else{
			if(node.getLeft()!=null && node.getRight()!=null){
				node.setData(minValue(node.getRight()));
				node.setRight(removeMin(node.getRight()));
			}
			else{
				node = (node.getLeft()!=null) ? node.getLeft() :node.getRight();
			}
		}
		return node;
	}
	
	public int minValue(){
		return minValue(root);
	}
	
	private int minValue(Node node){
		Node current = node;
		while(current.getLeft()!= null){
			current = current.getLeft();
		}
		return current.getData();
	}
	
	private Node removeMin(Node node){//remove the left 
		if(node == null)
			return null;
		else if (node.getLeft()!=null){
			node.setLeft(removeMin(node.getLeft()));
			return node;
		}
		else{
			return node.getRight();
		}
	}
	
	public int maxDepth(){
		return maxDepth(root);
	}
	
	private int maxDepth(Node node){
		int lDepth,rDepth;
		if (node == null) return 0;
		
		lDepth = maxDepth(node.getLeft());
		rDepth = maxDepth(node.getRight());
		
		return(Math.max(lDepth, rDepth)+1);
	}
	
	public void preorderTraversal(){
		preorderTraversal(root);
	}
	
	private void preorderTraversal(Node node){
		if (node == null) return;
		System.out.print(node.getData() + " ");
		preorderTraversal(node.getLeft());
		preorderTraversal(node.getRight());
	}
	
	public void inorderTraversal(){
		inorderTraversal(root);
	}
	
	private void inorderTraversal(Node node){
		if(node == null) return;
		inorderTraversal(node.getLeft());
		System.out.print(node.getData() + " ");
		inorderTraversal(node.getRight());
	}
	
	public void postorderTraversal(){
		postorderTraversal(root);
	}
	
	private void postorderTraversal(Node node){
		if(node ==null) return;
		postorderTraversal(node.getLeft());
		postorderTraversal(node.getRight());
		System.out.print(node.getData() + " ");
	}
	
	public void preorderTraversalIterative(Node node){

		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		while(!stack.empty()){
			Node current = stack.pop();
			if(current == null) break;
			System.out.print(current.getData() + " ");
			Node n = current.getRight();
			if(n!=null)
				stack.push(n);
			n = current.getLeft();
			if(n!=null)
				stack.push(n);
		}
	}
	
	public void inorderTraversalIterative(Node node){
//		1) Create an empty stack.
//		2) Initialize current node as root
//		3) Push the current node to stack and set current = current->left until current is NULL
//		4) If current is NULL and stack is not empty then
//		     a) Pop the top item from stack.
//		     b) Print the popped item, set current = current->right
//		     c) Go to step 3.
//		5) If current is NULL and stack is empty then we are done.
		
		Stack<Node> stack = new Stack<Node>();
		Node current = node;
		boolean done = false;
		while(!done){
			if(current != null){
			stack.push(current);
			current = current.getLeft();		
			}
			else{
				if(!stack.empty()){
					current = stack.pop();
					System.out.print(current.getData() + " ");
					current = current.getRight();
				}
				else
					done = true;
			}
		}
	}
	public void postorderTraversalIterative(Node node){
		if(node == null) return;
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		Node prev = null;
		while(!stack.empty()){
			Node current = stack.peek();
			if(prev ==null || prev.getLeft()==current || prev.getRight()==current){//we are traversing down the tree
				if(current.getLeft()!= null){
					stack.push(current.getLeft());
				}
				else if(current.getRight()!=null){
					stack.push(current.getRight());
				}
				else{
					System.out.print(current.getData()+ " ");
					stack.pop();
				}
			}else if(current.getLeft() == prev){
				if(current.getRight()!=null){
					stack.push(current.getRight());
				}else{
					System.out.print(current.getData()+ " ");
					stack.pop();
				}
			}else if (current.getRight()== prev){
				System.out.print(current.getData()+ " ");
				stack.pop();
			}
		prev = current;	
		}
	}
	
	public static void main(String[] args){
		BST BST = new BST();

		//int inputArray[] = new int[10];
		// inputArray[0] = 26;
		// for(int i = 1; i < 10; i++){
		// inputArray[i] = i*i;
		// }
		// for(int i = 0; i < 10; i++){
		// RBT.insert(inputArray[i]);
		// }
		BST.insert(8);
		BST.insert(4);
		BST.insert(2);
		BST.insert(1);
		BST.insert(3);
		BST.insert(6);
		BST.insert(5);
		BST.insert(7);
		BST.insert(12);
		BST.insert(10);
		BST.insert(9);
		BST.insert(11);
		BST.insert(14);
		BST.insert(13);
		BST.insert(15);
		
		BST.preorderTraversal();
		System.out.println(" ");
		
		BST.delete(3);
		BST.deleteNorecursion(10);
		
		System.out.println("PREORDER WALK");
		BST.preorderTraversal();
		System.out.println(" ");
		BST.preorderTraversalIterative(BST.getRoot());
		System.out.println(" ");
		
		System.out.println("INORDER WALK");
		BST.inorderTraversal();
		System.out.println(" ");
		BST.inorderTraversalIterative(BST.getRoot());
		System.out.println(" ");
		
		System.out.println("POST ORDER WALK");
		BST.postorderTraversal();
		System.out.println(" ");
		BST.postorderTraversalIterative(BST.getRoot());
		System.out.println(" ");


		System.out.println("Depth is: " + BST.maxDepth());
		System.out.println(BST.search(19));
	}
}
