/**
 * 
 */
package LeetCode2;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by Wenqi Zhu
 * 10:10:32 PM Nov 17, 2012
 * @Buffalo
 * LeetCode Problems
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

	Note:
	Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
	The solution set must not contain duplicate triplets.
    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
 */
public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] num){
		Arrays.sort(num);
		ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
		int i;
		
		for(i=0;i<num.length-2;i++){
			int j = i + 1;
			int k = num.length-1;
			while(j<k){
				if(num[i]+num[j]+num[k]==0){
					ArrayList<Integer> triplet = new ArrayList<Integer>();
					triplet.add(num[i]);
					triplet.add(num[j]);
					triplet.add(num[k]);
					triplets.add(triplet);
					
					while(j<num.length-1 && num[j]==triplet.get(1))//skip the current j first,then skip the duplicate j.
						j++;
					
					while(k>1 && num[k]==triplet.get(2))
						k--;
				}
				else if(num[i]+num[j]+num[k]<0){
					j++;
				}
				else{
					k--;
				}
			}
			while(i<num.length-2 && num[i]==num[i+1]){
				i++;
			}
		}
		return triplets;
		
	}
}
