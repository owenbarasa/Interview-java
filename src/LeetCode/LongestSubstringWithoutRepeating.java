/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 9:30:26 PM Sep 3, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeating {

	 public int lengthOfLongestSubstring(String s) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		 
		 
		 
		 	int i = 0, j = 0;
		 	int max = 0;
		 	boolean[] exist = new boolean[256];
		 	while(j<s.length()){
		 		if(exist[s.charAt(j)]){
		 			max = Math.max(max, j-i);
		 			while(s.charAt(i)!=s.charAt(j)){ //Since you know that all substrings that start before or at index i would be less than your current maximum, 
		 				                             //you can safely start to look for the next substring with head which starts exactly at index i+1.
		 				exist[s.charAt(i)] = false;
		 				i++;
		 			}
		 			i++;
		 			j++;
		 		}
		 		else{
		 			exist[s.charAt(j)] = true;
		 			j++;
		 		}
		 	}
		 	max = Math.max(max, s.length()-i); //don't forget updating the max after loop.
		 	return max;
		 	
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
