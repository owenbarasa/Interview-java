/**
 * 
 */
package Pocket.String;

/**
 * Created by Wenqi Zhu
 * 3:15:16 PM Aug 14, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class IsPalindrome {

	/**
	 * @param args
	 */
	public static boolean isPalindrome(String s){
		char[] str = s.toCharArray();
		int i = 0;
		int j = str.length-1;
		while(i<j){
			if(str[i]!=str[j]){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abba";
		System.out.print(isPalindrome(s));
	}

}
