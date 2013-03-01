package LeetCode2;

import java.util.Arrays;

/**
 * Created by Wenqi Zhu
 * 9:56:18 PM Feb 28, 2013
 * @Buffalo
 * LeetCode Problems
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {
	public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        int tmp = num[0] + num[1] +num[2];
        int i;
        
        for(i = 0; i<num.length-2; i++){
        	int j = i+1;
        	int k = num.length-1;
        	while(j<k){
        		int sum = num[i]+num[j]+num[k];
        		if(Math.abs(sum-target) < Math.abs(tmp-target)){
        			tmp = sum;
        		}
        		
        		if(sum == target){
        			return sum;
        		}
        		else if(sum<target){
        			j++;
        		}
        		else{
        			k--;
        		}
        			
        	}
        }
        return tmp;
    }
}
