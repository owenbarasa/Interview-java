/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 10:29:10 PM Sep 10, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a collection of intervals, merge all overlapping intervals.
	For example,
	Given [1,3],[2,6],[8,10],[15,18],
	return [1,6],[8,10],[15,18].
 */


public class MergeIntervals {

	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> result = new ArrayList<Interval>();
        
        Collections.sort(intervals,new MyComparator());
        Interval current = intervals.get(0);
        for(int i = 1;i<intervals.size(); i++){
        	Interval tmp = intervals.get(i);
        	if(tmp.start<=current.end)
        		current.end = Math.max(tmp.end, current.end);
        	else{
        		result.add(current);
        		current = tmp;
        	}
        }
        result.add(current);
        return result;
    }
	
	public static void main(String[] args){
		ArrayList<Interval> test = new ArrayList<Interval>();
		test.add(new Interval(1, 3));
		test.add(new Interval(2, 6));
		test.add(new Interval(8, 10));
		test.add(new Interval(15, 18));
		//test.add(new Interval(2, 9));
		MergeIntervals te = new MergeIntervals();
		test = te.merge(test);
		for(Interval i: test) {
			System.out.print("[" + i.start + ", " + i.end + "]");
		}
		
	}
	/**
	 * @param args
	 */
	
	
}
class MyComparator implements Comparator<Interval>{
	@Override
	public int compare(Interval x, Interval y){
		if(x.start<y.start)
			return -1;
		else if(x.start>y.start)
			return 1;
		return 0;
	}
}




