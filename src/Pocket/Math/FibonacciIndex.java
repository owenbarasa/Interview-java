/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 8:58:31 PM Aug 13, 2012
 * @SanFrancisco
 * Pocket questions
 * Given a Fibonacci number, tell us which index it occurs at. 
 */
public class FibonacciIndex {

	public static int fibonacciIndex(int num){
		if(num == 0) return 0;
		if(num == 1) return 2;// or 1: index1 and index2 are both 1;
		
		int index = 3;
		
		int fib1 = 1, fib2 = 2;
		int tmp;
		while(num!=fib2){
			tmp = fib1+fib2;
			fib1 = fib2;
			fib2 = tmp;
			index++;
		}
		return index;
		
	}
	
	public static int fibonacci(int index){
		int[] fib = new int[index+1];
		fib[0] =0 ;
		fib[1] =1 ;
		
		for(int i = 2;i<fib.length;i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		return fib[index];
	}
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib = fibonacci(4);
		System.out.println(fib);
		
		System.out.print(fibonacciIndex(fib));
	}

}
