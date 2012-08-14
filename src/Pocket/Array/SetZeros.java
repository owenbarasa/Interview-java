/**
 * 
 */
package Pocket.Array;

/**
 * Created by Wenqi Zhu
 * 9:09:13 PM Aug 12, 2012
 * @SanFrancisco
 * Pocket questions
 * if a element in M*N matrix is 0, its entire row and and colomn are set to 0 
 */
public class SetZeros {

	/**
	 * @param args
	 */
	public void setZero(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] col = new boolean[matrix[0].length];
		
		for(int i = 0; i< matrix.length;i++){
			for(int j = 0 ; j< matrix[0].length;j++){
				if(matrix[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i = 0;i<matrix.length;i++){
			for(int j = 0; j<matrix[0].length;j++){
				if(row[i]||col[j]){
					matrix[i][j] = 0;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
