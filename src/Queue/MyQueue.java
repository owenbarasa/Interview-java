/**
 * 
 */
package Queue;
import java.util.*;

/**
 * Created by Wenqi Zhu
 * 6:23:53 PM Apr 29, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 * Implementing a class which implements a queue using two stacks.
 */
public class MyQueue<T> {
	Stack<T> stackNewest, stackOldest;
	
	public MyQueue(){
		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();		
	}
	
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	
	public void add(T val){
		stackNewest.push(val);
	}
	
	public void shiftStack(){
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty()){
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	
	public T peek(){
		shiftStack();
		return stackOldest.peek();
	}
	public T remove(){
		shiftStack();
		return stackOldest.pop();
		
	}

}
