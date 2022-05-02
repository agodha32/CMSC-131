
public class Question3 {

	public static int[] method3(int[] a, int[] b) {
		
		int []array = new int[a.length + b.length];
		
		
		for (int num = 0; num < array.length; num += 2) {
						
			array[num] = a[num];
			
			array[num + 1] = b[num];
			
		}
		
		return array;
		
	}
	
			
}
	
