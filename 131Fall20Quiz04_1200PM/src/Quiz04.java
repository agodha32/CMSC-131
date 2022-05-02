
public class Quiz04 {
	
	public static void printNumbers(int n) {

		for (int num = 1; num <= n; num++) {
			
			for (int counter = 0; counter < num; counter++) {
				
				System.out.print(num);
				
			}
			
		}
		
	}

	public static void makeShape(int size) {
		
		for(int i =1; i <= size; i++) {
			
		    String s = "$";
		    
		    for(int j = 0; j < (size - 1); j++) {
		       
		    	if(s.length() < size - 1) {
		        
		            s += "$";
		            
		        } else {
		        
		            s += "*";
		            
		        }
		    	
		    }
		    System.out.println(s);
		}
		
	}
		
}

