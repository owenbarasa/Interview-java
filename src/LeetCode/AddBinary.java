/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 1:21:11 AM Aug 27, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given two binary strings, return their sum (also a binary string).
 */
public class AddBinary {

	/**
	 * @param args
	 */
	public static String addBinary(String a, String b) {
        // Start typing your Java solution below
        // DO NOT write main() function
		StringBuilder result = new StringBuilder();
		int va,vb;
		int carry = 0;
		for(int i = a.length()-1,j = b.length()-1;i>-1||j>-1; i--,j--){
			if(i<=-1){
				va = 0; //put 0s for addition
			}
			else{
				if(a.charAt(i)== '1')
					va = 1;
				else if(a.charAt(i)=='0')
					va = 0;
				else
					return "Invalid input.";
			}
			if(j<=-1){
				vb = 0; 
			}
			else{
				if(b.charAt(j)== '1')
					vb = 1;
				else if(b.charAt(j)=='0')
					vb = 0;
				else 
					return "Invalid input.";
			}
			
			carry = va + vb + carry;
			result.insert(0, carry%2);
			carry /= 2;
			
		}
		
		if(carry == 1)
			result.insert(0,'1');//the most significant bit.
		
		return result.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "111";
		String b = "10";
		System.out.print(addBinary(a,b));
	}

}
