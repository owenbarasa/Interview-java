/**
 * 
 */
package Array;


/**
 * Created by Wenqi Zhu
 * 11:19:29 PM Jul 19, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 
 * perform basic string compression using the counts of repeated characters. "aabcccccaaa"--"a2b1c5a3"
 */
public class Compress {
	public String compressToStringBuffer(String str){
		if(str.length() <= countCompression(str)){
			return str;
		}
		
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}
			else{
				mystr.append(last);
				mystr.append(count);
				last = str.charAt(i);
				count = 1;
			}
		}
		mystr.append(last);
		mystr.append(count);
		return mystr.toString();
	}
	
	public int countCompression(String str){
		char last = str.charAt(0);
		int count = 1;
		int size = 0;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
	
	public String compressToArray(String str){
		int size = countCompression(str);
		if(str.length() <= size){
			return str;
		}
		
		char[] array = new char[size];
		char last = str.charAt(0);
		int count = 1;
		int index = 0;
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				index = setChar(array,last,index,count);
				last = str.charAt(i);
			    count = 1;
			}
		}
		index = setChar(array,last,index,count);
		return String.valueOf(array);
		
	}
	
	public int setChar(char[] array, char c, int index,int count){
		array[index] = c;
		index++;
		char[] cnt = String.valueOf(count).toCharArray();
		for(char x : cnt){
			array[index] = x;
			index++;
		}
		return index;
	}
	public static void main(String args[]) {
		String str = new String("aaabcccccaaa");
		Compress result = new Compress();
		//String str1 = result.compressToStringBuffer(str);
		String str1 = result.compressToArray(str);
		System.out.print(str1);
	}
}
