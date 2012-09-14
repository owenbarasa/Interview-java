/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 11:55:15 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].


 */
public class RemoveDuplicatesFromSortedArray {

	/**
	 * @param args
	 */
	public int removeDuplicates(int[] A) {
        int size = A.length;
        if (size <= 1)
            return size;
        
        int fast = 1;
        int slow = 0;
        while ( fast < size) {
            if (A[slow] != A[fast]) {
                A[slow+1] = A[fast];
                slow++;
            }
            fast++;
        }
        return slow+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
