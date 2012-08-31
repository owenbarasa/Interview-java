/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 8:09:02 PM Aug 30, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
 * Find two lines,which together with x-axis forms a container, such that the container contains the most water.
 */
public class ContainerWithMostWater {

	public static int maxAreaN2(int[] height) { //bad 
        // Start typing your Java solution below
        // DO NOT write main() function
        int area = 0;
        for(int i = 0;i<height.length; i++){
            for(int j= i+1;j<height.length;j++){
                if(j==i) continue;
        		if((j-i)* Math.min(height[i], height[j])>area){
        			area = (j-i)*Math.min(height[i],height[j]);
        		}
        	}
        }
        
        return area;
    }
	
	public static int maxArea(int[] height){

		int maxArea = 0;
		int start = 0;
		int end = height.length-1;
		while(start<end){
			int minHeight = height[start]<height[end]? height[start]:height[end];
			if(minHeight * (end - start)>maxArea){
				maxArea = minHeight * (end - start);
			}
			
			if(height[start]<=height[end]){
				while(height[start]<=minHeight && start<end)
					start++;
			}
			else{
				while(height[end]<=minHeight && start<end)
					end--;
			}
			
		}
		return maxArea;
		 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,9,1,2,1};
		System.out.print(maxArea(height));
	}

}
