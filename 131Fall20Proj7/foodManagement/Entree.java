package foodManagement;

/**
 * An IMMUTABLE class that represents a list of food and a name.  For example, 
 * a typical entree might be called "Big Bubba Breakfast" and might consist of
 * the list:  2 Egg, 3 Waffle, 1 Bacon, 1 Coffee
 */
public class Entree implements Listable {
	
	private String name;
	private SortedListOfImmutables foodList; // This list has Food objects
	
	/**
	 * Standard constructor.  To ensure that the Entree class remains immutable,
	 * this constructor will make a copy of the list that foodListIn refers to.
	 * 
	 * @param nameIn desired name for this Entree
	 * @param foodListIn desired list of Food for this Entree
	 */
	public Entree(String nameIn, SortedListOfImmutables foodListIn) {
		
		this.name = nameIn;
		this.foodList = new SortedListOfImmutables(foodListIn);
		
	}
	
	/**
	 * Getter for name of Entree
	 * 
	 * @return reference to the name of Entree
	 */
	public String getName() {
		
		return this.name;
		
	}
	
	/**
	 *  Getter for FoodList for this entree.
	 *  
	 *  @return reference to a copy of the FoodList for this entree
	 */
	public SortedListOfImmutables getFoodList() {
		
		SortedListOfImmutables copyofFoodList = new 
				SortedListOfImmutables(this.foodList); // make a copy
		
		return copyofFoodList;
		
	}
	
	/**
	 * Returns the wholesale cost of the food in this entree
	 * 
	 * @return wholesale cost of the food in this entree
	 */
	public int getWholesaleCost() {
		
		return foodList.getWholesaleCost();
		
	}
	
	/**
	 * Returns the retail value of the food in this entree
	 * 
	 * @return retail value of the food in this entree
	 */
	public int getRetailValue() {

		return foodList.getRetailValue();
		
	}
	
	/**
	 * Compares the current object to the parameter and returns true if they
	 * have the same name.
	 * 
	 * @param other Entree to be compared to the current object
	 * @return true if the current object and the parameter have the same name, 
	 * false otherwise
	 */
	public boolean equals(Entree other) {
		
		if ( !(other instanceof Entree)) { // returns false if other is not the
										   // the proper variable type
			return false;
		}
		
		Entree x = (Entree)other;
		
		return name == x.name && foodList == x.foodList;
		
	}
	

	public String toString() {
		String retValue = "< ";
		for (int i = 0; i < foodList.getSize(); i++) {
			if (i != 0) {
				retValue += ", ";
			}
			retValue += foodList.get(i);
		}
		retValue += " >";
		return retValue;
	}
}
