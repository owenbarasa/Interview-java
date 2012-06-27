/**
 * 
 */
package Tree;

/**
 * Created by Wenqi Zhu
 * 12:24:53 AM Jun 27, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 4.6
 * find the next node(inorder successor) of a given node in a binary search tree.
 */
public class InorderSucc {
	public Node inorderSucc(Node node){
		if(node == null) return null;
		if(node.getParent() == null || node.getRight()!=null){
			return leftMostChild(node.getRight());
		}
		else{
			Node q = node;
			Node x = q.getParent();
			while(x!=null && x.getLeft()!=q){
				q = x;
				x = x.getParent();
			}
			return x;
		}
	}
	
	public Node leftMostChild(Node node){
		if(node == null) return null;
		while(node.getLeft()!=null){
			node = node.getLeft();
		}
		return node;
	}
}
