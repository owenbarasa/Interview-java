/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 9:05:02 PM Aug 30, 2012
 * @SanFrancisco
 * LeetCode Problems
 * The count-and-say sequence is the sequence of integers beginning as follows:
	1, 11, 21, 1211, 111221, ...

	1 is read off as "one 1" or 11.
	11 is read off as "two 1s" or 21.
	21 is read off as "one 2, then one 1" or 1211.
	Given an integer n, generate the nth sequence.
 */
public class CountAndSay {

	public static String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String s = String.valueOf(1);
        for(int i = 0; i<n-1;i++){
        	s = recursive(s);
        }
        return s;
    }
	
	public static String recursive(String s){
		char[] c = s.toCharArray();
		StringBuilder result = new StringBuilder();
		for(int i= 0; i<c.length;i++){
			int count = 1;
			while(i+1<c.length&&c[i] == c[i+1]){
				i++;
				count++;
			}
			result.append(String.valueOf(count));
			result.append(String.valueOf(c[i]));
		}
		return result.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=9;i++){
			System.out.println(i+ " : " + countAndSay(i));
		}
		
	}

}
