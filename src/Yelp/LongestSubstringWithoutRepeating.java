/**
 * 
 */
package Yelp;

/**
 * Created by Wenqi Zhu
 * 2:17:49 PM Sep 28, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeating {

	public int longestSubstring(String str){
		int i = 0, j =0;
		int max = 0;
		boolean[] exist = new boolean[256];
		
		while(j<str.length()){
			if(exist[str.charAt(j)]){
				max = Math.max(max, j - i);
					while(str.charAt(i)!=str.charAt(j)){
						exist[str.charAt(i)] = false;
						i++;
					}
				i++;
				j++;
			}
			else{
				exist[str.charAt(j)] = true;
				j++;
			}
		}
		max = Math.max(max, str.length()-i);
		return max;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
