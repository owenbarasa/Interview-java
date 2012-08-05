/**
 * 
 */
package Recursion;

/**
 * Created by Wenqi Zhu
 * 11:14:26 PM Aug 1, 2012
 * @SanFrancisco
 * Cracking the Coding Interview 9.7
 * Implement the "paint fill" function that given a screen(represented by a two-dimensional array of colors)
 * a point,and a new color,fill in the surrounding area until the color changes from the original color.
 */
public class PaintFill {
	enum Color{
		Black,White,Red,Yellow,Green
	}
	
	boolean paintFill(Color[][] screen, int x ,int y, Color ocolor, Color ncolor){
		if(x<y || x>= screen[0].length || y<0 || y>=screen.length){
			return false;
		}
		
		if(screen[y][x] == ocolor){
			screen[y][x] = ncolor;
			paintFill(screen,x-1,y,ocolor,ncolor);
			paintFill(screen,x+1,y,ocolor,ncolor);
			paintFill(screen,x,y-1,ocolor,ncolor);
			paintFill(screen,x,y+1,ocolor,ncolor);
		}
		return true;
	}
	boolean pointFill(Color[][] screen, int x, int y, Color ncolor){
		return paintFill(screen,x,y,screen[y][x],ncolor);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
