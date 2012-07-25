/**
 * 
 */
package String;

/**
 * Created by Wenqi Zhu
 * 12:38:28 AM Jul 24, 2012
 * @SanFrancisco
 * PIE From String to Integer 
 */
public class StrToInt {
	public int strToInt(String str){
		int num = 0;
		int i = 0;
		int len = str.length();
		boolean isNeg = false;
	
		if(str.charAt(0)=='-'){
			isNeg = true;
			i = 1;
		}
		
		while(i<len){
			num *= 10;
			num += (str.charAt(i) - '0');
			i++;
		}
		
		if(isNeg){
			num = num*(-1);
		}
		return num;
	}
	
	
	public static void main(String[] args){
		StrToInt result = new StrToInt();
		String str ="-4910005";
		int num = result.strToInt(str);
		System.out.print(num);
		
	}

}
