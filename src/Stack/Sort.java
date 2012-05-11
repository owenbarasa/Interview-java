/**
 * 
 */
package Stack;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 6:24:52 PM May 10, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 * Sort a stack in ascending order
 */
public class Sort {
	public static Stack<Integer> sort(Stack<Integer> s1){
		Stack<Integer> s2 = new Stack<Integer>();
		while(!s1.isEmpty()){
			int temp = s1.pop();
			while(!s2.isEmpty() && s2.peek()>temp){
				s1.push(s2.pop());
			}
			s2.push(temp);
		}
		return s2;
	}
	public static void main(String[] args) {
       Stack<Integer> test = new Stack<Integer>();
       test.push(3);
       test.push(4);
       test.push(8);
       test.push(5);
       test.push(2);
       test.push(1);
       Stack<Integer> s = sort(test);
       System.out.println(s);
       

	}

}
