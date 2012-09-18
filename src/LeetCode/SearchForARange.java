/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 5:20:08 PM Sep 17, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a sorted array of integers, find the starting and ending position of a given target value.

	Your algorithm's runtime complexity must be in the order of O(log n).
	
	If the target is not found in the array, return [-1, -1].
	
	For example,
	Given [5, 7, 7, 8, 8, 10] and target value 8,
	return [3, 4].
 */
public class SearchForARange {
	  public int[] searchRange(int[] A, int target) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		  	if(A.length==1) return new int[]{0,0};
	        int last = A.length-1;
	        int start = 0;
	        
	        while(start<=last){
	        	int mid = (start + last)/2;
	        if(target == A[mid]){
	        	int begin = mid-1;
	        	int end = mid+1;
	        	while(begin>=0 && A[begin]==target){
	        		begin--;
	        	}
	        	begin++;
	        	while(end<A.length && A[end]==target){
	        		end++;
	        	}
	        	end--;
	        	return new int[]{begin,end};
	        }
	        else if(target<A[mid]){
	        	last = mid-1;
	        }
	        else{
	        	start = mid +1;
	        }
	        }
	        
	        return new int[]{-1,-1};
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
