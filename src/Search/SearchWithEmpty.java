/**
 * 
 */
package Search;

/**
 * Created by Wenqi Zhu
 * 3:14:33 PM Aug 6, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 
 */
public class SearchWithEmpty {
	public int searchR(String[] string,String str,int first,int last){
		int mid = (first+last)/2;
		if(string[mid].isEmpty()){
			int left = mid -1;
			int right = mid +1;
			while(true){
				if(left<first && right>last){
					return -1;
				}
				else if(right <= last && !string[right].isEmpty()){
					mid = right;
					break;
				}
				else if (left >= first && !string[left].isEmpty()){
					mid = left;
					break;
				}
				right++;
				left--;
			}
			
		}
		if(str.equals(string[mid])){
			return mid;
		}
		else if(string[mid].compareTo(str)<0){
			return searchR(string,str,mid+1,last);
		}
		else {
			return searchR(string,str,first,mid-1);
		}
	}
	
	public int search(String[] string,String str){
		if(string == null || str == null || str== ""){
				return -1;
		}
		return searchR(string,str,0,string.length);
	}

}
