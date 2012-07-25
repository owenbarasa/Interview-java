/**
 * 
 */
package String;

/**
 * Created by Wenqi Zhu
 * 4:46:58 PM Jul 24, 2012
 * @SanFrancisco
 * PIE  From Integer to String
 */
public class IntToStr {
	public static final int MAX_DIGITS = 10;
	public String intToStr(int num){
		int i = 0;
		boolean isNeg = false;
		char[] temp = new char[MAX_DIGITS+1];//buffer big enough for largest int and - sign.
		
		if(num<0){
			isNeg = true;
			num = num*-1;
		}
		
		do{
			temp[i++] = (char)((num%10)+ '0');
			num /= 10;
		}while(num!=0);
		
		StringBuffer buffer = new StringBuffer();
		if(isNeg){
			buffer.append('-');
		}
		
		while(i>0){
		buffer.append(temp[--i]);
		}
		
		return buffer.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntToStr result = new IntToStr();
		String str = result.intToStr(-4910005);
		System.out.print(str);
	}

}
