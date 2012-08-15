/**
 * 
 */
package Pocket.Stack_Queue;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 1:32:18 AM Aug 15, 2012
 * @SanFrancisco
 * Pocket questions
 * implement a queue with two stacks.
 */
public class QueueWith2Stacks {

	/**
	 * @param args
	 */
	Stack<Integer> content;
	Stack<Integer> tmp;
	public QueueWith2Stacks(){
		content = new Stack<Integer>();
		tmp = new Stack<Integer>();
	}
	
	
	public void enqueue(int val){
		while(tmp.size()!=0){
			content.push(tmp.pop());
		}
		content.push(val);
	}
	
	public int dequeue(){
		while(content.size()!=0){
			tmp.push(content.pop());
		}
		return tmp.pop();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWith2Stacks queue = new QueueWith2Stacks();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}

}
