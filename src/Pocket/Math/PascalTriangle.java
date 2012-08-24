/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 1:13:02 AM Aug 24, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class PascalTriangle {
	public static final int ROW = 12;
    private static int max = 0;
	/**
	 * @param args
	 */
	public static int[][] printPascal(int n){
		int[][] triangle = new int[n][n];

		for(int i = 0;i<n;i++){
			triangle[i][0] = 1;
		}


		
		for(int i = 1; i<n;i++){
			for(int j = 1;j<n;j++){
				triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
			}
		}
		
		return triangle;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] triangle = printPascal(6);
//		for(int i = 0;i<6;i++){
//			for(int j=0;j<=i;j++){
//				System.out.print(triangle[i][j] + " ");
//			}
//			System.out.println();
//		}


	        int[][] pascal  = new int[ROW +1][];
	        pascal[1] = new int[1 + 2];
	        pascal[1][1] = 1;
	        for (int i = 2; i <= ROW; i++) {
	            pascal[i] = new int[i + 2];
	            for (int j = 1; j < pascal[i].length - 1; j++) {
	                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
	                String str = Integer.toString(pascal[i][j]);
	                int len = str.length();
	                if (len > max)
	                    max = len;
	            }
	        }

	        for (int i = 1; i <= ROW; i++) {                
	            for (int k = ROW; k > i; k--)
	                System.out.format("%-" + max + "s", " ");
	            for (int j = 1; j < pascal[i].length - 1; j++)                      
	                System.out.format("%-" + (max + max) + "s",  pascal[i][j]);
	            System.out.println();
	        }
	    }

		
	}


