/**
 * 
 */
package String;

/**
 * Created by Wenqi Zhu
 * 11:24:00 PM Jul 24, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 1.8
 * Given a method isSubstring which checks if one word is a substring of another.Given two strings,s1,s2,write code to check
 * if s2 is a rotation of s1 using only one call to isSubstring.(e.g.,"waterbottle" is a rotation of "erbottlewat")
 */
public class IsRotation {

	//s2 will always be a substring of s1s1.
	//simply do isSubstring(s1s1,s2);
	public boolean isRotation(String s1,String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1==len2 && len1>0){
			String s1s1 = s1 + s1;
			
			return IsSubstring.isSubstring(s1s1,s2);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		IsRotation result = new IsRotation();
		System.out.print(result.isRotation(s1, s2));

	}

}
