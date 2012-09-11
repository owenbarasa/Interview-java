/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 2:22:11 PM Sep 11, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class MergeKSortedLists {
	public ListNode mergeKLists(ArrayList<ListNode> lists) {
        // Start typing your Java solution below
        // DO NOT write main() function
		//int count = 0;
		if(lists.size()<1)
			return null;
		
        Comparator<ListNode> comparator = new MyComparator1();
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(),comparator);
        

        for(int i=0;i<lists.size();i++){
        	if(lists.get(i)!=null)
        	queue.add(lists.get(i));
        }
        
        if(queue.size()==0)
        	return null;
        
        ListNode head = null;
        ListNode current = null;
        ListNode tmp = queue.poll();
        current = new ListNode(tmp.val);
        head = current;
        if(tmp.next!=null)
        		queue.add(tmp.next);
        	
        while(queue.size()>0){
        	tmp = queue.poll();
        	current.next = new ListNode(tmp.val);
        	current = current.next;
        	if(tmp.next!=null)
        		queue.add(tmp.next);
        }
        
        return head;
        
    }
	

	public static void main(String[] args){
		ArrayList<ListNode> lists = new ArrayList<ListNode>();
		ListNode a = new ListNode(1);
		a.next = new ListNode(3);
		ListNode b = new ListNode(2);
		b.next = new ListNode(3);
		lists.add(a);
		lists.add(b);
		MergeKSortedLists result = new MergeKSortedLists();
		ListNode r = result.mergeKLists(lists);
		while(r!=null){
			System.out.print(r.val + " ");
			r= r.next;
		}
	}
}
class MyComparator1 implements Comparator<ListNode>{
	@Override
	public int compare(ListNode l1,ListNode l2){
		if(l1.val < l2.val) return -1;
		else if(l1.val > l2.val) return 1;
		return 0;
	}
}
