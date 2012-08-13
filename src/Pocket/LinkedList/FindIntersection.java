/**
 * 
 */
package Pocket.LinkedList;

/**
 * Created by Wenqi Zhu
 * 10:42:15 PM Aug 12, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class FindIntersection {

	public Node findIntersectiong(Node a, Node b){
		Node A = a;
		Node B = b;
		
		int lenA = 0;
		int lenB = 0;
		
		while(A!=null){
			lenA++;
			A = A.next;
		}
		
		while(B!= null){
			lenB++;
			B = B.next;
		}
		
		A = a; B = b;
		
		int diff = Math.abs(lenA-lenB);
		
		if(lenA>lenB){
			while(diff!=0){
				A = A.next;
				diff--;
			}
			
		}else if(lenB>lenA){
			while(diff!=0){
				B = B.next;
				diff--;
			}
		}
			
		while(A!=null && B!=null){
			if(A==B){
				return A;
			}else{
				A = A.next;
				B = B.next;
			}
		}
		return null;
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
