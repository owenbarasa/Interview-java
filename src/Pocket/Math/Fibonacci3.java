/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 8:25:09 PM Aug 13, 2012
 * @SanFrancisco
 * Pocket questions
 * Generate fibonacci sequence: each number is the sum of the THREE previous numbers
 */
public class Fibonacci3 {

	/**
	 * @param args
	 */
	public static int[] fibonacci3(int len){
		int[] fibonacci = new int[len];
		
		for(int i = 0; i< 3;i++){
			fibonacci[i] = 1;
		}
		if(fibonacci.length<=3){
			return fibonacci;
		}
		for(int i = 3;i<len;i++){
			fibonacci[i] = fibonacci[i-1]+ fibonacci[i-2] + fibonacci[i-3];
		}
		
		return fibonacci;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib = fibonacci3(10);
		for(int i=0;i<fib.length; i++){
			System.out.print(fib[i]+ " ");
		}
	}

}
