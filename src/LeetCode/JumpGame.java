/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 5:54:22 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

	Each element in the array represents your maximum jump length at that position.

	Determine if you are able to reach the last index.

	For example:
	A = [2,3,1,1,4], return true.

	A = [3,2,1,0,4], return false.
 */
public class JumpGame {

	 public boolean canJump(int[] A) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        if(A.length==0)
	        	return false;
	        if(A.length==1)
	        	return true;
	        
	        boolean canjump = false;
	        int count = 0;
	        for(int i = A.length-2; i>=0; i--){
	        	if(A[i]>count){ // can reach "nearest end"(the position that can reach end) from current position
	        		canjump = true; // can reach end when you arrive at A[i]
	        		count = 0;
	        	}
	        	else{ //cannot reach "nearest end" from current position
	        		canjump = false;
	        		count++;
	        	}
	        }
	        
	        return canjump;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
