/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 2:25:32 PM Sep 18, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Implement int sqrt(int x).

Compute and return the square root of x.


 */
public class Sqrt {
	 public static int sqrt(int x) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        if(x < 0) return -1;
	        if(x == 0 || x==1) return x;
	        
	        long low = 1;
	        long high = x;
	        while(true) {
	            long mid = (low + high)/2;
	            if((x - mid*mid >=0) && (x - mid*mid < (mid+1)*(mid+1)-mid*mid)) {
	                return (int)mid;
	            }
	            else if(mid*mid < x) {
	                low = mid;
	            } else {
	                high = mid;
	            }
	        }
		}
}
