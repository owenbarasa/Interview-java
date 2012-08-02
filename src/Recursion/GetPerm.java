/**
 * 
 */
package Recursion;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 6:25:30 PM Aug 1, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 9.5
 * Write a method to compute all permutations of a string
 * See PermuteString.java in the same package
 */
public class GetPerm {

	public static ArrayList<String> getPerms(String str){
		if(str==null){
			return null;
		}
		ArrayList<String> permutations = new ArrayList<String>();
		if(str.length()==0){
			permutations.add("");
			return permutations;
		}
		
		char first = str.charAt(0);
		String remainder = str.substring(1);
		ArrayList<String> words = getPerms(remainder);
		for(String word :words){
			for(int j = 0;j<word.length();j++){
				String s = insertCharAt(word,first,j);
				permutations.add(s);
			}
		}
		return permutations;
	}
	public static String insertCharAt(String word,char c,int i){
		String start = word.substring(0,i);
		String end = word.substring(i);
		return start+c+end;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
