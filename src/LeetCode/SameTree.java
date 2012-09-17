/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 11:23:10 PM Sep 16, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given two binary trees, write a function to check if they are equal or not.

	Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {

	 public boolean isSameTree(TreeNode p, TreeNode q) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        if(p == null && q== null) return true;
	        if(p == null && q!=null || p !=null && q==null) return false;
	        
	        boolean isLeftSame = false;
	        boolean isRightSame = false;
	        if(p.val==q.val){
	        	isLeftSame = isSameTree(p.left, q.left);
	        	isRightSame = isSameTree(p.right,q.right);
	        }else
	        	return false;
	        
	        return (isLeftSame== true && isRightSame==true)?true:false;
	        
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
