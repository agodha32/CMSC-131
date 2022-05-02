
public class Question1 {

	public static int[] question1(int[] a) {
		
		int[] x = new int[a.length + a.length];
		int y = 0;
		
		
		for (int num = 0; num < a.length; num++) {
			
			x[num] = a[num];
		}
		
		for (int value = x.length; value > a.length; value--) {
			
			x[value - 1] = a[y];
			y++;
			
		}
		
		return x;
	}
	
}
