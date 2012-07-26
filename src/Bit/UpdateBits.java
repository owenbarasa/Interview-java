/**
 * 
 */
package Bit;

/**
 * Created by Wenqi Zhu
 * 6:16:17 PM Jul 25, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 5.1
 * Given two 32-bit numbers N and M, write a method to insert M into N such that
 * M starts at bit j and ends at bit i.
 * Input N = 10000000000 M=10011 i=2 j=6
 * Output N = 10001001100
 */
public class UpdateBits {

	public int updateBits(int n,int m,int i,int j){
		//Create a mask to clear bits i through j in n.
		
		int allOnes = ~0;
		
		//1s befor position j, then 0s. left = 1 1 1 1 1 1 1000 0000
		int left = allOnes<<(j+1);
		
		//1s after position i,  right = 0 0 0 0 0 0 0000 0011
		int right = ((1<<i) -1);
		
		//All 1s, except for 0s between i and j. mask = 1 1 1 1 1 1 1000 0011
		int mask = left | right;
		
		//Clear bits j through i then put m in there
		int n_cleared = n & mask;
		int m_shifted = m << i;
		
		int result = n_cleared | m_shifted;
		return result;
	}
	
	public static void printBinaryInt(String s,int i){
		System.out.println(s + ", int: " + i + ", binary:\n" + Integer.toBinaryString(i) );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1024; int m = 19;
		UpdateBits result = new UpdateBits();
		int r = result.updateBits(n, m, 2, 6);
		printBinaryInt("n",n);
		printBinaryInt("m",m);
		printBinaryInt("r",r);
		

	}

}
