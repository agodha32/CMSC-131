
public class Question2 {

	public static int[] question2(int[][] a) {
		
		int x = 0, y = 0;
		
		for(int numRows = 0; numRows < a.length; numRows++) {
			
			x = x + a[numRows].length;
			
		}

		int[] finalArray = new int[x];
		
		for(int col = 0; col < a.length; col++) {
			
			for(int rows = 0; rows < a[col].length; rows++) {
				
				finalArray[y] = a[col][rows];
				y++;
				
			}
		}
		
		return finalArray;
		
	}
	
}
