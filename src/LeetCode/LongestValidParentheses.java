/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 10:50:08 PM Sep 3, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

	For "(()", the longest valid parentheses substring is "()", which has length = 2.

	Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class LongestValidParentheses {

	public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int len = 0;
        int start = s.length();  // to maintain the earliest start position of a '(' which construct a valid parenthesis. 
        for(int i = 0; i<s.length();i++){
        	if(s.charAt(i)=='('){
        		stack.push(i);
        	}
        	else{
        		if(stack.isEmpty()){ //no '(' left, reset start
        			start = s.length();
        		}
        		else{
        			start = Math.min(stack.peek(),start);
        			stack.pop();
        			
        			if(stack.isEmpty()){
        				len = i - start +1;
        			}
        			else{
        				len = i - stack.peek();
        			}
        			max = Math.max(max, len);		
        		}
        		
        	}
        }
        return max;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
