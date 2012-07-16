/**
 * 
 */
package Array;

/**
 * Created by Wenqi Zhu
 * 8:33:34 PM Jul 15, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 1.1
 */
public class IsUniqueChar {
	public boolean isUniqueChar2(String str){//assume that the char set is ASCII
		if(str.length()>256) return false;
		
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i);
			if(char_set[val]){
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	public boolean isUniqueChar(String str){//assume the string only uses the lower case letters a through z.
		if(str.length()>256) return false;
		
		int checker = 0;
		for (int i = 0; i< str.length(); i++){
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val))>0 ){
				return false;
			}
			checker |= (1<<val);
		}
		return true;
	}
	
	
}
