/**
 * 
 */
package Stack;
import java.util.*;


/**
 * Created by Wenqi Zhu
 * 5:12:05 PM Apr 28, 2012
 * @Buffalo
 * Cracking the Coding Interview 
 */
public class StackWithMin extends java.util.Stack<NodeWithMin>{//each node record what the minimum beneath itself is.
	public void push(int value){
		int newMin = Math.min(value,min());
		super.push(new NodeWithMin(value,newMin));
	}
	
	public int min(){
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}
	
	
	public static void main(String[] args){
	StackWithMin stack = new StackWithMin();
	stack.push(5);
	stack.push(6);
	stack.push(1);
	stack.push(3);
	int result = stack.min();
	System.out.println(result);
	StackWithMin2 stack2 = new StackWithMin2();
	stack2.push(5);
	stack2.push(6);
	stack2.push(1);
	stack2.push(3);
	int result2 = stack2.min();
	System.out.println(result2);
	}

	
}

class NodeWithMin{
	public int value;
	public int min;
	public NodeWithMin(int v, int min){
		value = v;
		this.min = min;
	}
}

class StackWithMin2 extends java.util.Stack<Integer>{// use an additional stack which keeps track of the mins.
	java.util.Stack<Integer> s2;
	public StackWithMin2(){
		s2= new java.util.Stack<Integer>();
	}	
    public void push(int value){
    	if(value<=min()){
    		s2.push(value);
    	}
    	super.push(value);
    }
    
    public Integer pop(){
    	int value = super.pop();
    	if(value == min()){
    		s2.pop();
    	}
    	return value;
    }
    
    public int min(){
    	if(s2.isEmpty()){
    		return Integer.MAX_VALUE;
    	} else{
    		return s2.peek();
    	}
		
	}
}
