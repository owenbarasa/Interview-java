package LeetCode2;

/**
 * Created by Wenqi Zhu
 * 3:44:51 PM Dec 2, 2012
 * @Buffalo
 * LeetCode Problems
 * Given a binary tree, determine if it is height-balanced.

	For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return true;
        
        int diff = getHeight(root.left) - getHeight(root.right);
        if(Math.abs(diff) > 1){
        	return false;
        }else{
        	return isBalanced(root.left) && isBalanced(root.right);
        }
    }
	public static int getHeight(TreeNode node){
		if(node == null) return 0;
		return Math.max(getHeight(node.left), getHeight(node.right))+1;
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
