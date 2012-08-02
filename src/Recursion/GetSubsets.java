/**
 * 
 */
package Recursion;
import java.util.*;

/**
 * Created by Wenqi Zhu
 * 12:36:26 AM Aug 1, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 9.4
 * Write a method to return all subsets of a set.
 * (Combination of string --> see another solution in the same package)
 */
public class GetSubsets {

	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set,int index){
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size()==index){
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
		}else{
			allsubsets = getSubsets(set,index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset: allsubsets){
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
		}
		return allsubsets;
	}
	
	ArrayList<ArrayList<Integer>> getSubset2(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
		int max = 1 << set.size();
		for(int k = 0;k<max;k++){
			ArrayList<Integer> subset = convertIntToSet(k,set);
			allsubsets.add(subset);
		}
		return allsubsets;
	}
	
	ArrayList<Integer> convertIntToSet(int x,ArrayList<Integer> set){
		ArrayList<Integer> subset = new ArrayList<Integer>();
		int index = 0;
		for(int k = x; k>0; k>>=1){
			if((k&1)==1){
				subset.add(set.get(index));
			}
			index++;
		}
		return subset;
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		GetSubsets result = new GetSubsets();
		ArrayList<ArrayList<Integer>> r = result.getSubset2(set);
		for(int i = 0;i<r.size();i++){
		System.out.print(r.get(i));
		}
		
		// TODO Auto-generated method stub
		

	}

}
