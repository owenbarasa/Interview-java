/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 4:51:20 PM Sep 12, 2012
 * @SanFrancisco
 * LeetCode Problems
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
	Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
	For example,
	There exist two distinct solutions to the 4-queens puzzle:

		[
		 [".Q..",  // Solution 1
		  "...Q",
		  "Q...",
		  "..Q."],
		
		 ["..Q.",  // Solution 2
		  "Q...",
		  "...Q",
		  ".Q.."]
		]
 */
public class NQueens {
	
	// Backtracking
	public static ArrayList<String[]> solveNQueens(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
		String[] str = printQ(n);
        ArrayList<String[]> result = new ArrayList<String[]>();
        int[] queens = new int[n]; // we set a queen in row i, column queens[i];  
        boolean[] colExist = new boolean[n];   // if column i has a queen.
        boolean[] a = new boolean[n*2-1]; // if the ith '/' oblique line has a queen.
        boolean[] b = new boolean[n*2-1]; // if the ith '\' oblique line has a queen.
        init(colExist,a,b,n);
		testing(0,n,result,colExist,a,b,queens,str);
		
		return result;
		
}
    
	
	public static void init(boolean[] colExist,boolean[] a,boolean[] b,int n){ //init the arrays
		for(int i = 0;i<n;i++){
			colExist[i] = false;
		}
		for(int i= 0;i<n*2-1;i++){
			a[i]=b[i]=false;
		}
	}
	
	public static void testing(int row,int n, ArrayList<String[]> result,boolean[] colExist,boolean[] a,boolean[] b,int[] queens, String[] str){
		for(int col = 0; col<n; col++){
			if(!(colExist[col] || a[row + col] || b[n -1 + col - row])){ //if position is available
				queens[row] = col; //set a queen in rowth row, colth column,
				colExist[col] = a[row + col] = b[n - 1 + col - row] = true;
				if(row == n-1){ //reach the end, print a solution
					String[] solution = new String[n];
					for(int i = 0; i<n;i++){
						solution[i] = str[queens[i]];
					}
					result.add(solution);
				}else{
					testing(row+1,n,result,colExist,a,b,queens,str);//continue set queen in row+1
				}
				
				colExist[col] = a[row + col] = b[n -1 + col - row] = false;//backtracking
			}
		}
	}
	
	public static String[] printQ(int n) { //format output string[] result :where 'Q' is in the position of i in result[i]; 
										// for example, n = 4, result = {"Q...",".Q..","..Q.","...Q"};
		String[] result = new String[n];
		for(int i = 0; i < n; i++) {
			String line = "";
			for(int j = 0; j < n; j++) {
				if(i==j) line = line + "Q";
				else line = line + ".";
			}
			result[i] = line;
		}
		return result;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String[]> result = new ArrayList<String[]>();
		result = solveNQueens(4);
		for(int i = 0; i<result.size();i++){
			System.out.println(Arrays.toString(result.get(i)));
		}
	}

}
