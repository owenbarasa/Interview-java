/**
 * 
 */
package Pocket.String;
//import java.util.*;

/**
 * Created by Wenqi Zhu
 * 10:59:30 PM Aug 12, 2012
 * @SanFrancisco
 * Pocket questions
 * Reverse a string
 */
public class Reverse {
	public String reverse(String str){
		char[] array = str.toCharArray();
		
		int start = 0;
		int end = array.length-1;
		char tmp;
		while(start<end){
			tmp = array[start];
			array[start] = array[end];
			array[end] = tmp;
			
			start++;
			end--;
		}
		
		return String.valueOf(array);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcde";
		Reverse result = new Reverse();
		System.out.print(result.reverse(str));
	}

}
