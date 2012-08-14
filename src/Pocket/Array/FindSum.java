/**
 * 
 */
package Pocket.Array;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 11:57:48 PM Aug 6, 2012
 * @SanFrancisco
 * Pocket questions / Leetcode
 * Given a number, find two/three/four numbers from an array so that the sum is equal to that number.
 */
public class FindSum {
 
	public int[] twoSum(int[] numbers,int target){
		int result[] = new int[2];
		for(int i = 0; i<numbers.length;i++){
			int tmp = target - numbers[i];
			for(int j = i+1; j<numbers.length;j++){
				if(tmp == numbers[j]){
					result[0]=i;
					result[1]=j;
				}
			}
		}
		return result;
	}
	
	public ArrayList<ArrayList<Integer>> twoSumS(int[] numbers,int target){
		Arrays.sort(numbers);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i<numbers.length-1;i++){
			for(int j= i+1; j<numbers.length;j++){
				if(numbers[i]+numbers[j] == target){
					ArrayList<Integer> pair = new ArrayList<Integer>();
					pair.add(numbers[i]);
					pair.add(numbers[j]);
					result.add(pair);
				}
			}
		}
		return result;
		
	}
	public ArrayList<ArrayList<Integer>> twoSumH(int[] numbers, int target){ // duplicates??
		Hashtable<Integer,Integer> hash = new Hashtable<Integer,Integer>();
		for(int i = 0;i<numbers.length;i++){
			hash.put(target-numbers[i], numbers[i]);
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<numbers.length;i++){
			if(hash.containsKey(numbers[i])){
			    ArrayList<Integer> pair = new ArrayList<Integer>();
			    pair.add(numbers[i]);
			    pair.add(hash.get(numbers[i]));
			    result.add(pair);
			}
		}
		return result;
	}
	
	public ArrayList<ArrayList<Integer>> threeSum(int[] num,int target){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		
		for(int i = 0; i< num.length-2;i++){
			int j = i+1;
			int k = num.length-1;
			while(j<k){
				if(num[i]+num[j]+num[k]==target){
					ArrayList<Integer> triplets = new ArrayList<Integer>();
					triplets.add(num[i]);
					triplets.add(num[j]);
					triplets.add(num[k]);
					result.add(triplets);
					while(j<num.length-1 && num[j]== triplets.get(1))
						j++;
					while(k>1 && num[k] == triplets.get(2))
						k--;
				}
				else if(num[i]+num[j]+num[k]<target){
					j++;
				}
				else{
					k--;
				}
			}
			
			while(i<num.length-2 && num[i]==num[i+1])
				i++;
			
		}
		
		return result;
	}
	
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		for(int i = 0; i< num.length-3;i++){
			for(int j=i+1;j<num.length-2;j++){
				int k = j+1;
				int l = num.length-1;
				while(k<l){
					if(num[i]+num[j]+num[k]+num[l]==target){
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(num[i]);
						list.add(num[j]);
						list.add(num[k]);
						list.add(num[l]);
						result.add(list);
						while(k<num.length-1 && num[k]== list.get(2))
							k++;
						while(l>2 && num[l] == list.get(3))
							l--;
					}
					else if(num[i]+num[j]+num[k]+num[l]<target)
						k++;
					else l--;
				}
				while(j<num.length-2 && num[j]==num[j+1])
					j++;
			}
			while(i<num.length-3 && num[i]==num[i+1])
				i++;
		}
		
		return result;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindSum result = new FindSum();
		int[] num ={-1,1,1,2,3,3,4,5,5};
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		//list = result.threeSum(num, 7);
		//System.out.print(list);
		
		//list = result.fourSum(num, 9);
		//System.out.print(list);
		list = result.twoSumS(num, 7);
		System.out.print(list);
	}

}

