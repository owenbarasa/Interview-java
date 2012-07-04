/**
 * 
 */
package Tree;

/**
 * Created by Wenqi Zhu
 * 11:47:14 PM Jul 3, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 4.9
 * Given a binary tree, print all paths which sum to a given value. A path can start or end anywhere int the tree.
 */
public class FindSum {
	public void findSum(Node node, int sum, int[] path, int level){
		if(node == null){
			return;
		}
		
		path[level] = node.getData();
		
		int t = 0;
		for(int i = level; i>=0; i--){
			t = t + path[i];
			if(t == sum){
				print(path,i,level);
			}
		}
		
		findSum(node.getLeft(),sum,path,level+1);
		findSum(node.getRight(),sum,path,level+1);
		
		//path[level] = Integer.MIN_VALUE;
	}
	
	public void findSum(Node node, int sum){
		int depth = BST.maxDepth(node);
		int[] path = new int[depth];
		findSum(node,sum,path,0);
	}
	
	public static void print(int[] path, int start, int end){
		for(int i = start; i<=end; i++){
			System.out.print(path[i] + " ");
			}
		System.out.println();
	}
	
}



