/**
 * 
 */
package Pocket.Array;

/**
 * Created by Wenqi Zhu
 * 5:36:24 PM Aug 13, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class RemoveChars {

	/**
	 * @param args
	 */
	public static String removeChars(String str, String remove) {
		int[] flag = new int['z' - 'A'+1];
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < remove.length(); i++) {
			flag[remove.charAt(i) - 'A']++;
		}
		for(int i = 0; i < str.length(); i++) {
			if(flag[str.charAt(i) - 'A'] == 0) {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeChars("abcdefg", "abc"));
		System.out.println(removeChars("aaabz", "az"));
	}


}
