/**
 * 
 */
package Pocket.LinkedList;

/**
 * Created by Wenqi Zhu
 * 7:32:02 PM Aug 13, 2012
 * @SanFrancisco
 * Pocket questions
 * Copy a linked list which each node has a random pointer.
 */
public class CopyWithRandom {


    class RandomNode{
    	int val;
    	RandomNode next;
    	RandomNode random;
    	public RandomNode(int v){
    		val = v;
    		next = null;
    		random = null;
    	}
    }
    
    public RandomNode copyWithRandom(RandomNode node){
    	RandomNode curr = node;
    	RandomNode next, temp;
    	
    	while(curr != null){ // copy each node and insert it between current node and next node
    		next = curr.next;
    		temp = new RandomNode(curr.val);
    		temp.next = next;
    		curr.next = temp;
    		curr = next;
    	}
    	

    	curr = node;
    	
    	while(curr!=null){  // copy the random pointer
    		curr.next.random = curr.random.next;
    		curr = curr.next.next;
    	}
    	
    	
    	RandomNode copy = node.next;
    	curr = node;
    	temp = curr.next;
    	while(curr!=null && temp!=null){ //delete the links
    		curr.next = curr.next.next;
    		curr = curr.next;
    		if(temp.next!=null){
    			temp.next = temp.next.next;
    			temp = temp.next;
    		}
    	}
    	
    	return copy;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
