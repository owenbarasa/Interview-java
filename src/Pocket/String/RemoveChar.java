/**
 * 
 */
package Pocket.String;

/**
 * Created by Wenqi Zhu
 * 12:52:13 AM Aug 9, 2012
 * @SanFrancisco
 * Pocket questions
 * Remove any given character from a string.
 */
public class RemoveChar {

	public String removeChar(String str,char remove){
		if(str == null)
			return "";
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<str.length();i++){
			char c = str.charAt(i);
			if(c==remove) continue;
			
			result.append(c);
		}
		return result.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveChar result = new RemoveChar();
		System.out.print(result.removeChar("RemoveC", 'C'));
	}

}
