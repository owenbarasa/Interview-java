/**
 * 
 */
package Tree;

/**
 * Created by Wenqi Zhu
 * 1:41:59 PM May 11, 2012
 * @Buffalo
 */

public class Node{

	private Node left;
	private Node right;
	private int data;
		

	public Node(){
		left = null;
		right = null;
		data = 0;
	}
	
	public Node(int newData){
		left = null;
		right = null;
		data = newData;
	}
	
	public int compareTo(int x){
		if (data > x) return 1;
		else if (data < x) return -1;
		else{
			return 0;
		}
	}
	
	public Node getLeft(){
		return left;
	}
	
	public Node getRight(){
		return right;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}