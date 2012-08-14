/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 10:46:10 PM Aug 13, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class FindPrimeNum {

	/**
	 * @param args
	 */
	public static void findPrimeNum(int n){
		for(int i = 2; i<=n;i++){
			if(isPrime(i)){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static boolean isPrime(int n){
		if(n ==0 || n ==1) return false;
		for(int i = 2;i<=(int)Math.sqrt(n);i++){
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static boolean isPrimeR(int n){ // recursive version
		return isPrimeR(n, n-1);
	}
	
	public static boolean isPrimeR(int n, int d){
		if(d==0 || d ==-1){
			return false; // 0 and 1 are not prime.
		}
		else if(d == 1)
			return true; // 2 is prime.
		else{
			if(n%d == 0)
				return false;
			else
				return isPrimeR(n,d-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPrimeNum(20);
		for(int i = 0;i<=20; i++){
			System.out.print( i + " " + isPrimeR(i)+ " ");
			System.out.println(i + " "+ isPrime(i)+ " ");
		}
	}

}
