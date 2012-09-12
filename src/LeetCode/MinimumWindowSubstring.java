/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 6:17:13 PM Sep 11, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

	For example,
	S = "ADOBECODEBANC"
	T = "ABC"
	Minimum window is "BANC".

	Note:
	If there is no such window in S that covers all characters in T, return the empty string "".
	If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
 */
public class MinimumWindowSubstring {
	public String minWindow(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] needToFind = new int[256];
        for(int i= 0;i<T.length();i++){
        	needToFind[T.charAt(i)]++;
        }
        
        int[] hasFound = new int[256];
        int minWindow = Integer.MAX_VALUE;
        int minWindowBegin = 0, minWindowEnd = 0;
        int count = 0;
        for(int begin = 0, end = 0;end <S.length();end++){
        	if(needToFind[S.charAt(end)]==0) continue;// skip characters not in T
        	hasFound[S.charAt(end)]++;
        	if(hasFound[S.charAt(end)]<=needToFind[S.charAt(end)])
        		count++;
        	
        	if(count==T.length()){
        		while(needToFind[S.charAt(begin)]==0 || hasFound[S.charAt(begin)] > needToFind[S.charAt(begin)]){ // advance begin index as far right as possible
        			if(hasFound[S.charAt(begin)] > needToFind[S.charAt(begin)])
        			hasFound[S.charAt(begin)]--;	
        		begin++;
        		}
        	
        	int window = end - begin +1;
        	if(window < minWindow){// update minWindow
        		minWindowBegin = begin;
        		minWindowEnd = end;
        		minWindow = window;
        		}
        	}
       }
        return(count == T.length())? S.substring(minWindowBegin,minWindowEnd+1):"";
        
    }
}
