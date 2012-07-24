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
	
	public void reverseWordsGeneral(char[] str){
		int tokenRead = str.length -1 ;
		int wordRead,wordEnd;
		int writePos = 0;
		
		char[] buffer = new char[str.length];
		
		while(tokenRead>=0){
			if(str[tokenRead]==' '){ //non-word characters
				buffer[writePos++] = str[tokenRead--];
			}
			else{ //word charactors
				wordEnd = tokenRead;
				while(tokenRead>=0 && str[tokenRead] !=' '){
					tokenRead--;
				}
				
				wordRead = tokenRead + 1;
				
				while(wordRead<=wordEnd){
					buffer[writePos++] = str[wordRead++];
				}
			}
		}
		System.arraycopy(buffer, 0, str, 0, str.length);
	}
	
	public static void main(String[] args) {
		String s = "Hello World";
		char[] str = s.toCharArray();
		ReverseWords result = new ReverseWords();
		result.reverseWordsGeneral(str);
		System.out.println(str);
		
		result.reverseWords(str);
		System.out.println(str);
		
	}

}
