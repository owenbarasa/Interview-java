/**
 * 
 */
package Tree;

/**
 * Created by Wenqi Zhu
 * 10:42:47 PM Jun 25, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 4.7
 * Given the value of two nodes in a binary tree/binary search tree, find the lowest common ancestor.
 * O(log(n)).
 */
public class LowestCommonAncestor {
	public Node findLowestCommonAncestor(Node node, int value1, int value2){//binary search tree
		Node current = node;
		while(current!=null){
		if(current.compareTo(value1)>0 && current.compareTo(value2)>0){
			current = current.getLeft();
		}else if(current.compareTo(value1)<0 && current.compareTo(value2)<0){
			current = current.getRight();
		}else{
			return current;
		}		
	}
		
		return null;
	}
	
	public boolean covers(Node node,Node p){// return true if p is a descendent of node
		if(node == null) return false;
		if(node == p) return true;
		return covers(node.getLeft(),p) || covers(node.getRight(),p);
	}
	
	public Node commonAncestorHelper(Node node,Node p, Node q){
		if(node == null) return null;
		if(node == p || node ==q) return node;
		
		boolean is_p_on_left = covers(node.getLeft(),p);
		boolean is_q_on_left = covers(node.getLeft(),q);
		
		if(is_p_on_left != is_q_on_left) return node;//if p and q are on different sides,return node.
		
		Node child_side = is_p_on_left ? node.getLeft() : node.getRight();//Else,they are on the same side.Traverse this side.
		return commonAncestorHelper(child_side,p,q);	
		
	}
	
	public Node commonAncestor(Node node,Node p,Node q){//Error check
		if(!covers(node,p)||!covers(node,q)){
			return null;
		}
		return commonAncestorHelper(node,p,q);
		
	}
}