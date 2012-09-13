/**
 * 
 */
package LeetCode;

import java.util.Arrays;

/**
 * Created by Wenqi Zhu
 * 2:12:46 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

	If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

	The replacement must be in-place, do not allocate extra memory.

	Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
	1,2,3 → 1,3,2
	3,2,1 → 1,2,3
	1,1,5 → 1,5,1
 */
public class NextPermutation {
	
	/****************
	The following algorithm generates the next permutation lexicographically after a given permutation. It changes the given permutation in-place.
	1.Find the highest index i such that s[i] < s[i+1]. If no such index exists, the permutation is the last permutation.
	2.Find the highest index j > i such that s[j] > s[i]. Such a j must exist, since i+1 is such an index.
	3.Swap s[i] with s[j].
	4.Reverse all the order of all of the elements after index i
	*****************/
	public static void swap(int[] array, int i, int j){
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		
	}
	
	public static void reverse(int[] array, int start){
		int n = array.length-1;
		int mid = (n - start)/2 + start;
		for(int i = start;i<=mid;i++){
			swap(array,i,n-i+start);
		}
	}
	public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int i = num.length-2;
        while(i>=0 && num[i]>=num[i+1])
        	i--;
        if(i == -1){ //it's the last permutation.
        	reverse(num,0);
        	return;
        }
        
        int j = num.length-1;
        while(num[j] <= num[i])
        	j--;
        swap(num,i,j);
        reverse(num,i+1);
    }
	 
	 public static void main(String[] args){
		 int[] array = {1,2,3,4,5};
		 reverse(array,0);
		 System.out.print(Arrays.toString(array));
	 }
}
