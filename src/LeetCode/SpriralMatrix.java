/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 11:58:27 PM Sep 17, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

	For example,
	Given the following matrix:
	
	[
	 [ 1, 2, 3 ],
	 [ 4, 5, 6 ],
	 [ 7, 8, 9 ]
	]
	You should return [1,2,3,6,9,8,7,4,5].
 */
public class SpriralMatrix {
	public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(matrix.length==0){
			return result;
		}
        int a = 0, b =matrix.length-1;
        int c = 0, d =matrix[0].length-1;
        
        while(a<=b && c<=d){
        	for(int i = c;i<=d;i++){
        		result.add(matrix[a][i]);
        	}
        	a++;
        	if(a>b) break;
        	
        	for(int i = a; i<=b;i++){
        		result.add(matrix[i][d]);
        	}
        	d--;
        	if(d<c) break;
        	for(int i = d;i>=c;i--){
        		result.add(matrix[b][i]);
        	}
        	b--;
        	if(b<a) break;
        	for(int i = b;i>=a;i--){
        		result.add(matrix[i][c]);
        	}
        	c++;
        	if(c>d) break;
        }
        return result;
        
    }
}
