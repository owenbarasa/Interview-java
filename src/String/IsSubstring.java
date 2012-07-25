/**
 * 
 */
package String;

/**
 * Created by Wenqi Zhu
 * 11:27:08 PM Jul 24, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 
 * public String substring(int beginIndex)
   or
   public String substring(int beginIndex, int endIndex)
   beginIndex : the begin index, inclusive.
   endIndex : the end index, exclusive
 */
public class IsSubstring {
	public static boolean isSubstring(String s1,String s2){ // check if s2 is a substring of s1
		int len1 = s1.length();
		int len2 = s2.length();
		
		
		
		if(s2.isEmpty()){
			return true;
		}
		
		if(s1.isEmpty()){
			return s2.isEmpty();
		}
		
		if(len2 > len1){
			return false;
		}
		if(len1 == len2){
			return s1.equals(s2);
		}
		
		return isSubstring(s1.substring(1),s2) || isSubstring(s1.substring(0,len1-1),s2);
		
		
	}
	
	public static void main(String[] args){
		String s1 ="abcdef";
		String s2 ="abcde";
		System.out.println(s1.substring(0,5));
		//IsSubstring result = new IsSubstring();
		System.out.print(isSubstring(s1, s2));
		}
}
