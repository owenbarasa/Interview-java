/**
 * 
 */
package Array;

/**
 * Created by Wenqi Zhu
 * 10:40:18 PM Jul 19, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 1.4
 * replace all space in a string with '%20'
 */
public class ReplaceSpace {
	
	public void replaceSpace(char[] str,int length){
		int spaceCount = 0;
		int newLength;
		int i = 0;
		for(i = 0; i < length; i++){
			if(str[i]==' '){
				spaceCount++;
			}
		}
		
		newLength = length + spaceCount*2;
		str[newLength] = '\0';
		for(i=length-1; i>=0; i--){
			if(str[i]==' '){
				str[newLength-1] = '0';
				str[newLength-2] = '2';
				str[newLength-3] = '%';
				newLength = newLength - 3;
			}
			else{
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = new char[100];
		String s = "I love you";
		char[] ss = s.toCharArray();
		for(int i = 0; i<ss.length;i++){
			str[i]=ss[i];
		}
		ReplaceSpace result = new ReplaceSpace();
		result.replaceSpace(str,10);
		System.out.print(str);
	}

}
