package careercup;
/**
 * Created by wenqizhu 
 * Mar 30, 2012 7:39:20 PM
 * 
 **/

public class UniqueCharacters{

    /**
     * @param args
     */
    public boolean isUniqueChars2(String str) {
	if (str.length()>256) return false;
	
	boolean[] char_set = new boolean[256];
	for (int i = 0; i<str.length();i++) {
	    int val= str.charAt(i);
	    if (char_set[val]) {
		return false;
	    }
	    char_set[val]= true;
	}
	return true;
	}
	    

	
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	UniqueCharacters uqChar = new UniqueCharacters();
        boolean Val = uqChar.isUniqueChars2("abcdefg98765212");
        System.out.println(Val);
	

    }

}

