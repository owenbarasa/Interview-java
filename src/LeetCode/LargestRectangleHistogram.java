/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 10:22:03 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given n non-negative integers representing the histogram’s bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.

                6
            5  ___
           ___|   |
          |   |   |     3
    2     |   |   | 2  ___
   ___  1 |   |   |___|   |
  |   |___|   |   |   |   |
  |___|___|___|___|___|___|
	Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].

                6
            5  ___
           ___|___|
          | x | x |     3
    2     | x | x | 2  ___
   ___  1 | x | x |___|   |
  |   |___| x | x |   |   |
  |___|___|_x_|_x_|___|___|
	The largest rectangle is shown in the shaded area, which has area = 10 unit.

	For example,
	Given height = [2,1,5,6,2,3],
	return 10.

 */
public class LargestRectangleHistogram {

	public int largestRectangleArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
		
		//Pop the stack until we can maintain the non-decreasing order.Pushing the smaller element for m times, where m = number of poped elements +1.
		//Keep track of the maximum area that cause by those pop.
		
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		int i = 0;
		while(i < height.length){
			if(stack.isEmpty() || height[i] >= stack.peek()){
				stack.push(height[i]);
				i++;
			}
			
			else{
				int count = 0;
				while(!stack.isEmpty() && stack.peek() > height[i]){
					count++;
					int top = stack.pop();
					max = Math.max(max, top*count); // keep track of the maximum area
				}
				for(int j = 0;j<count+1;j++){ //push the smaller element count+1 times
					stack.push(height[i]);
				}
				i++;
			}
		}
		
		int count = 0;
		while(!stack.isEmpty()){
			count++;
			max = Math.max(max, stack.pop()*count); 
		}
		return max;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
