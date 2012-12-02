package LeetCode2;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 2:39:16 PM Dec 2, 2012
 * @Buffalo
 * LeetCode Problems
 * Given an array of strings, return all groups of strings that are anagrams.
 */
public class Anagrams {
	public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
		Hashtable<String,LinkedList<String>> hash = new Hashtable<String,LinkedList<String>>();
        for(int i = 0; i<strs.length;i++){
        	String key = sortChars(strs[i]);
        	if(!hash.containsKey(key)){
        		hash.put(key, new LinkedList<String>());
        	}
        	LinkedList<String> anagrams = hash.get(key);
        	anagrams.add(strs[i]);
        }
        
        ArrayList<String> result = new ArrayList<String>();
        for(String key: hash.keySet()){
        	LinkedList<String> list = hash.get(key);
        	if(list.size()>1){
        		for(String s:list){
        			result.add(s);
        		}
        	}
        }
        return result;
    }
	
	public static String sortChars(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
 	}
}
