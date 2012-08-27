/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 12:54:18 AM Aug 27, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 */
public class FourSum {

	public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		for(int i = 0; i<num.length-3;i++){
			
			for(int j = i+1; j<num.length-2;j++){
				int m = j+1;
				int n = num.length-1;
				while(m<n){
					if(num[i]+num[j]+num[m]+num[n]==target){
						ArrayList<Integer> quadruplets = new ArrayList<Integer>();
						quadruplets.add(num[i]);
						quadruplets.add(num[j]);
						quadruplets.add(num[m]);
						quadruplets.add(num[n]);
						result.add(quadruplets);
						
						while(m<num.length-1 && num[m]==quadruplets.get(2))
							m++;
						while(n>2&& num[n]==quadruplets.get(3))
							n--;
					}
					else if(num[i]+num[j]+num[m]+num[n]<target){
						m++;
					}
					else
						n--;
				}
				while(j<num.length-2 && num[j]==num[j+1])
					j++;
		}
			while(i<num.length-3 && num[i]==num[i+1])
				i++;
		}
		return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={-3,-2,-1,0,0,1,2,3};
		System.out.print(fourSum(array,0));
		
	}

}
