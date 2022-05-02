

public class Question2 {

	public static int[][] method2(int[][] a) {
		
		int[][] array = a;
		
	    for(int num = 0; num < array.length; num++){
	    	
	        for(int x = 0; x < array[num].length / 2; x++) {
	        	
	            int temp = array[num][x];
	            
	            array[num][x] = array[num][array[num].length - x - 1];
	            
	            array[num][array[num].length - x - 1] = temp;
	            
	        }
	    }
	    
	    int [] top = array[0];
	    int [] bot = array[array.length - 1];
	    
	    array[0] = bot;
	    array[array.length - 1] = top;
	    		
		return array;
		
	}

	
}