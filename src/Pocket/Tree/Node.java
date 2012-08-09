/**
 * 
 */
package Pocket.Tree;

/**
 * Created by Wenqi Zhu
 * 6:21:36 PM Aug 8, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class Node {
	int val;
	Node parent;
	Node left;
	Node right;
	
	Node(){
		val = 0;
		parent = null;
		left = null;
		right = null;
	}
	
	Node(int data){
		val = data;
		parent = null;
		left = null;
		right = null;
	}

}
