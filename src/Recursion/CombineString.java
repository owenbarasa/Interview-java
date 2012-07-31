/**
 * 
 */
package Recursion;

/**
 * Created by Wenqi Zhu
 * 11:35:51 PM Jul 30, 2012
 * @SanFrancisco
 * PIE
 * Implement a function that prints all possible combinations of the characters in a string.
 */
public class CombineString {

	public void combine(String str){
		int length = str.length();
		char[] instr = str.toCharArray();
		StringBuilder outstr = new StringBuilder();
		doCombine(instr,outstr,length,0,0);
	}
	
	public void doCombine(char[] instr,StringBuilder outstr,int length,int level,int start){
		for(int i = start; i<length; i++){
			outstr.append(instr[i]);
			System.out.println(outstr);
			
			if(i<length-1){// if the current letter isn't the last in the input string
				doCombine(instr,outstr,length,level+1,i+1);
			}
			outstr.setLength(outstr.length()-1);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="wxy";
		CombineString result = new CombineString();
		result.combine(str);
		
	}

}
