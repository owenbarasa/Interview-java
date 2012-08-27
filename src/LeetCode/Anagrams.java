/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 4:25:03 AM Aug 27, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given an array of strings, return all groups of strings that are anagrams.
	Note: All inputs will be in lower-case.
 */
public class Anagrams {

	/**
	 * @param args
	 */

	public static String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }   

    public static ArrayList<String> anagrams(String[] strs) {
        
        Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
        for (String s : strs) {
            String key = sortChars(s); 
            if (!hash.containsKey(key)) {
                hash.put(key, new LinkedList<String>());
            }   
            LinkedList<String> anagrams = hash.get(key);
            anagrams.add(s);        
        } 
        
        ArrayList<String> result = new ArrayList<String>();
        for (String key : hash.keySet()) {
            LinkedList<String> list = hash.get(key);
            if (list.size() > 1) {
                for (String s : list) {
                    result.add(s);
                }   
            }
        }   
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"care","haa","race","aha"};
		System.out.print(anagrams(array));
	}

}
