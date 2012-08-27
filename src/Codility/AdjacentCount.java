/**
 * 
 */
package Codility;

import java.util.Arrays;

/**
 * Created by Wenqi Zhu
 * 8:45:42 PM Aug 26, 2012
 * @SanFrancisco
 * Codility question
 * count the number of index pairs that have adjacent integer values.
 * {3,1,6,4,4} : (0,1),(0,3),(0,4),(2,3),(2,4),(3,4) = 6
 */
public class AdjacentCount {

	/**
	 * @param args
	 */
	public static int adjacent(int array[]){
		Arrays.sort(array);
		int count = 0;
		for(int i = 0; i<array.length-1;i++){
			int j = i+1;
			if(array[i]!=array[j]){
				while(j<array.length-1 && array[j+1] == array[j]){
					count++; j++;
				}
				count++;
			}
			else{
				while(j<array.length-1 && array[j] == array[i]){
					count++; j++;
				}
				count++;
				while(j<array.length-1 && array[j] == array[j+1]){
					count++; j++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,3,3,0,3,1};
		//int[] a2 = {1,3,3,0,3,5,11,7,5};
		//int[] a3 ={0,0,0,0,1,1};
		int[] a2 = {3,1,6,4,4};
		System.out.println(adjacent(array));
		System.out.println(adjacent(a2));
	}

}
