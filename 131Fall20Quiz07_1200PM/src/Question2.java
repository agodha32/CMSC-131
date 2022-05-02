
public class Question2 {

	public static int[] method2(int[] a) {
		
		int []array = new int[a.length];
		int x = 0;
		
		for (int num = a.length - 1; num >= 0; num--) {
			
			array[x] = a[num];
			x++;

		}
		
		return array;
		
	}
	
}
