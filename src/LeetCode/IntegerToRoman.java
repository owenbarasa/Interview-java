/**
 * 
 */
package LeetCode;

/**
 * Created by Wenqi Zhu
 * 4:38:16 PM Sep 2, 2012
 * @SanFrancisco
 * LeetCode Problems
 * Given an integer, convert it to a roman numeral.

	Input is guaranteed to be within the range from 1 to 3999.
	http://en.wikipedia.org/wiki/Roman_numerals
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
//    	Symbol	Value
//    	I	    1
//    	V		5
//    	X		10
//    	L		50
//    	C		100
//    	D		500
//    	M		1,000

        String[] digits = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = new String[] {"", "M", "MM", "MMM"};
        if (num > 3999)
            return "";
        
        String result = new String();
        result = thousands[num/1000];
        result += hundreds[(num/100)%10];
        result += tens[(num/10)%10];
        result += digits[num%10];
        return result;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
