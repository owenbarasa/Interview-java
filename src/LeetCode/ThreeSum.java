/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 4:53:45 PM Aug 26, 2012
 * @SanFrancisco
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 	Note:
	Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
	The solution set must not contain duplicate triplets.
 */
public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int i;
        for(i = 0; i< num.length-2;i++){
            int j = i+1;
            int k = num.length-1;
            while(j<k){
                if(num[i] + num[j] + num[k] == 0){
                    ArrayList<Integer> triplets = new ArrayList<Integer>();
                    triplets.add(num[i]);
                    triplets.add(num[j]);
                    triplets.add(num[k]);
                    result.add(triplets);
                    while(j<num.length-1 && num[j]==triplets.get(1))
                        j++;
                    while(k>1 && num[k] == triplets.get(2))
                        k--;
                }
                else if(num[i] + num[j] + num[k]<0)
                    j++;
                else
                    k--;               
            }
            while(i<num.length-2 && num[i] == num[i+1])
            i++;
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
