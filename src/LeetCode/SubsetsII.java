/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Wenqi Zhu
 * 4:54:20 PM Sep 18, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a collection of integers that might contain duplicates, S, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If S = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */
public class SubsetsII {
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subset = new ArrayList<Integer>();
        result.add(new ArrayList<Integer>());
        int len = S.length;
        Arrays.sort(S);
        getSubsets(result,subset,len,0,0,S);
        return result;
    }
    
	public void getSubsets(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> subset,int len,int level,int start,int[] S){
		for(int i = start;i<len;i++){
			
			subset.add(S[i]);
			if(!result.contains(subset)){
			ArrayList<Integer> copy = new ArrayList<Integer>(subset);
			result.add(copy);
			}
			if(i<len-1){
				getSubsets(result,subset,len,level+1,i+1,S);
			}
                subset.remove(subset.size()-1);
			
			
		}
	}
}
