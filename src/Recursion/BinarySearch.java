/**
 * 
 */
package Recursion;

/**
 * Created by Wenqi Zhu
 * 4:13:25 PM Jul 29, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 
 */
public class BinarySearch {
	final int NOT_IN_ARRAY = -1;
	final int ARRAY_UNSORTED = -2;
	final int LIMITS_REVERSED = -3;
	
	public int binarySearch(int[] array, int lower, int upper, int target){
		int center,range;
		range = upper - lower;
		if(range<0){
			return LIMITS_REVERSED;
		}else if (range == 0 && array[lower]!=target){
			return NOT_IN_ARRAY;
		}
		
		if(array[lower]>array[upper]){
			return ARRAY_UNSORTED;
		}
		
		center = (range/2) +lower;
		if(target == array[center]){
			return center;
		}else if(target<array[center]){
			upper = center-1;
			return binarySearch(array,lower,upper,target);
		}else{
			lower = center+1;
			return binarySearch(array,lower,upper,target);
		}
		
		
		
	}
	
	public int iterBinarySearch(int[] array,int lower,int upper,int target){
		int center,range;
		if(lower > upper){
			return LIMITS_REVERSED;
		}
		
		while(true){
			range = upper - lower;
			center = (range/2) + lower;
			
			if(range==0 && array[lower]!=target){
				return NOT_IN_ARRAY;
			}
			if(array[lower]>array[upper]){
				return ARRAY_UNSORTED;
			}
			
			if(array[center]==target){
				return center;
			}else if(target<array[center]){
				upper = center -1;
			}else{
				lower = center+1;
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={0,1,2,3,4,5,6,7,8,9,10};
		BinarySearch result = new BinarySearch();
		System.out.println(result.binarySearch(array, 3, 8, 5));
		System.out.println(result.iterBinarySearch(array, 3, 8, 5));
		
	}

}
