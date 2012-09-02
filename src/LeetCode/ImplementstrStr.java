/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 2:25:38 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Implement strStr().

	Returns a pointer to the first occurrence of needle in haystack, or null if needle is not part of haystack.


 */
public class ImplementstrStr {

	 public String strStr(String haystack, String needle) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        if(needle.length()==0){
	        	return haystack;
	        }
	        if(needle.length()>haystack.length()){
	        	return null;
	        }
	        
	        int i = 0,j = 0;
	        while(i<haystack.length() && j<needle.length()){
	        	if(haystack.charAt(i) == needle.charAt(j)){
	        		i++; j++;
	        		if(j == needle.length()){
	        			return haystack.substring(i-j);
	        		}
	        	}
	        	else{
	        		i = i-j+1;
	        		j = 0;
	        	}
	        }
	        return null;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
