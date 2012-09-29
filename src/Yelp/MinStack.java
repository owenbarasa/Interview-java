/**
 * 
 */
package Yelp;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 1:29:52 PM Sep 28, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class MinStack {
	public Stack<Integer> stack;
	public Stack<Integer> minStack;
	
	public MinStack(){
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}
	
	public boolean isEmpty(){
		return stack.empty();
	}
	
	public void push(int in){
		if(isEmpty()){
			stack.push(in);
			minStack.push(in);
		}else{
			stack.push(in);
			if(minStack.peek()>in){
				minStack.push(in);
			}
		}
	}
	
	public int peek(){
		return stack.peek();
	}
	
	public int pop(){
		if(stack.peek() == minStack.peek()){
			minStack.pop();
		}
		return stack.pop();
	}
	
	public int getMin(){
		return minStack.peek();
	}
	
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
