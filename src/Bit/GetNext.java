/**
 * 
 */
package Bit;

/**
 * Created by Wenqi Zhu
 * 12:45:51 AM Jul 26, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 5.3
 * Given a positive integer, print the next smallest and the next largest number 
 * that have the same number of 1 bits in their binary representation.
 */
public class GetNext {

	public int getNext(int n){
		//Compute c0 and c1
		int c = n;
		int c0 = 0;
		int c1 = 0;
		
		while(((c & 1)==0) && (c!=0)){
			c0++;
			c >>= 1;
		}
		
		while((c & 1)==1){
			c1++;
			c >>= 1;
		}
		
		//Error check: if n == 11...1100...00, then there is no bigger number with the same number of 1s
		if(c0 + c1 == 31 || c0 + c1 == 0){//32 bits integer contains 1 bit for sign.
			return -1;
		}
		
		int p = c0 + c1;
		
		n |= (1<<p);  //Flip rightmost non-trailing zero to 1.
		n &= ~((1<<p)-1); //Clear all bits to the  right of p.
		n |= (1<<(c1 -1))-1;// Insert(c1-1) ones on the right.
		return n;
	}

	
	public int getPrev(int n){
		int c = n;
		int c0 = 0;
		int c1 = 0;
		
		while(((c & 1)==1) && (c != 0)){
			c1++;
			c >>= 1;
		}
		
		if(c == 0){ // if n = 11...11 there is no smaller number with the same nuber of 1s.
			return -1;
		}
		
		while((c & 1)==0 &&(c!=0)){
			c0++;
			c >>=1;
		}
		
		int p = c0 + c1;
		
		n &= ((~0)<<(p+1)); //clear from bit p onwards.
		int mask = (1<<(c1+1))-1; //sequence of (c1+1) ones
		n |= mask<<(c0-1);
		
		return n;
		
		
	}
	public static void main(String[] args) {
		GetNext result = new GetNext();
		int n = 50;
		int m = result.getNext(n);
		UpdateBits.printBinaryInt("n",n);
		UpdateBits.printBinaryInt("m",m);
		
		int j = result.getPrev(n);
		UpdateBits.printBinaryInt("j",j);

	}

}
