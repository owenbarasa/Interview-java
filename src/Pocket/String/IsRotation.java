/**
 * 
 */
package Pocket.String;

/**
 * Created by Wenqi Zhu
 * 4:15:50 PM Aug 8, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class IsRotation {

	public boolean isRotation(String s1,String s2){
		
		if(s1.length()>0 && s1.length()==s2.length()){
			String s1s1 = s1 + s1;
			return isSubstring(s1s1,s2);
		}
		
		return false;
		
	}
	
	public static boolean isSubstring(String s1,String s2){
		if(s2.isEmpty()){
			return true;
		}
		
		if(s1.isEmpty()){
			return s2.isEmpty();
		}
		
		if(s1.length()<s2.length()){
			return false;
		}
		if(s1.length()==s2.length()){
			return s1.equals(s2);
			}
		
		
		return isSubstring(s1.substring(0, s1.length()-1), s2) || isSubstring(s1.substring(1),s2);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		IsRotation result = new IsRotation();
		System.out.print(result.isRotation(s1, s2));
	}

}
