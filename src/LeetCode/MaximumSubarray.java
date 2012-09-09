/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 9:49:03 PM Sep 8, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

	For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
	the contiguous subarray [4,−1,2,1] has the largest sum = 6.


 */
public class MaximumSubarray {

	public int maxSubArray(int[] A) {  // For each element in the array we want to track the subarray with the largest sum ending here.
        // Start typing your Java solution below
        // DO NOT write main() function
        int max = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        
        for(int i = 0; i<A.length;i++){
        	maxEndingHere = Math.max(maxEndingHere+A[i], A[i]);
        	max = Math.max(max,maxEndingHere);
        }
        
        return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
