
public class Question1 {

	public static int method1(char[][] a) {
		
		int counter = 0;
		
		for(int num = 0; num < a.length; num++) {
			
			for(int x = 0; x < a[num].length; x++) {
				
				if(a[num][x] == 'X') {
					
					counter++;
					
				}
				
			}
			
		}
		
		return counter;
		
	}
	
}
