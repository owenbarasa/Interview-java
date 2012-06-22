/**
 * 
 */
package Tree;
/**
 * Created by Wenqi Zhu
 * 9:43:50 PM Jun 21, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 4.1
 */
public class IsBalanced {

	public static boolean isBalancedN2(Node node){
		if(node == null) return true;
		int heightDiff = BST.maxDepth(node.getLeft()) - BST.maxDepth(node.getRight());
		if(Math.abs(heightDiff)>1) return false;
		else{
			return isBalancedN2(node.getLeft()) && isBalancedN2(node.getRight());
		}
	}
	
	public static int checkHeight(Node node){
		if(node == null){
			return 0;
		}
		
		int leftHeight = checkHeight(node.getLeft());
		if (leftHeight == -1){
			return -1;
		}
		int rightHeight = checkHeight(node.getRight());
		if(rightHeight == -1){
			return -1;
		}
		
		int heightDiff = leftHeight - rightHeight;
		if (Math.abs(heightDiff)>1){
			return -1;
		}
		else{
			return Math.max(leftHeight, rightHeight)+1;
			}
	}
	
	public static boolean isBalancedN(Node node){
		if(checkHeight(node) == -1){
			return false;
		}
		else{
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		BST BST = new BST();
		BST.insert(8);
		BST.insert(4);
		BST.insert(2);
		BST.insert(1);
		BST.insert(3);
		BST.insert(6);
		BST.insert(5);
		BST.insert(7);
		BST.insert(12);
		BST.insert(10);
		BST.insert(9);
		BST.insert(11);
		BST.insert(14);
		BST.insert(13);
		BST.insert(15);
		
		boolean test1 = isBalancedN(BST.getRoot());
		System.out.println(test1);
		boolean test2 = isBalancedN2(BST.getRoot());
		System.out.println(test2);

	}

}
