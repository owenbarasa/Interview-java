/**
 * 
 */
package Pocket.String;

/**
 * Created by Wenqi Zhu
 * 11:23:26 PM Aug 12, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class ReverseSentence {

	public static void reverse(char[] str, int start,int end){
		while(start<end){
			char t = str[start];
			str[start] = str[end];
			str[end] = t;
			start++;
			end--;
		}
	}
	public static void reverseSentence(char[] str){
		
		reverse(str,0,str.length-1);
		int start = 0;
		int end = 0;
		while(end<str.length){
			if(str[end]!=' '){//skip the non-word characters
				start = end; //save start position
				while(end<str.length && str[end]!=' '){
				end++;
				}
			    end--;
			    reverse(str,start,end);
			}
			end++;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		char[] str = s.toCharArray();
		reverseSentence(str);
		
		System.out.print(str);
	}

}
