
/* This class creates a complex number, also enables you to get the real and 
 * imaginary numbers through getters. This class will let you do multiple 
 * operations with complex numbers and convert a string to a complex number and
 * vice versa. */

public class ComplexNumber {

	/* STUDENTS: You may NOT add any further instance or static variables! */
	private final MyDouble real; // To be initialized in constructors
	private final MyDouble imag; // To be initialized in constructors

/* STUDENTS: Put your methods here, as described in the project description. */

	/* This constructor will create a new complex number with the given info */
	
	public ComplexNumber(MyDouble real, MyDouble imag) {

		this.real = real; // sets the real component of the complex number
		this.imag = imag; // sets the imaginary component of the complex number

	}
	
	/* This constructor will create a new complex number where the imaginary 
	 * number is 0i, and the real number will be taken in through the parameter. */

	public ComplexNumber(MyDouble real) {

		this.real = real; // sets the real component of the complex number
		this.imag = new MyDouble(0); // sets the imaginary component to 0

	}

	/* This copy constructor creates a shallow copy through aliasing another 
	 * complex number */
	
	public ComplexNumber(ComplexNumber x) {

		this.real = x.real; // Aliases the real component of the number
		this.imag = x.imag; // Aliases the imaginary component of the number

	}

	/* This getter gets the real component of the complex number */
	
	public MyDouble getReal() {

		return this.real; // returns the real component of the number

	}

	/* This getter gets the imaginary component of the complex number */
	
	public MyDouble getImag() {

		return this.imag; // returns the imaginary component of the number

	}
	
	/* This instance method adds two complex numbers */
	
	public ComplexNumber add(ComplexNumber x) {

		MyDouble realNew = real.add(x.real); // adds the real component
		MyDouble imagNew = imag.add(x.imag); // adds the imaginary component

		return new ComplexNumber(realNew, imagNew); // returns the number

	}

	/* This instance method subtracts two complex numbers */
	
	public ComplexNumber subtract(ComplexNumber x) {

		MyDouble realNew = real.subtract(x.real); // subtracts the real part
		MyDouble imagNew = imag.subtract(x.imag); // subtracts imaginary part

		return new ComplexNumber(realNew, imagNew); // returns the number

	}

	/* This instance method multiples two complex numbers */
	
	public ComplexNumber multiply(ComplexNumber x) {

		/* This multiplies the real with the real and the imaginary with the 
		 * imaginary, then subtracts them. */
		
		MyDouble realNew = real.multiply(x.real).subtract
				(imag.multiply(x.imag));

		// This multiples the real and imaginary components and adds them
		MyDouble imagNew = real.multiply(x.imag).add(imag.multiply(x.real));

		return new ComplexNumber(realNew, imagNew); // returns the new number

	}

	/* This instance method divides two complex numbers */
	
	public ComplexNumber divide(ComplexNumber x) {

		// Calculates the numerator for the real number
		MyDouble realNum = real.multiply(x.real).add(imag.multiply(x.imag));

		// Calculates the numerator for the imaginary number
		MyDouble imagNum = imag.multiply(x.real).subtract
				(real.multiply(x.imag));

		// Calculates the denominator
		MyDouble bothDen = x.real.multiply(x.real).add
				(x.imag.multiply(x.imag));

		return new ComplexNumber(realNum.divide(bothDen),
				imagNum.divide(bothDen)); // returns the new number

	}

	/* This method checks if two complex numbers are the same, it checks if the 
	 * real and the imaginary component are the same. */
	
	public boolean equals(ComplexNumber x) {

		return (this.real.equals(x.real) && this.imag.equals(x.imag));

	}
	
	/* This method compares two complex numbers by comparing their norm and
	 * If the norms are equal, this method returns 0, if the norm of the 
	 * current object is less than the norm of the parameter, this method 
	 * returns -1, if the norm of the current object is greater than the norm 
	 * of the parameter, this method returns 1. */
	
	public int compareTo(ComplexNumber x) {

		return norm(this).compareTo(norm(x));

	}

	/* This method returns a complex number as a string */
	
	public String toString() {
		
		// converting the real number to a string
		String realNumString = real.toString(); 
		
		// create an empty string for the imaginary component
		String imagNumString = "";
				
		// This loop checks if the imaginary number is positive or negative
		if (imag.abs().compareTo(imag) == 0) { // if number is positive
			
			imagNumString = "+" + imag.toString() + "i";
			
		} else { // if number is negative
			
			imagNumString = imag.toString() + "i";
			
		}
		
		return realNumString + imagNumString; // returns the number as a string
		
	}

	/* This method calculates the norm of a complex number */
	
	public static MyDouble norm(ComplexNumber x) {

		/* mult --> is squaring the real and the imaginary then adding them 
		 * so it is doing a^2+b^2. */
		MyDouble mult = x.real.multiply(x.real).add(x.imag.multiply(x.imag));

		return mult.sqrt(); // Returns the sqrt of mult, which is the norm

	}

	/* This method converts a string into a double */
	
	public static ComplexNumber parseComplexNumber(String x) {
		
		x = x.replaceAll(" ",""); // removes all spaces
		String firstNumber = ""; // variable for real number
		String secondNumber = ""; // variable for imaginary number
		double realNum = 0; // variable to convert to myDouble for real
		double imagNum = 0; // variable to convert to myDouble for imaginary
		ComplexNumber parseFinal = null;
		
		/*This loop checks if the imaginary component is positive or negative*/
		
		if (x.indexOf('+') > 0) { // imaginary component is positive
			
			// creates a new string up to the + sign of the imaginary number
			firstNumber = x.substring(0, x.indexOf('+'));
			
			/* creates a new string from the + sign of the imaginary number up
			 * to the end of the string */
			secondNumber = x.substring(x.indexOf('+') + 1, x.length() - 1);
			
			// converts the real string to a double primitive
			realNum = Double.parseDouble(firstNumber);
			
			// converts the imaginary string to a double primitive
			imagNum = Double.parseDouble(secondNumber);
			
			parseFinal = new ComplexNumber(new MyDouble(realNum), 
					new MyDouble(imagNum)); // creates the new complex number
			
		} else { // imaginary component is negative
			
			// creates a new string up to the last - sign of the number
			firstNumber = x.substring(0, x.lastIndexOf('-'));
			
			/* creates a new string from the - sign of the imaginary number up
			 * to the end of the string */
			secondNumber = x.substring(x.lastIndexOf('-'), x.length() - 1);
			
			// converts the real string to a double primitive
			realNum = Double.parseDouble(firstNumber);
						
			// converts the imaginary string to a double primitive
			imagNum = Double.parseDouble(secondNumber);
						
			parseFinal = new ComplexNumber(new MyDouble(realNum), 
					new MyDouble(imagNum)); // creates the new complex number		
		}
		
		return parseFinal; // returns the final complex number
		


	}

}
