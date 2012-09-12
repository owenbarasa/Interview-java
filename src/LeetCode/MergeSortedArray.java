/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 4:55:33 PM Sep 11, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.

	Note:
	You may assume that A has enough space to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
 */
public class MergeSortedArray {

	public static void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		//if(m<=0 || n<=0 || m>A.length || n>B.length || m+n>A.length)
        //   return;
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
        	if(A[i]>B[j]){
        		A[k] = A[i];
        		i--;
        	}
        	else{
        		A[k] = B[j];
        		j--;
        	}
        	k--;
        }
        while(i>=0){
        	A[k] = A[i];
        	i--;
        	k--;
        }
        while(j>=0){
        	A[k] = B[j];
        	j--;
        	k--;
        }
    }
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[14];
		A[0]=1;
		A[1]=2;
		A[2]=3;
		A[3]=4;
		A[4]=5;
		A[5]=6;
		A[6]=7;
		A[7]=8;
		A[8]=9;
		int[] B ={3,4,6,7,8};
		merge(A,9,B,5);
		for(int i=0;i<9+5;i++){
			System.out.print(A[i]+" ");
		}
	}

}
