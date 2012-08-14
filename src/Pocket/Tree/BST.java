/**
 * 
 */
package Pocket.Tree;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 6:21:24 PM Aug 8, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class BST {

	/**
	 * @param args
	 */
	Node root = null;
	//Node curr = root;
	
	boolean isEmpty(){
		return root==null ? true : false;
	}
	
	Node create(int number){
		return new Node(number);
	}
	
	Node insert(Node node, int num){
		if(node == null){
			node = create(num);
			return node;
		}
		if(num<node.val){
			node.left = insert(node.left,num);
		}
		else if(num>=node.val){
			node.right = insert(node.right,num);
		}
		return node;
	}
	
	void insert(int number){
		root = insert(root,number);	
	}
	
	public Node delete(Node node, int data){
		if(node == null){
			return null;
		}
		
		if(node.val>data){
			node.left = delete(node.left,data);
		}
		else if(node.val<data){
			node.right = delete(node.right,data);
		}
		else{
			if(node.left!=null && node.right!= null){
				node.val = minValue(node.right);
				node.right = removeMin(node.right);
			}
			else{
				node = (node.left != null)? node.left : node.right;
			}
		}
		return node;
	}
	
	public int minValue(Node node){
		Node current = node;
		while(current.left!=null){
			current = current.left;
		}
		return current.val;
	}
	
	public Node removeMin(Node node){
		 if(node == null){
			 return null;
		 }
		 else if(node.left!=null){
			 node.left =removeMin(node.left);
			 return node;
		 }else{
			 return node.right;
		 }
	}
	
	void preorderPrint(Node node){
		if (node == null) return;
		System.out.print(node.val + " ");
		preorderPrint(node.left);
		preorderPrint(node.right);
	}
	
	void inorderPrint(Node node){
		if(node == null) return;
		inorderPrint(node.left);
		System.out.print(node.val+" ");
		inorderPrint(node.right);
	}
	
	void postorderPrint(Node node){
		if(node == null) return;
		postorderPrint(node.left);
		postorderPrint(node.right);
		System.out.print(node.val + " ");
		
	}
	
	void preorderPrintNoR(Node node){
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		
		while(!stack.isEmpty()){
			Node current = stack.pop();
			if(current == null) break;
			System.out.print(current.val + " ");
			Node n = current.right;
			if(n!=null){
				stack.push(n);
			}
			n = current.left;
			if(n!=null){
				stack.push(n);
			}
		}
		System.out.println();
	}
	
	void inorderPrintNoR(Node node){
		Stack<Node> stack = new Stack<Node>();
		Node current = node;
		boolean done = false;
		while(!done){
			if(current != null){
				stack.push(current);
				current = current.left;
			}
			else{
				if(!stack.isEmpty()){
					current = stack.pop();
					System.out.print(current.val + " ");
					current = current.right;
				}
				else
					done = true;
			}
		}
		System.out.println();
		
	}
	void postorderPrintNoR(Node node){
		if(node == null) return;
		Stack<Node> stack = new Stack<Node>();
		Node prev = null;
		stack.push(node);
		while(!stack.isEmpty()){
			Node current = stack.peek();
			if(prev == null || prev.left == current || prev.right == current){// We are traversing down the tree
				if(current.left!=null){
					stack.push(current.left);
				}
				else if(current.right!=null){
					stack.push(current.right);
				}
				else{
					System.out.print(current.val+ " ");
					stack.pop();
				}
			}
			else if(current.left==prev){ //we are traversing up from left
				if(current.right!=null){
					stack.push(current.right);
				}
				else{
					System.out.print(current.val + " ");
					stack.pop();
				}
			}
			else if(current.right == prev){ //we are traversing up from right
				System.out.print(current.val + " ");
				stack.pop();
			}
			
			prev = current;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		bst.insert(4);
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		bst.insert(6);
		bst.insert(5);
		bst.insert(7);
		//bst.preorderPrint(bst.root);
		//System.out.println();
		//bst.inorderPrint(bst.root);
		//System.out.println();
		//bst.postorderPrint(bst.root);
		//System.out.println();
		
		bst.delete(bst.root, 2);
		bst.preorderPrintNoR(bst.root);
		bst.postorderPrintNoR(bst.root);
		
		bst.inorderPrintNoR(bst.root);

	}

}
