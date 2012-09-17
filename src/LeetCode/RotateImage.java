/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 5:26:23 PM Sep 16, 2012
 * @SanFrancisco
 * LeetCode Problems
 * You are given an n x n 2D matrix representing an image.

	Rotate the image by 90 degrees (clockwise).

	Follow up:
	Could you do this in-place?
 */
public class RotateImage {
	public void rotate(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = matrix.length-1;
        for(int i = 0;i<=len/2;i++){
        	for(int j = i;j<len-i;j++){
        		int tmp = matrix[i][j];
        		matrix[len-j][i]=matrix[len-i][len-j];
        		
        	}
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
