/**
 * 
 */
package Pocket.Tree;

/**
 * Created by Wenqi Zhu
 * 8:31:13 PM Aug 14, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class ParentLCA {

	class PNode{
		PNode parent;
		int val;
		PNode(int n){
			val = n;
			parent = null;
		}
	}
	
	public int getHeight(PNode node){
		int h = 0;
		while(node !=null){
			h++;
			node = node.parent;
		}
		return h;
	}
	
	
	public PNode parentLCA(PNode p, PNode q){
		int hp = getHeight(p);
		int hq = getHeight(q);
		
		int diff = Math.abs(hp - hq);
		if(hp>hq){
			for(int i = 0;i<diff;i++){
				p = p.parent;
			}
		}else if(hp<hq){
			for(int i = 0; i<diff;i++){
				q = q.parent;
			}
		}
		
		while(p!=null && q!= null){
			if(p == q)
				return p;
			else{
				p = p.parent;
				q = q.parent;
			}
		}
		
		return null;
	}
	
	
}
