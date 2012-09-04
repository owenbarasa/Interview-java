/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 4:51:08 PM Sep 3, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class LetterCombinationsPhoneNumber {

	public static String[] c = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public static ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<String> result = new ArrayList<String>();
		char[] str = new char[digits.length()];
		letterCombinations(digits,0,result,str);
		return result;
		
    }
	
	public static void letterCombinations(String digits,int current,ArrayList<String> result,char[] str){
		if(current == digits.length()){
			result.add(new String(str));
			return;
		}
		for(int i = 0; i<c[digits.charAt(current)-'0'].length();i++){
			str[current] = c[digits.charAt(current)-'0'].charAt(i);
			letterCombinations(digits,current+1,result,str);
		}
		
			
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "230";
		System.out.print(letterCombinations(s));
	}

}
