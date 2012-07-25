/**
 * 
 */
package Array;

/**
 * Created by Wenqi Zhu
 * 8:30:45 PM Jul 24, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 1.6
 * Given an image represented by an N*N matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees.
 */
public class Rotate {
	public void rotate(int[][] matrix, int n){
		for(int layer =0 ; layer < n/2; ++layer){
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i<last; ++i){
				int offset = i - first;
				
				int top = matrix[first][i];  //save top
				matrix[first][i] = matrix[last-offset][first];  //left to top
				matrix[last-offset][first] = matrix[last][last-offset];  //bottom to left
				matrix[last][last-offset] = matrix[i][last];  //right to bottom
				matrix[i][last] = top;  //top to right
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Rotate result = new Rotate();
		
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
