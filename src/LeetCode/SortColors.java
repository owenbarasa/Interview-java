/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 11:28:18 PM Sep 17, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

	Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

	Note:
	You are not suppose to use the library's sort function for this problem.
 */
public class SortColors {
	public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start = 0;
        int end = A.length -1;
		for(int i = 0;i<=end;){
        	if(A[i]==0){
        		swap(A,i,start);
        		i++;
        		start++;
        	}
        	else if(A[i]==2){
        		swap(A,i,end);
        		end--;
        	}
        	else{
        		i++;
        	}
        }
    }
	
	public void swap(int[] A, int a, int b){
		int tmp = A[a];
		A[a] = A[b];
		A[b] = tmp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
