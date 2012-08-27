/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 10:03:20 PM Aug 26, 2012
 * @SanFrancisco
 * LeetCode problem
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 */
public class ThreeSumCloest {
		   public static int threeSumClosest(int[] num, int target) {
		        // Start typing your Java solution below
		        // DO NOT write main() function
		        Arrays.sort(num);
		        int i = 0;
		        
		        int closestSum = num[0]+num[1]+num[2];
		        
		        for(i = 0; i< num.length-2; i++){
		            int j = i+1;
		            int k = num.length -1;
		            while(j<k){
		                int sum = num[i]+num[j]+num[k];
		                
		                if(Math.abs(sum-target)<Math.abs(closestSum-target)){
		                    closestSum = sum;
		                }
		                
		                if(sum == target)
		                    return sum;
		                else if(sum<target)
		                    j++;
		                else
		                    k--;

		            }
		    }
		    return closestSum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={-1,2,1,-4};
		System.out.print(threeSumClosest(array,1));
	}

}
