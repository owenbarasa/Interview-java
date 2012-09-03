/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 10:50:01 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

	If the last word does not exist, return 0.

	Note: A word is defined as a character sequence consists of non-space characters only.
 */
public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int count = 0;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i) == ' '){
        	i--;
        }
        
        while(i>=0 && s.charAt(i) != ' '){
        	count++;
        	i--;
        }
        return count;

    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World     ";
		System.out.print(lengthOfLastWord(s));
	}

}
