/**
 * 
 */
package LeetCode;
import java.util.*;


/**
 * Created by Wenqi Zhu
 * 2:00:57 AM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
public class GenerateParentheses {

	/**
	 * @param args
	 */
	public static ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> result = new ArrayList<String>();
        char[] str = new char[n*2];
        generateParentheses(result,n,n,str,0);
        return result;
    }
	
	public static void generateParentheses(ArrayList<String> result, int leftRem,int rightRem,char[] str, int count){
		if(leftRem<0 || rightRem<leftRem){
			return;
		}
		if(leftRem==0 && rightRem == 0){
			String s = String.valueOf(str);
			result.add(s);
		}
		else{
			if(leftRem>0){
				str[count] = '(';
				generateParentheses(result,leftRem-1,rightRem,str,count+1);
			}
			if(rightRem>0){
				str[count] = ')';
				generateParentheses(result,leftRem,rightRem-1,str,count+1);
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();
		result = generateParenthesis(3);
		System.out.print(result.toString());
	}

}
