/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 9:44:50 PM Aug 30, 2012
 * @SanFrancisco
 * LeetCode Problems
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	Given an encoded message containing digits, determine the total number of ways to decode it.
 */
public class DecodeWays {

	public int numDecodings(String s) {    //small accepted
        // Start typing your Java solution below
        // DO NOT write main() function
        int ways = 0;
        if(s.length()!=0)
        	ways = recursive(s,ways);
        return ways;
    }
	
	public int recursive(String s,int ways){
		if(s.length()==0){
			ways++;
			return ways;
		}
		else{
			int code = s.charAt(0) - '0';
			if(code > 0 && code<=9){
				recursive(s.substring(1),ways);
			}
			
			if(s.length()>=2){
				int code1 = s.charAt(0) - '0';
				int code2 = s.charAt(1) - '0';
				if(code1 == 1 && code2 >=0 &&code2 <=9){
					ways = recursive(s.substring(2),ways);
				}
				else if(code1 ==2 && code2>=0 && code2<=6){
					ways = recursive(s.substring(2),ways);
				}
			}
		}
		return ways;
	}
	
	
	public int numDecodings2(String s){ // both accepted
		if(s.length()<=0) return 0;
		int last = 1; 
		int current = (s.charAt(0)>='1' && s.charAt(0)<='9')? 1:0; 
		for(int i = 1; i< s.length(); i++){
			int count = 0;
			if ((s.charAt(i-1) == '1' && s.charAt(i) >= '0' && s.charAt(i) <= '9')|| (s.charAt(i-1) == '2' && s.charAt(i) >= '0' && s.charAt(i)<= '6')){
				count += last; // if the digit at i-1 position is 1 or 2, and digit at i position is effective, adding all the number of ways before i-1 into count.
			}
			if(s.charAt(i)>='1' && s.charAt(i)<='9'){
				count += current; // if the digit at i position is effective, adding all the number of ways before i into count.
			}
			last = current;	// update record : total number of ways before adding i
			current = count; // update record : total number of ways after adding i
			
			// dp[i] = dp[i-1]+ dp[i-2]
		}
		return current;
	}
	
	
		public int numDecodingDP(String s) {// DP
			if(s == null || s.length() == 0) return 0;
			int len = s.length();
			int[] dp = new int[len+1];
			dp[len] = 1;
			for(int i = len-1; i >= 0; i--) {
				if(s.charAt(i) != '0') {
					dp[i] = dp[i+1];
					if(i < len-1 && Integer.parseInt(s.substring(i, i+2)) <= 26) {
						dp[i] += dp[i+2];
					}
				}
			}
			return dp[0];
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
