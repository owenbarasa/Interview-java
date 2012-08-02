/**
 * 
 */
package Recursion;

import java.util.ArrayList;

/**
 * Created by Wenqi Zhu
 * 8:38:49 PM Aug 1, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 9.6
 * Implement an algorithm to print all valid combination of n-pairs of parentheses.
 */
public class GenerateParentheses {
	public void addParen(ArrayList<String> list, int leftRem, int rightRem, char[]str,int count){
		if(leftRem<0 || rightRem<leftRem) return;
		if(leftRem==0 && rightRem==0){
			String s = String.copyValueOf(str);
			list.add(s);
		}
		else{
			if(leftRem>0){
				str[count]='(';
				addParen(list,leftRem-1,rightRem,str,count+1);
			}
			
			if(rightRem>0){
				str[count] =')';
				addParen(list,leftRem,rightRem-1,str,count+1);
			}
		}
	}
	public ArrayList<String> generateParens(int count){
		char[] str = new char[count*2];
		ArrayList<String> list = new ArrayList<String>();
		addParen(list,count,count,str,0);
		return list;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();
		GenerateParentheses r = new GenerateParentheses();
		result = r.generateParens(3);
		System.out.print(result.toString());
	}

}
