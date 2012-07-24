/**
 * 
 */
package Array;

/**
 * Created by Wenqi Zhu
 * 2:01:10 PM Jul 22, 2012
 * @SanFrancisco
 * PIE ReverseWords
 * ex. hello world---->world hello
 */
public class ReverseWords {
	public void reverseWords(char[] str){
		
	int start = 0;
	int end = 0;
	int len = str.length;
	
	reverse(str,start,len-1);
	
	while(end<len){
		if(str[end]!=' '){
			start = end;
			while(end<len && str[end]!=' '){
				end++;
			}
			end--;
			reverse(str,start,end);
		}
		end++;
	}
			
			
	}
	
	public void reverse(char[] str,int start,int end){
		char temp;
		while(start<end){
			temp = str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
		
	}
	public static void main(String[] args) {
		String s = "Hello World";
		char[] str = s.toCharArray();
		ReverseWords result = new ReverseWords();
		result.reverseWords(str);
		System.out.print(str);
	}

}
