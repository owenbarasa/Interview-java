/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 8:54:03 PM Sep 3, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String result = "";
        if(s.length()==1) return s;
        
        for(int i = 0; i < s.length()-1; i++){
        	String s1 = expandAroundCenter(s,i,i);
        	String s2 = expandAroundCenter(s,i,i+1);
        	
        	if(s1.length()>result.length()){
				result = s1;
			}
			if(s2.length()>result.length()){
				result = s2;
			}
			
        }
        
        return result;
    }
	
	public static String expandAroundCenter(String str,int left,int right){
		while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
			left--;
			right++;
		}
		return str.substring(left+1,right);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
