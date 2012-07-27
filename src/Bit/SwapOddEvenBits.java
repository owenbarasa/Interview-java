/**
 * 
 */
package Bit;

/**
 * Created by Wenqi Zhu
 * 10:28:28 PM Jul 26, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 5.6
 * Write a program to swap odd and even bits in an integer with as few instructions as possible.
 */
public class SwapOddEvenBits {
	
	public int swapOddEvenBits(int x){
		//we can mask all odd bits with 10101010 in binary,then shift them right by 1 to put them in the even spots.
		//do an equivalent operation for even bits.
		//merge these to values.
		return((x&0xAAAAAAAA)>>1 | ((x&0x55555555)<<1));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
