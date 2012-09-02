/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 1:37:46 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * The gray code is a binary numeral system where two successive values differ in only one bit.

	Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. 
	A gray code sequence must begin with 0.

	For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

	00 - 0
	01 - 1
	11 - 3
	10 - 2
 */
public class GreyCode {

	 public ArrayList<Integer> grayCode(int n) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        int size = 1;
	        while(n>0){
	        	size *= 2;
	        	n--;
	        }
	        for(int i = 0; i<size;i++){
	        	result.add((i>>1)^i);
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
