/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 9:45:50 PM Sep 17, 2012
 * @SanFrancisco
 * LeetCode Problems
	 * Follow up for "Search in Rotated Sorted Array":
	What if duplicates are allowed?
	
	Would this affect the run-time complexity? How and why?
	
	Write a function to determine if a given target is in the array.


 */
public class SearchInRotatedSortedArrayII {
	public boolean search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int result = helper(A,0,A.length-1,target);
        if(result<0) return false;
        else return true;
    }
	
	public int helper(int[] A, int left, int right, int target){
		int mid = (left + right)/2;
		if(target==A[mid]) return mid;
		if(right<left) return -1;
		
		if(A[left] < A[mid]){ //left is ordered
			if(target>=A[left]&&target<=A[mid]){
				return helper(A,left,mid-1,target);
			}
			else{
				return helper(A,mid+1,right,target);
			}
		}
		else if(A[left]> A[mid]){// right is ordered
			if(target>=A[mid]&&target<=A[right]){
				return helper(A,mid+1,right,target);
			}
			else{
				return helper(A,left,mid-1,target);
			}
			
		}
		else{
			if(A[mid]!=A[right]){
				return helper(A,mid+1,right,target);
			}
			else{ //we have to search both halves
				int res = helper(A,left,mid-1,target);
				if(res == -1){
					return helper(A,mid+1,right,target);
				}
				else{
					return res;
				}
			}
		}
	}
	
}
