/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 5:34:36 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class InterleavingString {

	public static boolean isInterleave(String s1, String s2, String s3, int i ,int j) { //not accepted by large
        // Start typing your Java solution below
        // DO NOT write main() function
		
			if(i+j == s3.length()) return true;
			if(i<s1.length() && s1.charAt(i) == s3.charAt(i+j)) {
				if(isInterleave(s1, s2, s3, i+1, j)) return true;
			}
			if(j<s2.length() && s2.charAt(j) == s3.charAt(i+j)) {
				if(isInterleave(s1, s2, s3, i, j+1)) return true;
			}
			return false;
		}

		public static boolean isInterLeave(String s1, String s2, String s3) {
			if(s1 == null || s2 == null || s3 == null || s1.length()+s2.length() != s3.length()) 
				return false;
			return isInterleave(s1, s2, s3, 0, 0);
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
