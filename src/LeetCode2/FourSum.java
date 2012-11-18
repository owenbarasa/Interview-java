package LeetCode2;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 10:57:52 PM Nov 17, 2012
 * @Buffalo
 * LeetCode Problems
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
The solution set must not contain duplicate quadruplets.
    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

    A solution set is:
    (-1,  0, 0, 1)
    (-2, -1, 1, 2)
    (-2,  0, 0, 2)
 */
public class FourSum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> quadruplets = new ArrayList<ArrayList<Integer>>();
        int i;
        for(i=0;i<num.length-3;i++){
        	int j = i+1;
        	for(;j<num.length-2;j++){
        		int m = j+1;
        		int n = num.length -1;
        		while(m<n){
        			if(num[i]+num[j]+num[m]+num[n]==target){
        				ArrayList<Integer> quadruplet = new ArrayList<Integer>();
        				quadruplet.add(num[i]);
        				quadruplet.add(num[j]);
        				quadruplet.add(num[m]);
        				quadruplet.add(num[n]);
        				quadruplets.add(quadruplet);
        				
        				while(m<num.length-1 && num[m] == quadruplet.get(2))
        					m++;
        				while(n>2 && num[n] == quadruplet.get(3))
        					n--;
        			}
        			else if (num[i]+num[j]+num[m]+num[n]<target){
        				m++;
        			}
        			else
        				n--;		
        		}
        		while(j<num.length-2 && num[j]==num[j+1])
        			j++;
        	}
        	while(i<num.length-3 && num[i] == num[i+1])
        		i++;
        }
        return quadruplets;
    }
}
