/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 2:45:20 PM Aug 14, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class IsPalindrome {

	/**
	 * @param args
	 */
	public static boolean isPalindrome(int n) {
		int high = 1;
		while(n/high > 10) {
			high *= 10;
		}

		while(n != 0) {
			int l = n/high;
			int r = n%10;
			if(l != r) return false;
			n = (n%high)/10;
			high /= 100;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isPalindrome(90109));
	}

}
