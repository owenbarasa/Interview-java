/**
 * 
 */
package Array;
import java.util.*;

/**
 * Created by Wenqi Zhu
 * 11:11:27 PM Jul 4, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 
 * Find the first non-repeated character in a string.
 */
public class FirstNonRepeated {
	public static Character firstNonRepeated(String str){
		Hashtable<Character,Object> charHash = new Hashtable<Character,Object>();
		int i, length;
		Character c;
		Object seenOnce = new Object();
		Object seenTwice = new Object();
		length = str.length();
		
		for(i=0;i<length;i++){
			c = new Character(str.charAt(i));
			Object o = charHash.get(c);
			if(o == null){
				charHash.put(c, seenOnce);
			}else if(o==seenOnce){
				charHash.put(c, seenTwice);
			}
		}
		
		for(i=0;i<length;i++){
			c = new Character(str.charAt(i));
			if(charHash.get(c) == seenOnce){
				return c;
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		String str = new String("aabbccdde");
		Character c =firstNonRepeated(str);
		System.out.print(c);
	}
}
