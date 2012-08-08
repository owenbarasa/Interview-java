/**
 * 
 */
package Pocket.Array;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 12:31:54 AM Aug 8, 2012
 * @SanFrancisco
 * Pocket questions
 * Print an 2D array in spiral order.
 */
public class PrintSpiral {

	public ArrayList<Integer> printSpiral(int[][] matrix){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int A = 0, B = matrix.length -1;
		int C = 0, D = matrix[0].length -1;
		
		while(A<=B && C<=D){
			for(int i = C; i<= D;i++){
				result.add(matrix[A][i]);
			}
			A++;
			if(A>B) break;
			for(int i = A;i<=B; i++){
				result.add(matrix[i][D]);
			}
			D--;
			if(D<C) break;
			for(int i = D;i>=C; i--){
				result.add(matrix[B][i]);
			}
			B--;
			if(B<A) break;
			for(int i = B;i>=A; i--){
				result.add(matrix[i][C]);
			}
			C++;
		}
		
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int matrix[][] = {{1},{2},{3},{4}};
		int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
	 	PrintSpiral result = new PrintSpiral();
	 	ArrayList<Integer> list  = result.printSpiral(matrix);
	 	for(Integer i : list) {
	 	   System.out.print(i + " ");
	 	 
 }
	}

}
