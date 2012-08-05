/**
 * 
 */
package Sort;
import java.util.*;

/**
 * Created by Wenqi Zhu
 * 12:45:46 AM Aug 5, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 
 */
public class SortAnagrams {
	public void sort(String[] array){
		Hashtable<String,LinkedList<String>> hash = new Hashtable<String,LinkedList<String>>();
		for(String s : array){
			String key = sortChar(s);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hash.get(key);
			anagrams.push(s);
		}
		int index = 0;
		for(String key : hash.keySet()){
			LinkedList<String> list = hash.get(key);
			for(String t : list){
				array[index] = t;
				index++;
			}
		}
	}
	public String sortChar(String s){
		char[] c =s.toCharArray();
		Arrays.sort(c);
		return c.toString();
	}
	
	public static void main(String[] args){
		String[] array = {"race","hah","care","aha"};
		SortAnagrams result = new SortAnagrams();
		result.sort(array);
		for(int i = 0;i<array.length;i++){
		System.out.print(array[i]+ " ");
		}	
	}

}
