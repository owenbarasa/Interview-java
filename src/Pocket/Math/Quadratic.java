/**
 * 
 */
package Pocket.Math;

/**
 * Created by Wenqi Zhu
 * 5:53:34 PM Aug 9, 2012
 * @SanFrancisco
 * Pocket questions
 */
public class Quadratic {

	public static void findRoots(double a, double b, double c){
		double disc = b*b - 4*a*c;
		if(disc>0){
			double root1 = (-b+Math.sqrt(disc))/(2*a);
			double root2 = (-b-Math.sqrt(disc))/(2*a);
			System.out.print("The roots are unequal and irrational " + root1 + "and " + root2);
		}
		else if(disc==0){
			double root = -b/(2*a);
			System.out.print("The roots are equal and rational " + root + "and " + root);
		}
		else 
			System.out.print("The roots are imaginary.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findRoots(1,2,1);
	}

}
