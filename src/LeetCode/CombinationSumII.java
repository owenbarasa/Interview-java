/**
 * 
 */
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Wenqi Zhu 9:09:57 PM Aug 28, 2012
 * 
 * @SanFrancisco LeetCode Problems Given a collection of candidate numbers (C)
 *               and a target number (T), find all unique combinations in C
 *               where the candidate numbers sums to T. Each number in C may
 *               only be used once in the combination.
 */
public class CombinationSumII {

	public static ArrayList<ArrayList<Integer>> combinationSum2(
			int[] candidates, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Arrays.sort(candidates);
		ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> index = new ArrayList<Integer>();
		solve(candidates, target, index, 0, 0, results);
		return results;

	}

	public static void solve(int[] candidates, int target,ArrayList<Integer> indices, int pos, int sum,ArrayList<ArrayList<Integer>> results) {
		if (sum == target) {// add every candidate which index is in indices to
							// result.
			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int i = 0; i < indices.size(); i++) {
				result.add(candidates[indices.get(i)]);
			}
			//System.out.println(result);
			results.add(result);
			
		} else if (sum > target)
			return;
		else {
			for (int i = pos; i < candidates.length; i++) {
				indices.add(i);
				solve(candidates, target, indices, i + 1, sum + candidates[i], results);
				indices.remove(indices.size()-1);
				while(i+1<candidates.length && candidates[i+1] == candidates[i]){
					i++;
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10,1,2,7,6,1,5};

		System.out.print(combinationSum2(array, 8));
	}

}
