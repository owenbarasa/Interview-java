/**
 * 
 */
package Pocket.Array;



/**
 * Created by Wenqi Zhu
 * 4:29:09 PM Aug 12, 2012
 * @SanFrancisco
 * Pocket questions
 * Given an N*N matrix,where each pixel in the image is 4 bytes.
 * write a method to rotate the image by 90 degrees.
 */
public class RotateMatrix {

	public void rotate(int[][] matrix, int n){
		for(int layer = 0; layer < n/2; ++layer){
			int first = layer;
			int last = n - layer -1;
			for(int i = first; i<last ; ++i){
				int offset = i -first;
				
				//save top
				int top = matrix[first][i];
				
				//left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				//bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset];
				
				//right -> bottom
				matrix[last][last-offset] = matrix[i][last];
				
				//top -> right
				matrix[i][last] = top;
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		RotateMatrix result = new RotateMatrix();
		
		result.rotate(matrix, 4);
		//result.rotate(matrix, 4);
		for(int i = 0;i<4;i++){
			for(int j = 0;j<4;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
