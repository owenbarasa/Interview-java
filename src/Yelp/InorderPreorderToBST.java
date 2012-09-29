/**
 * 
 */
package Yelp;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 11:21:09 AM Sep 12, 2012
 * @SanFrancisco
 * 
 */
public class InorderPreorderToBST{
	public Node constructBST(List<Integer> preorder,List<Integer> inorder, int preIndex, int inIndex,int length){
		if(length==0){
			return null;
		}
		Node node = new Node(preorder.get(preIndex));
		int rootIndex = 0;
		
		for(int i = inIndex; i<inorder.size();i++){
			if(inorder.get(i)==node.val){
				break;
			}
			rootIndex++;
		}
		
		node.left = constructBST(preorder,inorder,preIndex+1,inIndex,rootIndex);
		node.right = constructBST(preorder,inorder,preIndex+rootIndex+1,inIndex+rootIndex+1,length-(rootIndex+1));
		return node;
	}
	
	class Node{
		int val;
		Node left;
		Node right;
		Node(int in){
			val = in;
			left = null;
			right = null;
		}
	}
}

