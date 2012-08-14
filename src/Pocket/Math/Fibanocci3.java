/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 8:25:09 PM Aug 13, 2012
 * @SanFrancisco
 * Pocket questions
 * Generi sequence: each number is the sum of the THREE previous numbers
 */
public class Fibanocci3 {

	/**
	 * @param args
	 */
	public static int[] fibanocchi3(int len){
		int[] fibanocchi = new int[len];
		
		for(int i = 0; i< 3;i++){
			fibanocchi[i] = 1;
		}
		if(fibanocchi.length<=3){
			return fibanocchi;
		}
		for(int i = 3;i<len;i++){
			fibanocchi[i] = fibanocchi[i-1]+ fibanocchi[i-2] + fibanocchi[i-3];
		}
		
		return fibanocchi;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib = fibanocchi3(10);
		for(int i=0;i<fib.length; i++){
			System.out.print(fib[i]+ " ");
		}
	}

}
