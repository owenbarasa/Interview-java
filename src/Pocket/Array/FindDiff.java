/**
 * 
 */
package Pocket.Array;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 4:37:01 PM Aug 13, 2012
 * @SanFrancisco
 * Pocket questions
 * Given two arrays of integers, find which number is present in the first array but
 * not present in the second.
 */
public class FindDiff {

	/**
	 * @param args
	 */
	public static int findDiff(int[] a1,int[]a2){
		int sum1 = 0;
		for(int i = 0;i<a1.length;i++){
			sum1 += a1[i];
		}
		int sum2 = 0;
		for(int i = 0;i<a2.length;i++){
			sum2 += a2[i];
		}
		
		int result = sum1 - sum2;
		return result;
		
	}
	
	public static int[] findDiffmore(int[] a1, int[]a2){
		Hashtable<Integer,Integer> hash = new Hashtable<Integer,Integer>();
		
		for(int i=0;i<a2.length;i++){
			hash.put(i, a2[i]);
		}
		
		
		
		int size = a1.length;
		for(int i = 0;i<a1.length;i++){
			if(hash.contains(a1[i])){
				size--;
			}
		}
		int[] result = new int[size];
		int j = 0;
		for(int i = 0;i<a1.length;i++){
			if(hash.contains(a1[i])){
				continue;
			}
			else{
				result[j] = a1[i];
				j++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {1,4,5,3,1,6,8,7,6};
		int[] array2 = new int[] {4,7,6,3};
		int[] array3 = new int[] {1,4,3,1,7,6,6,8};
		int result[] = findDiffmore(array1,array2);
		
		for(int i = 0;i<result.length;i++){
		System.out.print(result[i] + " ");
		}
		
		System.out.println();
		int result1 = findDiff(array1,array3);
		System.out.print(result1);
	}

}
