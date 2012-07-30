/**
 * 
 */
package Recursion;

/**
 * Created by Wenqi Zhu
 * 2:06:06 PM Jul 30, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 
 */
public class PermuteString {


	public void permute(String str){
		int length = str.length();
		boolean[] used = new boolean[length];
		StringBuffer out = new StringBuffer();
		char[] in = str.toCharArray();
		doPermute(in,out,used,length,0);
	}
	
	public void doPermute(char[] in,StringBuffer out, boolean[] used, int length,int level){
		if(level ==length){
			System.out.println(out.toString());
			//return;
		}
		
		for(int i = 0; i < length; i++){
			if(!used[i]){
				out.append(in[i]);
				used[i] = true;
				doPermute(in,out,used,length,level+1);
				used[i] = false;
				out.setLength(out.length()-1);			
			}
		}
	}
	static void permute(int level, String permuted,boolean used[], String original) {
			int length = original.length();
			if (level == length) {
			System.out.println(permuted);
			return;
			} 
			else{
				for (int i = 0; i < length; i++) {
					if (!used[i]) {
						used[i] = true;
						permute(level + 1, permuted + original.charAt(i),
								used, original);
						used[i] = false;
        }
    }
}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "abc";
		//PermuteString result = new PermuteString();
		//result.permute(str);
		String s = "abc";
		boolean used[] = {false, false, false, false, false};
		permute(0, "", used, s);
		
	}

}
