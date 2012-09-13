/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 12:51:05 PM Sep 13, 2012
 * @SanFrancisco
 * LeetCode Problems
 */
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null) return null;
        ListNode astart =null;
        ListNode aend =null;
        ListNode bstart=null;
        ListNode bend=null;
        
        ListNode current = head;
        while(current!=null){
        	if(current.val < x){
        		if(astart == null){
        			astart = new ListNode(current.val);
        			aend = astart;
        		}
        		else{
        			aend.next = new ListNode(current.val);
        			aend = aend.next;
        		}
        	}
        	else{
        		if(bstart ==null){
        			bstart = new ListNode(current.val);
        			bend = bstart;
        		}
        		else{
        			bend.next = new ListNode(current.val);
        			bend = bend.next;
        		}
        	}
        	current = current.next;
        }
        if(astart == null){
        	return bstart;
        }
        aend.next = bstart;
        return astart;
    }
}
