/**
 * 
 */
package Sort;

/**
 * Created by Wenqi Zhu
 * 11:51:43 PM Aug 4, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 11.1
 * Given two sorted arrays A and B, where A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order.
 */
public class MergeSorted {

	public static void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA -1;
		int indexB = lastB -1;
		int indexMerged = lastB + lastA -1;
		
		while(indexA>=0 && indexB>=0){
			if(a[indexA]>b[indexB]){//end of a is > end of b
				a[indexMerged] = a[indexA];
				indexA--;
				indexMerged--;
			}else{
				a[indexMerged] = b[indexB];
				indexB--;
				indexMerged--;
			}
		}
		
		while(indexB>=0){
			a[indexMerged]=b[indexB];
			indexB--;
			indexMerged--;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[20];
		a[0]=3;
		a[1]=4;
		a[2]=8;
		int[] b ={1,2,5,6,7,10};
		merge(a,b,3,6);
		for(int i = 0;i<9;i++){
		System.out.print(a[i]+ " ");
		}
	}
}

