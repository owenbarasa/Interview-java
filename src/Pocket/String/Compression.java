/**
 * 
 */
package Pocket.String;

/**
 * Created by Wenqi Zhu
 * 12:12:51 AM Aug 10, 2012
 * @SanFrancisco
 * Pocket questions
 * aabcccc ===> 2a1b4c
 */
public class Compression {

	public int countCompression(String str){
		char last = str.charAt(0);
		int count = 1;
		int size = 0;
		for(int i = 1; i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}else{
				last = str.charAt(i);
				size += String.valueOf(count).length() + 1;
				count = 1;
			}
		}
		size += String.valueOf(count).length()+ 1;
		return size;
	}
	
	public String compressToStringBuffer(String str){
		if(str.length()<= countCompression(str)){
			return str;
		}
		
		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for(int i = 1; i<str.length();i++){
			if(str.charAt(i)==last){
				count++;
			}
			else{
				mystr.append(count);
				mystr.append(last);
				//mystr.append(count);
				
				last = str.charAt(i);
				count = 1;
			}
		}
		mystr.append(count);
		mystr.append(last);
		//mystr.append(count);
		return mystr.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("aabcccccaaa");
		Compression result = new Compression();
		String str1 = result.compressToStringBuffer(str);
		System.out.print(str1);
	}

}
