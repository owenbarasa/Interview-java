/**
 * 
 */
package Tree;


/**
 * Created by Wenqi Zhu
 * 3:32:29 PM May 28, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 */
public class BST {
	private Node root;
	private int size;
	 Node current = root;
	public BST(){
		root = null;
		size = 0;
	}
	
	public Node create(int x){
		Node newNode = new Node(x);
		return newNode;
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
	public Node insert(Node newNode,int data){
		if(newNode == null){
			newNode = create(data);
			return newNode;
		}
		else if (newNode.compareTo(data)<0){
			if (newNode.getRight() == null) 
				newNode.setRight(create(data));
			else{
				newNode = insert(newNode.getRight(),data);
			}
		}
		else if (newNode.compareTo(data)>=0){
			if(newNode.getLeft()==null)
				newNode.setLeft(create(data));
			else{
				newNode = insert(newNode.getLeft(),data);
			}
		}
		return null;
	}
	
	public boolean search(int data){
		if(isEmpty()){
			return false;
		}
		else{
			current = find(root, data);
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
    			Node parent =root;
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
		Node parent = node;
		
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
		}
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
			return node;
		}
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
	
	
	
}
