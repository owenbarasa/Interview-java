/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 1:56:55 PM Aug 27, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Combination Sum
Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3]   
 */
public class CombinationSum {

	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
		Arrays.sort(candidates);
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> index = new ArrayList<Integer>();
        index.add(0);
        solve(candidates,target,index,0,0,results);
        return results;
        
    }
	
	public static void solve(int[] candidates, int target, ArrayList<Integer> indices, int pos, int sum, ArrayList<ArrayList<Integer>> results){
		if(sum == target){//add every candidate which index is in indices to result.
			ArrayList<Integer> result = new ArrayList<Integer>();
			for(int i =1 ; i<indices.size(); i++){
			result.add(candidates[indices.get(i)]);
		}
			results.add(result);
		}
		else if(sum>target)
			return;
		else{
			for(int i = indices.get(pos);i<candidates.length;i++){
					indices.add(i);			
				solve(candidates,target,indices,pos+1,sum+candidates[i],results);
				indices.remove(indices.size()-1);
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={2,3,6,7};
		
		System.out.print(combinationSum(array,7));
	}

}
