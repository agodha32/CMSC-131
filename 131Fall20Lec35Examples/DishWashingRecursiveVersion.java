
public class DishWashingRecursiveVersion {

	public static void washDishes(int n) {
		if (n == 1) {
			System.out.println("Washing a dish");
			return;
		} else {
			washDishes(n - 1);
			System.out.println("Washing a dish");
	
		}
		
	}
	
	public static void main(String[] args) {
		washDishes(4);
	}
}
