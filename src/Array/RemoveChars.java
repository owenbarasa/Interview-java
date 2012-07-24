/**
 * 
 */
package Array;

/**
 * Created by Wenqi Zhu
 * 7:49:54 PM Jul 21, 2012
 * @SanFrancisco
 * PIE P76
 * remove specified charactors in O(N).
 * 
 */
public class RemoveChars {
	public String removeChars(String str,String remove){
		char[] s = str.toCharArray();
		char[] r = remove.toCharArray();
		boolean[] flags = new boolean[128];//assume ASCII
		int len = s.length;
		int src,dst;
		
		for(src = 0; src<r.length; src++){
			flags[r[src]] = true;
		}
		src = 0;
		dst = 0;
		
		while(src<len){
			if(!flags[(int)s[src]]){
				s[dst]=s[src];
				dst++;
			}
			src++;
		}
		return new String(s,0,dst);
	}
	
	
	
	public static void main(String[] args) {
		RemoveChars result = new RemoveChars();
		String str = result.removeChars("abcdefghij", "def");
		System.out.print(str);

	}

}
