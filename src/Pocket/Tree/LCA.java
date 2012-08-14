/**
 * 
 */
package Pocket.Tree;

/**
 * Created by Wenqi Zhu
 * 1:58:28 AM Aug 9, 2012
 * @SanFrancisco
 * Pocket questions
 * 
 */
public class LCA {
	Node findLCA(Node node,int value1,int value2){// for binary search tree
		while(node!= null){
			int value = node.val;
			if(value1>value && value2>value){
				node = node.right;
			}
			else if(value1<value && value2<value){
				node = node.left;
			}
			else
				return node;
		}
		return null;
	}
	
	
	Node findLCARecursion(Node node,Node p,Node q){ // for binary tree, not necessarily a binary search tree
		if(node == null) return null;
		if(node == p || node == q) return node;
		
		boolean is_p_on_left = covers(node.left,p);
		boolean is_q_on_left = covers(node.left,q);
		
		if(is_p_on_left!=is_q_on_left) return node;
		
		Node childside = is_p_on_left?node.left : node.right;
		return findLCARecursion(childside,p,q);
	}
	
	boolean covers(Node node,Node p){ //return true if p is a descendant of node
		if(node == null) return false;
		if(node == p) return true;
		
		return covers(node.left,p) || covers(node.right,p);
	}
	
	static Node lca(Node node,int a, int b){
		if(node == null) return null;
		if(node.val==a || node.val ==b) return node;
		
		Node left = lca(node.left,a,b);
		Node right = lca(node.right,a,b);
		if(left!=null && right!=null){
			return node;
		}		
		return (left!=null)? left : right;
			
	}
	static int lcaint(Node node,int a, int b){
		if(node == null) return -9999;
		if(node.val == a || node.val == b) return node.val;
		
		int left = lcaint(node.left,a,b);
		int right = lcaint(node.right,a,b);
		if(left!=-9999 & right != -9999)  return node.val;//a and b and in both sides.
		return(left!=-9999? left : right);
		
	}
}
