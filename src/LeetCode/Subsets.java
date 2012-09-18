/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 12:36:08 PM Sep 18, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a set of distinct integers, S, return all possible subsets.

	Note:
	Elements in a subset must be in non-descending order.
	The solution set must not contain duplicate subsets.
	For example,
	If S = [1,2,3], a solution is:
	
	[
	  [3],
	  [1],
	  [2],
	  [1,2,3],
	  [1,3],
	  [2,3],
	  [1,2],
	  []
	]
 */
public class Subsets {
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subset = new ArrayList<Integer>();
        result.add(new ArrayList<Integer>());
        int len = S.length;
        //boolean[] isExist = new boolean[10]; 
        Arrays.sort(S);
        getSubsets(result,subset,len,0,0,S);
        return result;
    }
    
	public void getSubsets(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> subset,int len,int level,int start,int[] S){
		for(int i = start;i<len;i++){
			
			subset.add(S[i]);
			//isExist[S[i]]= true;
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
