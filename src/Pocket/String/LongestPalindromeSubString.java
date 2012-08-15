/**
 * 
 */
package Pocket.String;

/**
 * Created by Wenqi Zhu
 * 10:44:39 PM Aug 14, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class LongestPalindromeSubString {

	public static String expandAroundCenter(String str,int left,int right){
		while(left>=0 && right <str.length() && str.charAt(left) == str.charAt(right)){
			left --;
			right++;
		}
		return str.substring(left+1,right); // substring: from start index to end index-1
	}
	
	public static String longestSubPalindrome(String str){
		String result = "";
		for(int i = 0; i<str.length()-1; i++){
			String s1 = expandAroundCenter(str,i,i);
			String s2 = expandAroundCenter(str,i,i+1);
			if(s1.length()>result.length()){
				result = s1;
			}
			if(s2.length()>result.length()){
				result = s2;
			}
			
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubPalindrome("qwertedcbabcda"));
		System.out.println(longestSubPalindrome("baaaaab"));
	}

}
