/**
 * 
 */
package Array;

/**
 * Created by Wenqi Zhu
 * 9:39:21 PM Jul 19, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 
 */
public class Reverse {
	public void reverse(char[] array){
		int start = 0;
		int end = array.length -1;
		char tmp;
		while(start <= end){
			tmp = array[start];
			array[start++] = array[end];
			array[end--] = tmp;		

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse result = new Reverse();
		char[] array = new char[10];
		array[0]= 'H';
		array[1]= 'e';
		array[2]= 'l';
		array[3]= 'l';
		array[4]= 'o';
		result.reverse(array);
		System.out.print(array);
	}

}
