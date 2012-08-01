/**
 * 
 */
package Recursion;
import java.util.*;
import java.awt.Point;
/**
 * Created by Wenqi Zhu
 * 6:21:57 PM Jul 31, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 9.2
 * Imagine a robot sitting on the upper left corner of an X by Y grid.
 * The robot can only move in two directions, right and down.
 * How many possible paths are there for the robot to go from(0,0) to (X,Y)?
 * FOLLOW UP: Imagine certain spots are "off limits',such that the robot cannot step on them.
 * Design an algorithm to find a path for the robot from the top left to the bottom right. 
 */
public class GetPath {

	public boolean getPath(int x,int y, ArrayList<Point> path){
		Point p = new Point(x,y);
		path.add(p);
		if(x==0 && y ==0){
			return true;
		}
		boolean success = false;
		if(x>=1 && isFree(x-1,y)){//Try right
			success = getPath(x-1,y,path);
		}
		if(!success && y>=1 && isFree(x,y-1)){//Try down
			success = getPath(x,y-1,path);
		}
		if(!success){
			path.remove(p);
		}
		return success;
		
	}
	
	public boolean getPathDP(int x,int y,ArrayList<Point> path, Hashtable<Point,Boolean> cache){
		Point p = new Point(x,y);
		if(cache.containsKey(p)){
			return cache.get(p);
		}
		
		path.add(p);
		if(x==0 && y ==0){
			return true;
		}
		
		boolean success = false;
		if(x>=1 && isFree(x-1,y)){
			success = getPathDP(x-1,y,path,cache);
		}
		if(!success && y>=1 && isFree(x,y-1)){
			success = getPathDP(x,y-1,path,cache);
		}
		
		if(!success){
			path.remove(p);
		}
		cache.put(p, success);// Cache result
		return success;
		
		
	}
	
	public boolean isFree(int x, int y){
		if(x!=2 && y!=2){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
