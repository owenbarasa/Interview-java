/**
 * 
 */
package LeetCode;
import java.util.*;
/**
 * Created by Wenqi Zhu
 * 3:10:41 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

	You may assume that the intervals were initially sorted according to their start times.

	Example 1:
	Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

	Example 2:
	Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

	This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 */
public class InsertInterval {

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<Interval> result = new ArrayList<Interval>();
		Iterator<Interval> iterator = intervals.iterator(); 
		while(iterator.hasNext()){
			Interval current = iterator.next();
			if(newInterval.end< current.start){
				result.add(newInterval);
				result.add(current);
				while(iterator.hasNext()){
					result.add(iterator.next());
				}
				return result;
			}
			
			if(current.end< newInterval.start){
				result.add(current);
			}
			else{
				newInterval.start = Math.min(newInterval.start,current.start);
				newInterval.end = Math.max(newInterval.end, current.end);
			}
		}
		result.add(newInterval);
		return result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Interval{
	int start;
	int end;
	Interval(){
		start = 0;
		end = 0;
	}
	Interval(int s, int e){
		start = s;
		end = e;
	}
}
