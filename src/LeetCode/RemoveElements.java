/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 3:37:43 PM Sep 15, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.


 */
public class RemoveElements {
	
	
	
	public int removeElement(int[] A, int elem){
		int i = 0;
		int j = A.length -1 ;
		while(i<=j){
			if(A[i] == elem){
				if(A[j] == elem){
					j--;
				}
				else{
					A[i] = A[j];
					i++;
					j--;
				}
			}
			else{
				i++;
			}
		}
		return i;
	}
	
	
	
	public static int removeElement2(int[] A, int elem) {  // First version
        // Start typing your Java solution below
        // DO NOT write main() function
		int i = 0;
		int end = A.length-1;
		
		int count = 0;
        while(i<=end){
        	if(A[i] == elem){
        		if(A[end] == elem){
        			end--;
        			count++;
        		}
        		else{
        		A[i] = A[end];
        		i++;
        		end--;
        		count++;
        		}
        	}
        	else{
        		i++;
        	}
        }
        return A.length -count;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,3};
		System.out.print(removeElement2(A,3));
	}

}
