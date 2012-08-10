/**
 * 
 */
package Pocket.Tree;

/**
 * Created by Wenqi Zhu
 * 6:34:50 PM Aug 9, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class IsBalanced {

	public boolean isBalancedN2(Node node){ // O(n^2)
		if(node == null) return true;
		
		int heightDiff = Depth(node.left)-Depth(node.right);
		if(Math.abs(heightDiff)>1) return false;
		else{
			return isBalancedN2(node.left) && isBalancedN2(node.right);
		}
	}
	
	public int Depth(Node node){
		if(node == null)
			return 0;
		int lDepth = Depth(node.left);
		int rDepth = Depth(node.right);
		return Math.max(lDepth,rDepth) + 1;	
	}
	
	
	public boolean isBalanceN(Node node){ //O(n)
		if(checkHeight(node)==-1){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	public int checkHeight(Node node){
		if(node == null) return 0;
		
		int leftHeight = checkHeight(node.left);
		if(leftHeight == -1){
			return -1;
		}
		int rightHeight = checkHeight(node.right);
		if(rightHeight == -1){
			return -1;
		}
		int heightDiff = leftHeight - rightHeight;
		if(Math.abs(heightDiff)>1){
			return -1;
		}
		else{
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
