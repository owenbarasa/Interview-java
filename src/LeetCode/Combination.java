/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 2:02:36 AM Aug 29, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * For example,
	If n = 4 and k = 2, a solution is:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
*/

public class Combination {

	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int current = 0;
        compute(n,k,current,result,results,0);
        return results;
    }
	
	public static void compute(int n, int k, int current, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> results,int index){
		if(k<current){
			return;
		}
		
		if(k==current){
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0;i<k;i++){
				list.add(result.get(i));
			}
			results.add(list);
		}
		
		for(int i = index;i<n;i++){
			result.add(i+1);
			current++;
			compute(n,k,current,result,results,i+1);
			result.remove(result.size()-1);
			current--;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(combine(4,2));
	}

}
