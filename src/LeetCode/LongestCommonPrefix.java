/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 8:37:26 PM Sep 3, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String prefix = new String();
        if(strs.length>0)
        	prefix = strs[0];
        for(int i = 1;i<strs.length;i++){
        	String s = strs[i];
        	int j = 0;
        	for(;j<Math.min(s.length(), prefix.length());j++){
        		if(prefix.charAt(j)!=s.charAt(j))
        			break;
        	}
        	prefix = prefix.substring(0,j);
        }
        return prefix;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
