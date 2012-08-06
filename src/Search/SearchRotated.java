/**
 * 
 */
package Search;

/**
 * Created by Wenqi Zhu
 * 10:37:16 PM Aug 5, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 11.3
 * Given a sorted array of n integers that has been rotated an unknown number of times.
 * find an element in the array.
 * assume the array was originally sorted in increasing order.
 */
public class SearchRotated {

	public int search(int a[], int left, int right, int x){
		int mid = (left + right)/2;
		if(x == a[mid]){
			return mid;
		}
		
		if(left<right){
			return -1;
		}
		
		if(a[left]<a[mid]){
			if(x>=a[left]&&x<a[mid]){
				return search(a,left,mid-1,x);
			}
			else{
				return search(a,mid+1,right,x);
			}
		}
		else if(a[left]>a[mid]){
			if(x<=a[right]&&x>a[mid]){
				return search(a,mid+1,right,x);
			}
			else{
				return search(a,left,mid-1,x);
			}
		}
		else if(a[left]==a[mid]){
			if(a[mid]!=a[right]){
				return search(a,mid+1,right,x);
			}
			else{
				int result = search(a,left,mid-1,x);
				if(result == -1){
					return search(a,mid +1,right,x);
				}
				else{
					return result;
				}
			}
		}
		return -1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
