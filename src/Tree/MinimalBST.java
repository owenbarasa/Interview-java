/**
 * 
 */
package Tree;

/**
 * Created by Wenqi Zhu
 * 11:27:33 PM Jun 21, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 4.2
 * Given a sorted(increased order)array, write an algorithm to create a binary search tree with minimal height.
 */
public class MinimalBST {
	
	public Node createMinimalBST(int array[]){
		return createMinimalBST(array,0,array.length-1);
	}
	private Node createMinimalBST(int arr[], int start, int end){
		if(end < start){
			return null;
		}
		int mid = (start + end)/2;
		Node node = new Node(arr[mid]);
		node.setLeft(createMinimalBST(arr,start,mid-1));
		node.setRight(createMinimalBST(arr,mid+1,end));
		return node;
	}
	public static void main(String[] args) {
		int[] inputArray = new int[10];
		for(int i = 0; i< 10; i++){
			inputArray[i] = i;
			}
		BST BST = new BST();
		MinimalBST MHT = new MinimalBST();
		BST.preorderTraversalIterative(MHT.createMinimalBST(inputArray));
		System.out.println();
		System.out.println(BST.maxDepth(MHT.createMinimalBST(inputArray)));

		//BST.inorderTraversalIterative(MHT.createMinimalBST(inputArray));
					

	}

}
