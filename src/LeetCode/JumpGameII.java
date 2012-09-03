/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 6:14:54 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

	Each element in the array represents your maximum jump length at that position.

	Your goal is to reach the last index in the minimum number of jumps.

	For example:
	Given array A = [2,3,1,1,4]

	The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 */
public class JumpGameII {

	public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max = A[0]; //max index of next jump
        int min = 1; // min index of next jump
        
        int step = 0;
        
        if(A.length == 1)
        	return 0;
        
        while(max<A.length-1){
        	int num = max;
        	for(int i = min;i<=max;i++){
        		if(A[i] + i > num)
        			num = A[i]+i;
        	}
        	min = max+1;
        	max = num;
        	step++;
        }
        
        return step+1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
