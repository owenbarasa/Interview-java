/**
 * 
 */
package Pocket.String;

/**
 * Created by Wenqi Zhu
 * 9:59:25 PM Aug 9, 2012
 * @SanFrancisco
 * Pocket questions
 * Write a function that compares two strings and returns a third string containing only the letters that appear in both.
 */
public class FindCommon {

	public static String returnCommon(String s1,String s2){

		boolean[] flag = new boolean['z' - 'A'];
		StringBuilder result = new StringBuilder();
		for(int i = 0; i< s1.length();i++){
			flag[s1.charAt(i) - 'A'] = true;
		}
		
		for(int i = 0; i<s2.length();i++){
			if(flag[s2.charAt(i)-'A']){
				result.append(s2.charAt(i));
				flag[s2.charAt(i)-'A'] = false;
			}
			
		}
		return result.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(returnCommon("aaCCee","aabbCCff"));
	}

}
