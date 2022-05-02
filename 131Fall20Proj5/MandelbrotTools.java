import java.awt.Color;

	/* This class checks to see if a complex number series diverges or not, and 
	 * creates a color for the Mandelbrot graph. */

public class MandelbrotTools {
	
	/*  STUDENTS:  Put your "isBig" and "divergence" methods here. */
	
	/* Checks to see if the complex number is bigger than the divergence 
	 * boundary or not. */
	
	public static boolean isBig(ComplexNumber x) {
		
		MyDouble isNumBig = x.getReal().multiply(x.getReal()).add
				(x.getImag().multiply(x.getImag()));
		
		// returns true or false depending on if the number is big enough
		return isNumBig.compareTo(Controller.DIVERGENCE_BOUNDARY) > 0;
		
	}

	/* This method calculates a sequence of complex numbers and after each 
	 * value is computed, test to see whether or not it isBig.  */
	
	public static int divergence(ComplexNumber z) {
		
		int counter; // counter to see how many iterations are passed
		ComplexNumber newNum = z; // creates a basic complex number
		
		/* This loop checks if the counter has gone past its limit, and checks 
		 * if the series diverges or not, by checking if it isBig. */
		
		for (counter = 0; counter < Controller.LIMIT; ++counter) {
			
			newNum = newNum.multiply(newNum).add(z); // calculates the next num
			
			if (MandelbrotTools.isBig(newNum) == true) {
				
				break; // exits the loop if the series diverges
				
			}
			
		}
		
		/* This returns -1, if it goes all the way to the controller limit, and
		 * if not returns the counter number. */
		
		if (counter == Controller.LIMIT) {
			
			return -1;
			
		} else {
			
			return counter;	

		}
		
	}

	/* This method selects a non-black color for a point which DIVERGED when tested with the Mandelbrot
	 * recurrence, based on how many terms in the sequence were computed before the terms got "too big".
	 * 
	 * The parameter represents the index of the term in the sequence which was first to be "too big".  
	 * This value could be anything from 0 to Controller.LIMIT.  The return value is the Color to be used 
	 * to color in the point.
	 * 
	 * STUDENTS:  IF you want to have some fun, write code for the else-if clause below which says
	 * "modify this block to create your own color scheme".  When someone runs the program and selects 
	 * "Student Color Scheme", the code you have written below will determine the colors.
	 */
	public static Color getColor(int divergence) {
		Color returnValue;
		
		if (Controller.colorScheme == Controller.RED_AND_WHITE_BANDS) {
			returnValue = (divergence  % 2 == 0)? Color.WHITE : Color.RED;
		}
		
		else if (Controller.colorScheme == Controller.CRAZY_COLORS) {
			int value = divergence * 2;
			int redAmount = (value % 5) * (255/5);
			int greenAmount = (value % 7) * (255/7);
			int blueAmount = (value % 9) * (255/9);
			returnValue = new Color(redAmount, greenAmount, blueAmount); 
		}
		
		else if (Controller.colorScheme == Controller.STUDENT_DEFINED){
			
			
			/***************************************************************
			 * Modify this block to create your own color scheme!          *
			 ***************************************************************/
			returnValue = Color.WHITE;  // take this out and return something useful
			
			
		}
		else
			throw new RuntimeException("Unknown color scheme selected!");
		return returnValue;
	}
	
	

}
