/**
 * 
 */
package Bit;

/**
 * Created by Wenqi Zhu
 * 10:09:54 PM Jul 26, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 5.5
 * Write a function to determine the number of bits required to convert integer A to integer B. 
 */
public class BitSwapRequired {

	
	public int bitSwapRequired1(int a, int b){
		int count = 0;
		for(int c = a^b; c!=0; c >>=1){
			count += c & 1;
		}
		return count;
	}
	
	public int bitSwapRequired(int a, int b){
		//we can continuously flip the least significant bit(最低有效位） and count how long it takes c to reach 0
		int count = 0;
		for(int c = a^b; c!= 0; c &= c-1){
			count++;
		}
		return count;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
