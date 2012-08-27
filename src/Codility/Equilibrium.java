/**
 * 
 */
package Codility;

/**
 * Created by Wenqi Zhu
 * 9:38:11 PM Aug 26, 2012
 * @SanFrancisco
 * Codility questions
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * Given an N length array,find the P which makes a[0]+a[1]+....+a[P-1] = a[P+1]+a[P+2]+...+a[N-1]
 */
public class Equilibrium {
	
	public static int equilibrium(int[] array){
		int sum = 0;
		int leftsum = 0;
		int i;
		
		for(i = 0;i<array.length;i++){
			sum += array[i];
		}
		
		for(i = 0; i<array.length;i++){
			sum -= array[i];
			if(leftsum == sum){
				return i;
			}
			leftsum += array[i];
		}
		return -1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-7,1,5,2,-4,3,0};
		System.out.print(equilibrium(array));
	}

}
