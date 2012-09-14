/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 6:56:30 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Two elements of a binary search tree (BST) are swapped by mistake.

Recover the tree without changing its structure.
 */
public class RecoverBinarySearchTree {
	public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return;
        ArrayList<TreeNode> result = new ArrayList<TreeNode>();
        inorder(result,root);
        if(result.size()<2) return;
        
        TreeNode node1 = null;
        TreeNode node2 = null;
        for(int i = 0;i<result.size();i++){
        	if(result.get(i).val>result.get(i+1).val){
        		node1 = result.get(i);
        		break;
        	}
        }
        for(int i = result.size()-1;i>=0;i--){
        	if(result.get(i).val<result.get(i-1).val){
        		node2 = result.get(i);
        		break;
        	}
        }
        
        node1.val=node1.val^node2.val;
		node2.val=node1.val^node2.val;
		node1.val=node1.val^node2.val;

    }
	
	public void inorder(ArrayList<TreeNode> result, TreeNode node){
		if(node == null) return;
		inorder(result,node.left);
		result.add(node);
		inorder(result,node.right);
	}
}
