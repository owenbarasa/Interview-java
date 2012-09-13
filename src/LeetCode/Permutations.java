/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 3:24:50 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a collection of numbers, return all possible permutations.
	
	For example,
	[1,2,3] have the following permutations:
	[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
public class Permutations {
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = num.length;
        boolean[] used = new boolean[len];
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> per = new ArrayList<Integer>();
        doPermute(num,result,used,0,len,per);
        return result;
    }


	public void doPermute(int[] num, ArrayList<ArrayList<Integer>> result,boolean[] used, int level,int len,ArrayList<Integer> per){
		if(level == len){
			ArrayList<Integer> permutation = new ArrayList<Integer>();
			for(int i = 0;i<per.size();i++){
				permutation.add(per.get(i));
			}
			result.add(permutation);
		}
		else{
		for(int i = 0; i<len; i++){
			if(!used[i]){
				per.add(num[i]);
				used[i]=true;
				doPermute(num,result,used,level+1,len,per);
				used[i]=false;
				per.remove(per.size()-1);

			}
		}
		}
	}
}