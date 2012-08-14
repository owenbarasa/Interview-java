/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 10:26:03 PM Aug 13, 2012
 * @SanFrancisco
 * Pocket questions
 * You are given an array with integers between 1 and n. One
   integer is in the array twice. How can you determine which one? Can you
   think of a way to do it using little extra memory.
 */
public class FindAppearTwice {

	public static int findAppearTwice(int[] input, int n){
		int result = input[0];
		for(int i=1; i<input.length;i++){
			result ^= input[i];
		}
		
		for(int i = 1; i<= n;i++){
			result ^= i;
		}
		
		return result;	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 10 };

		System.out.println(findAppearTwice(input, 10));
	}

}
