/**
 * 
 */
package Recursion;

/**
 * Created by Wenqi Zhu
 * 5:46:46 PM Jul 31, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 9.1
 * A child is running up a staircase with n steps, and can hop either 1 step,2 steps, or 3 steps at a time.
 * Implement a method to count how many possible ways the child can run up the stairs.
 */
public class CountWay {

	
	public int countWays(int n){
	if(n<0){
		return 0;
	}
	else if(n==0){
		return 1;
	}
	else{
		return countWays(n-1)+countWays(n-2)+countWays(n-3);
	}	
	
    }
	
	public static int countWaysDP(int n,int[] map){
		if(n<0){
			return 0;
		}
		else if(n == 0){
			return 1;
		}
		else if(map[n]>-1){
			return map[n];
		}
		else{
			map[n]= countWaysDP(n-1,map)+countWaysDP(n-2,map)+countWaysDP(n-3,map);
			return map[n];
		}
	}
	
	public static void main(String[] arg0){
		//CountWay result = new CountWay();
		//System.out.print(result.countWays(3));
		int[] map = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		System.out.print(countWaysDP(6, map));
	}

}
