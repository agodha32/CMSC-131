package rectangular2DArrays;

public class CatCollection {

	public static void main(String[] args) {
		
		Cat[][] catCollection = new Cat[3][];
		
		catCollection[0] = new Cat[3];
		catCollection[1] = new Cat[2];
		catCollection[2] = new Cat[1];
		
		catCollection[0][0] = new Cat("Dave");
		catCollection[0][1] = new Cat("Cindy");
		catCollection[0][2] = new Cat("Mary");
		catCollection[1][0] = new Cat("Frank");
		catCollection[1][1] = new Cat("Tony");
		catCollection[2][0] = new Cat("Steve");

	}

}
