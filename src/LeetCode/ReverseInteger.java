/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 9:19:21 PM Sep 15, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 */
public class ReverseInteger {

	 public static int reverse(int x) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		 int result = 0;
		 int unit = 0;
		 
		 boolean neg = false;
		 if(x<0){
			 neg = true;
			 x = -x;
		 }
		 
		 while(x>0){
			 unit = x%10;
			 x = x/10;
			 result = result*10 +unit;
		 }
		 
		 if(neg){
			 result = -result;
		 }
		 
		 return result;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
