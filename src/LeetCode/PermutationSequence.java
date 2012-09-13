/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 3:00:53 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 * The set [1,2,3,…,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order,
We get the following sequence (ie, for n = 3):

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

Note: Given n will be between 1 and 9 inclusive.
 */
public class PermutationSequence {

	 public String getPermutation(int n, int k) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        int[] num = new int[n];
	        for(int i = 0; i<n;i++){
	        	num[i] = i+1;
	        }
	        
	        for(int t =0; t<k-1;t++){
	        	int i = num.length-2;
	        	while(i>=0 && num[i]>=num[i+1])
	        		i--;
	        	if(i==-1){
	        		reverse(num,0);
	        		continue;
	        	}
	        	int j = num.length-1;
	        	while(num[j] <= num[i])
	        		j--;
	        	swap(num,i,j);
	        	reverse(num,i+1);
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0;i<n;i++){
	        	sb.append(num[i]);
	        }
	        return sb.toString();
	 }
	 
	 
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
