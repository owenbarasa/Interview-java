/**
 * 
 */
package Tree;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 9:18:50 PM Jun 26, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 4.4
 * Given a BST,design an algorithm which creates a linked list of all the nodes at each depth
 */
public class LevelLinkedList {//depth first
	  private void createLevelLinkedList(Node node,ArrayList<LinkedList<Node>> lists, int level){
		  if(node == null) return;
		  LinkedList<Node> list = null;
		  if(lists.size() == level){ //level not contained in lists
			  list = new LinkedList<Node>();
			  lists.add(list);
		  }else{
			  list = lists.get(level);
		  }
		 list.add(node);
	     createLevelLinkedList(node.getLeft(),lists,level+1);
	     createLevelLinkedList(node.getRight(),lists,level+1);
	  }
	  
	  public ArrayList<LinkedList<Node>> createLevelLinkedList(Node node){// breadth first
		  ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		  createLevelLinkedList(node,lists,0);
		  return lists;
	  }
	  
      public ArrayList<LinkedList<Node>> createLevelLinkedList2(Node node){
    	  ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
    	  LinkedList<Node> current = new LinkedList<Node>();
    	  if(node!=null){
    		  current.add(node);
    	  }
    	  while(current.size()>0){
    		  result.add(current);//add previous level
    		  LinkedList<Node> parents = current;
    		  current = new LinkedList<Node>();
    		  for(Node parent : parents){
    			  if(parent.getLeft()!=null){
    				  current.add(parent.getLeft());
    			  }
    			  if(parent.getRight()!=null){
    				  current.add(parent.getRight());
    			  }
    		  }
    	  }
    	  return result;
      }
      
      
}
