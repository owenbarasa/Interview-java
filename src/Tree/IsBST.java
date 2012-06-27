/**
 * 
 */
package Tree;

/**
 * Created by Wenqi Zhu
 * 11:51:23 PM Jun 26, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 4.5
 */
public class IsBST {
	public boolean isBST1(Node node){
		if(node == null) 
			return false;
		else if(node.getLeft()==null && node.getRight()==null) 
			return true;
		else if(node.getLeft()!=null && node.getRight()==null){
			if(node.getLeft().compareTo(node.getData())>0) 
				return false;
			else
				return isBST1(node.getLeft());
		}
		else if(node.getLeft()==null && node.getRight()!=null){
			if(node.getRight().compareTo(node.getData())<0)
				return false;
			else
				return isBST1(node.getRight());
		}
		else{
			if (node.getLeft().compareTo(node.getData())>0 || node.getRight().compareTo(node.getData())<0)
			  return false;
			else 
			  return isBST1(node.getLeft()) && isBST1(node.getRight());
		}
	} 
	
	public boolean isBST2(Node node){
		return isBST2(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean isBST2(Node node,int min, int max){
		if(node == null) return true;
		if(node.getData()<min || node.getData()>max) return false;
		if(!isBST2(node.getLeft(),min,node.getData()) || !isBST2(node.getRight(),node.getData(),max)){
			return false;
		}
		return true;
	}

}
