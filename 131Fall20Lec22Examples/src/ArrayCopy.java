
public class ArrayCopy {

	public static void main(String[] args) {

		double[] arr = new double[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.random();
		}
		
		double[] copy;
		copy = new double[arr.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = arr[i];
		}
		
	}

}
