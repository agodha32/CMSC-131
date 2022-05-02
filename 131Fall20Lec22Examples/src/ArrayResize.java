
public class ArrayResize {

	public static void main(String[] args) {

		double[] arr = new double[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.random();
		}
		
		// I want to add another box to end of air with 0.5 in it
		double[] temp = new double[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[temp.length - 1] = 0.5;
		arr = temp;
		
	}

}
