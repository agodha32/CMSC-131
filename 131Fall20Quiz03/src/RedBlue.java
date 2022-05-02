
public class RedBlue {

	public static void main(String[] args) {

		for(int a = 1; a < 1000001; a++) {
			
			if (a % 509 == 0 && a % 521 == 0) {
				
				System.out.println("REDBLUE");
				
			} else if (a % 509 == 0){
				
				System.out.println("RED");
				
			} else if (a % 521 == 0) {
				
				System.out.println("BLUE");
				
			} else {
				
				System.out.println(a);
				
			}
			
		}
		
		
	}

}
