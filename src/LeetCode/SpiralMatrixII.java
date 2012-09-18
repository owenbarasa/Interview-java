/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 12:15:23 AM Sep 18, 2012
 * @SanFrancisco
 * LeetCode Problems
 * 	Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

	For example,
	Given n = 3,
	
	You should return the following matrix:
	[
	 [ 1, 2, 3 ],
	 [ 8, 9, 4 ],
	 [ 7, 6, 5 ]
	]
 */
public class SpiralMatrixII {
	public int[][] generateMatrix(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(n == 0) return new int[][]{};
        
        int[][] result = new int[n][n];
        int a = 0, b = n-1;
        int c = 0, d = n-1;
        
        int count =1;
        
        while(count<=n*n){
        	for(int i = c;i<=d;i++){
        		result[a][i] = count++;
        	}
        	a++;
        	if(a>b) break;
        	for(int i = a;i<=b;i++){
        		result[i][d] = count++;
        	}
        	d--;
        	if(d<c) break;
        	for(int i = d;i>=c;i--){
        		result[b][i] = count++;
        	}
        	b--;
        	if(b<a) break;
        	for(int i = b; i>=a; i--){
        		result[i][c] = count++;
        	}
        	c++;
        	if(c>d) break;	
        }
        return result;
    }
}
