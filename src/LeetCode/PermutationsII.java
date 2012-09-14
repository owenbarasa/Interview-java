/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 5:04:04 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class PermutationsII {
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
	
	public boolean getNext(int[] array){
		for(int i = array.length-2; i>=0;i--){
			if(array[i]<array[i+1]){
				for(int j = array.length-1;j>i;j--){
					if(array[j] >array[i]){
						swap(array,i,j);
						reverse(array,i+1);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
	/**
	 * @param args
	 */
	
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) { // can solve Permutations.java, too
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> perm = new ArrayList<Integer>();
        for(int element: num) 
        	perm.add(element);
        
        results.add(perm);
        
        while(getNext(num)){
        	perm = new ArrayList<Integer>();
        	for(int element:num)
        		perm.add(element);
        	results.add(perm);
        }
        return results;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
