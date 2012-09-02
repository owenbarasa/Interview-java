/**
 * 
 */
package LeetCode;
import java.util.*;

/**
 * Created by Wenqi Zhu
 * 12:24:03 AM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal {
	
	public static ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
		Stack<TreeNode> stack = new Stack<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		TreeNode current = root;
		boolean done = false;
		while(!done){
			if(current!=null){
				stack.push(current);
				current = current.left;
			}
			else{
				if(!stack.isEmpty()){
					current = stack.pop();
					result.add(current.val);
					current = current.right;
				}
				else{
					done = true;
				}
			}
		}
		return result;
    }
	
	
	public static ArrayList<Integer> inorderTraversalR(TreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		help(result, root);
		return result;
		
	}
	
	public static void help(ArrayList<Integer> result, TreeNode node) {
		if(node == null) {
			return;
		} else {
			help(result, node.left);
			result.add(node.val);
			help(result, node.right);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(2);
		a.left = new TreeNode(1);
		a.right = new TreeNode(3);
		System.out.print(inorderTraversalR(a));
		
	}

}
class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { 
		 val = x; 
	   }
	 
}
