/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 5:53:01 PM Sep 17, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
	(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
	You are given a target value to search. If found in the array return its index, otherwise return -1.
	You may assume no duplicate exists in the array.

 */
public class SearchInRotatedSortedArray {
	 public int search(int[] A, int target) {
         // Start typing your Java solution below
	        // DO NOT write main() function
		 return helper(A,0,A.length-1,target);
	 }


	public int helper(int[] A,int left, int right,int target) {
		int mid = (left + right)/2;
		if(target == A[mid]) return mid;
		if(right<left)  return -1;
		
		//Either the left or right half must be normally ordered.Use the normally ordered half to figure out which side to search to find target.
		if(A[left]<=A[mid]){//left is ordered
			if(target>=A[left] && target<=A[mid]){
				return helper(A,left,mid-1,target);
			}
			else{
				return helper(A,mid+1,right,target);
			}
		}
		else { //right is ordered
			if(target>=A[mid] && target<=A[right]){
				return helper(A,mid+1,right,target);
			}
			else{
				return helper(A,left,mid-1,target);
			}
		}
		
	}

}