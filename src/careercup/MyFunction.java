package careercup;

/**
 * Created by wenqizhu 
 * Apr 1, 2012 10:10:25 AM
 * 
 **/
public class MyFunction {

    public static void myFunction(int n) {
	if(n == 0) {
	    return;
	} else {
	    System.out.println(n) ;
	    myFunction(--n);
	    System.out.println(n);
	}
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	myFunction(5);
    }

}
