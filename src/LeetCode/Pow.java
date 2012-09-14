/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 6:11:38 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Implement pow(x, n).
 */
public class Pow {

	public static double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n<0){
        	x = 1/x;
        	n = -n;
        }
        
        double result = 1;
        while(n!=0){
        	if((n&1)!=0)
        		result *= x;
        	n >>=1;
        	x *=x;
        }
        return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(pow(3.0000,4));
	}

}
