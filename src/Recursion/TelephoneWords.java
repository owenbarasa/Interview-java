/**
 * 
 */
package Recursion;

/**
 * Created by Wenqi Zhu
 * 3:36:40 PM Jul 31, 2012
 * @SanFrancisco
 * PIE TelephoneWords
 * Write a routine that takes a seven-digit telephone number and prints out all of the possible "words".
 */
public class TelephoneWords {

	public char getCharKey(int telephoneKey, int place){
		char letters[][] ={{'0','0','0','0'},{'0','1','1','1'},{'0','A','B','C'},{'0','D','E','F'},{'0','G','H','I'},{'0','J','K','L'},{'0','M','N','O'},{'0','P','R','S'},{'0','T','U','V'},{'0','W','X','Y'}};
		return letters[telephoneKey][place];
	}
	
	public static final int PHONE_NUMBER_LENGTH = 7;
	
	public void printTelephoneWords(int[] phoneNum){
		char[] result = new char[PHONE_NUMBER_LENGTH];
		doPrintTelephoneWords(phoneNum,0,result);
	}
	
	public void doPrintTelephoneWords(int[] phoneNum,int curDigit,char[] result){
		if(curDigit == PHONE_NUMBER_LENGTH){
			System.out.println(new String(result));
			return;
		}
		for(int i = 1; i<=3; i++){
			result[curDigit]= getCharKey(phoneNum[curDigit],i);
			doPrintTelephoneWords(phoneNum,curDigit+1,result);
			if((phoneNum[curDigit]==0)||(phoneNum[curDigit]==1))return;
		}
	}
	
	public void printTelephoneWordsNoRecursion(int phoneNum[]){
		char[] result = new char[PHONE_NUMBER_LENGTH];
		int i;
		for(i=0;i<PHONE_NUMBER_LENGTH;i++){//Initialize the result
		result[i]=getCharKey(phoneNum[i],1);
		}
		
		while(true){//main loop begins
			for(i=0;i<PHONE_NUMBER_LENGTH;++i){
				System.out.print(result[i]);
			}
			System.out.print('\n');
			
			for(i=PHONE_NUMBER_LENGTH-1;i>=-1;i--){//Start at the end and try to increment from right to left.
				if(i == -1) return; //you are done because you tried to carry the leftmost digit.
				
				if(getCharKey(phoneNum[i],3) == result[i]||phoneNum[i] ==0 ||phoneNum[i] ==1){
					result[i] = getCharKey(phoneNum[i],1);// No break, continues to next digit
				}
				else if(getCharKey(phoneNum[i],1)== result[i]){
					result[i] = getCharKey(phoneNum[i],2);
					break;
				}
				else if(getCharKey(phoneNum[i],2)== result[i]){
					result[i] = getCharKey(phoneNum[i],3);
					break;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelephoneWords result = new TelephoneWords();
		int[] phoneNum = {4,9,7,1,9,2,7};
		//result.printTelephoneWords(phoneNum);
		result.printTelephoneWordsNoRecursion(phoneNum);
	}

}
