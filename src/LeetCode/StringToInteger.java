/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 12:34:19 AM Sep 18, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 */
public class StringToInteger {
	 public static int atoi(String str) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	     if(str.length()==0) return 0;			
		
		 int i = 0;
		 boolean isNeg = false;
		 
		 while(i<str.length() && (str.charAt(i)<'0'||str.charAt(i)>'9')){
			 if(str.charAt(i)=='0' || str.charAt(i) == ' '){
				 i++;
			 }
			 else if(str.charAt(i)=='-' && i+1<str.length() && str.charAt(i+1)>='0'&&str.charAt(i+1)<='9'){
				 isNeg = true;
				 i++;
			 }else if(str.charAt(i)=='+' && i+1<str.length() && str.charAt(i+1)>='0'&&str.charAt(i+1)<='9'){
				 i++;
			 }else{
	    		 return 0;
			 }
		 }
		 
		 int begin = i;
		 while(i<str.length() && str.charAt(i)>='0'&&str.charAt(i)<='9'){
			 i++;
		 }
		 int end = i;
		 
		 String s = str.substring(begin, end);
		 
		 long num = 0;
		 int j = 0;
	     int len = s.length();
		 while(j<len){
	    	 num *=10;
			 num += (s.charAt(j) - '0');
			 j++;
		 }
	    //How to handle the overflow?
		 if(isNeg == false && num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
		 if(isNeg == true && (-1)*num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
		 
		 if(isNeg){
			 num = num*(-1);
		 }
		 return (int)num;
	 }
	public static void main(String[] args){
		String s = "abc";
		System.out.print(atoi(s));
	}
}
