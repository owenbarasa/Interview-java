/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 1:34:28 AM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given an unsorted integer array, find the first missing positive integer.
	For example,
	Given [1,2,0] return 3,
	and [3,4,-1,1] return 2.
	Your algorithm should run in O(n) time and uses constant space.
 */
public class FirstMissingPositive {

	public static int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
		for(int i = 0; i<A.length;i++){
			while(A[i] != i+1 && A[i] > 0 && A[i] <= A.length && A[i] != A[A[i]-1]){
				int tmp = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = tmp;
			}
		}
		
		for(int i = 0; i< A.length; i++){
			if(A[i] != i+1) return i+1;
		}
		
		return A.length+1;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,4,-1,1,2};
		System.out.print(firstMissingPositive(A));
 	}

}
