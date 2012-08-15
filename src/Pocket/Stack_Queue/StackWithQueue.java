/**
 * 
 */
package Pocket.Stack_Queue;
import java.util.*;

/**
 * Created by Wenqi Zhu
 * 12:33:10 AM Aug 15, 2012
 * @SanFrancisco
 * Pocket questions
 * Implement a stack with one queue.
 * basic idea: shift the poll side to add side, cuz a stack has only one access.So if we want to
 * poll a element, we need to poll the latest added one, so keep poll out this side and add in 
 * another side till we get the latest added one, and poll out this value for pop();
 */
public class StackWithQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iStack stack = new iStack();
		System.out.println(stack.pop()); //Empty case
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		while(stack.size()!=0){
			System.out.println(stack.pop());
		}
		
		

	}

}
class iStack{
	Queue<Integer> stack;
	
	public iStack(){
		stack = new LinkedList<Integer>();
	}
	
	
	public int pop(){
		if(stack.size()== 0) return -999;
		for(int i = 0;i<stack.size()-1;i++){
			stack.add(stack.poll());
		}
		return stack.poll();	
	}
	
	public void push(int val){
		stack.add(val);
	}
	
	public int size(){
		return stack.size();
	}
	
}