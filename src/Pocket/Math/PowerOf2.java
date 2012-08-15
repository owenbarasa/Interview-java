/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 12:11:23 AM Aug 15, 2012
 * @SanFrancisco
 * Pocket questions
 * is the power of 2?
 */
public class PowerOf2 {

	/**
	 * @param args
	 */
	public static boolean isPowerOf2(int num){
		return (num&(num-1)) == 0;
	}
}
