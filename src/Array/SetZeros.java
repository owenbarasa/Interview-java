/**
 * 
 */
package Array;

/**
 * Created by Wenqi Zhu
 * 9:47:25 PM Jul 24, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 1.7
 * Write an algorithm such that if an element in an M*N matrix is 0, its entire row and column are set to 0.
 */
public class SetZeros {

	public void setZeros(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for(int i = 0; i<matrix.length;i++){
			for(int j = 0; j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
			}
		}
		
		for(int i=0; i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i]||column[j]){
					matrix[i][j] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[][] matrix ={{1,2,3,0},{5,6,7,8},{9,0,11,12},{13,14,15,16}};
		SetZeros result = new SetZeros();
		result.setZeros(matrix);
		for(int i = 0;i<4;i++){
			for(int j = 0;j<4;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
