/**
 * 
 */
package Bit;

/**
 * Created by Wenqi Zhu
 * 11:23:50 PM Jul 25, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 5.2
 * Given a real number between 0 and 1(e.g. 0.72) that is passed in as a double
 * print the binary representation
 */
public class PrintDoubleBinary {

	
	
	public static String printDoubleBinary(double num){
		if(num>1 || num<0){
			return "ERROR";
		}
		
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		while(num>0){ //Setting a limit on length
			if(binary.length()>32){
				return "ERROR";
			}
			double r = num*2;
			if(r>=1){
				binary.append(1);
				num = r -1;
			}else{
				binary.append(0);
				num = r;
			}
		}
			return binary.toString();		
	}
	
	public static String printDoubleBinary2(double num){
		if(num>=1 || num<=0){
			return "ERROR";
		}
		
		StringBuilder binary = new StringBuilder();
		double frac = 0.5;
		binary.append(".");
		while(num>0){
			if(binary.length()>32){
				return "Error";
			}
			if(num>=frac){
				binary.append(1);
				num = num - frac;
			}
			else{
				binary.append(0);
			}
			frac = frac/2;
		}
		return binary.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printDoubleBinary(0.625));
		System.out.println(printDoubleBinary(0.72));
		
	}

}
