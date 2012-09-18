/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 10:57:52 PM Sep 17, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 */
public class SetMatrixZeroes {
	 public void setZeroes(int[][] matrix) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
		 boolean[] isRowZero = new boolean[matrix.length];
		 boolean[] isColZero = new boolean[matrix[0].length];
		 
		 for(int i = 0;i<matrix.length;i++){
			 for(int j = 0;j<matrix[0].length;j++){
				 if(matrix[i][j]==0){
					 isRowZero[i] = true;
					 isColZero[j] = true;
				 }
			 }
		 }
		 
		 for(int i= 0;i<matrix.length;i++){
			 for(int j= 0;j<matrix[0].length;j++){
				 if(isRowZero[i]==true || isColZero[j]==true){
					 matrix[i][j] = 0;
				 }
			 }
		 }
		 
	 }
}
