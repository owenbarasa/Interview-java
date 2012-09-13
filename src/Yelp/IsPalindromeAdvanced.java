/**
 * 
 */
package Yelp;

/**
 * Created by Wenqi Zhu
 * 5:03:12 PM Sep 12, 2012
 * @SanFrancisco
 * Shared screen questions
 */
public class IsPalindromeAdvanced {
	 public boolean isPalindrome(String s){

	     if(s == null) return false;

	     String pattern = "[^a-zA-Z0-9]";

	     s = s.replaceAll(pattern, "").toLowerCase();

	     char[] str = s.toCharArray();

	     int i = 0;

	     int j = str.length -1;

	     while(i<j){

	         if(str[i]!=str[j]){

	             return false;

	             }

	          i++;

	          j--;  

	       }

	     return true;

	     }


}
