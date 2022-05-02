
public class ExplicitCastingOverflowError {

	public static void main(String[] args) {

		long x = 1723487L;
		int y = (int)x;
		System.out.println(y);
		
		x = 1782347812734L;
		y = (int)x;
		System.out.println(y);
		
	}

}
