/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 12:20:58 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x<0) return false;
        
		int high = 1;
        while(x/high >=10){
        	high *=10;
        }
        
        while(x!=0){
        	int l = x/high;
        	int r = x%10;
        	if(l!=r) return false;
        	x = (x%high)/10;
        	high /=100;
        }
        return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
