package foodManagement;

/**
 * A SortedListOfImmutables represents a sorted collection of immutable objects 
 * that implement the Listable interface.  
 * 
 * An array of references to Listable objects is used internally to represent 
 * the list.  
 * 
 * The items in the list are always kept in alphabetical order based on the 
 * names of the items.  When a new item is added into the list, it is inserted 
 * into the correct position so that the list stays ordered alphabetically
 * by name.
 */
public class SortedListOfImmutables {

	/*
	 * STUDENTS:  You may NOT add any other instance variables or
	 * static variables to this class!
	*/
	private Listable[] items;

	/**
	 * This constructor creates an empty list by creating an internal array
	 * of size 0.
	 */
	public SortedListOfImmutables() {
		
		items = new Listable [0]; // creates a new list of items with size 0;
		
	}

	/**
	 *  Copy constructor.  The current object will become a copy of the
	 *  list that the parameter refers to.  
	 *  
	 *  @param other the list that is to be copied
	 */
	public SortedListOfImmutables(SortedListOfImmutables other) {
		
		this.items = other.items;
		
	}

	/**
	 * Returns the number of items in the list.
	 * @return number of items in the list
	 */
	public int getSize() {
		
		return items.length; // returns the length of the list as an integer
		
	}
	
	/**
	 * Returns a reference to a item in the i-th position in the list.(Indexing
	 * is 0-based, so the first element is element 0).
	 * 
	 * @param i index of item requested
	 * @return reference to the i-th item in the list
	 */
	public Listable get(int i) {
		
		return items[i]; // returns the ith item in the list
		
	}
	
	/**
	 * Adds an item to the list.  This method assumes that the list is already
	 * sorted in alphabetical order based on the names of the items in the list.
	 * 
	 * The new item will be inserted into the list in the appropriate place so
	 * that the list will remain alphabetized by names.
	 * 
	 * In order to accommodate the new item,the internal array must be re-sized 
	 * so that it is one unit larger than it was before the call to this method.
	 *  
	 * @param itemToAdd refers to a Listable item to be added to this list
	 */
	public void add(Listable itemToAdd) {

		//create an array that is one bigger than the items array
		Listable [] onePlus = new Listable [items.length + 1];
		
		// copy all the items from the original array to the new array
		for (int num = 0; num < items.length; num++) {
			
			onePlus[num] = items[num];
			
		}
		
		onePlus[onePlus.length - 1] = itemToAdd; // adding the item to the array
		
		// sorting the array
		for(int x = 0; x < onePlus.length; x++) {
			
			for(int y = x + 1; y < onePlus.length; y++) {
	
				if(onePlus[x].toString().compareTo(onePlus[y].toString()) > 0){
					
					Listable temp = onePlus[x];
					onePlus[x] = onePlus[y];
					onePlus[y] = temp;
					
					
				}
				
			}
			
			items = onePlus; // alias the new array with the old array
			
		}
		
		
		
	}

	/**
	 * Adds an entire list of items to the current list, maintaining the 
	 * alphabetical ordering of the list by the names of the items.
	 * 
	 * @param listToAdd a list of items that are to be added to the current object
	 */
	public void add(SortedListOfImmutables listToAdd) {
		
		// This loop goes through each element in the listToAdd, and adds it
		for(int num = 0; num < listToAdd.getSize(); num++) {
			
			add(listToAdd.get(num));
			
		}
		
	}
	
	/**
	 * Removes an item from the list.
	 * 
	 * If the list contains the same item that the parameter refers to, it will be 
	 * removed from the list.  
	 * 
	 * If the item appears in the list more than once, just one instance will be
	 * removed.
	 * 
	 * If the item does not appear on the list, then this method does nothing.
	 * 
	 * @param itemToRemove refers to the item that is to be removed from the list
	 */
	public void remove(Listable itemToRemove) {
		
		//checks if the itemToRemove is available
		if(checkAvailability(itemToRemove) == true) {
		
			//create an array that is one smaller than the items array
			Listable [] oneMinus = new Listable [items.length - 1];
		
			int x = 0;
			boolean removeTrue = false;
			
			/* This loop checks if the 	item in the array is the same one that
			 * should be removed, and if it has been removed once */
			
			for (int num = 0; num < items.length; num++) {
					
				if(itemToRemove.equals(items[num]) && removeTrue == false && 
						!(num == items.length - 1)) {
										
					num++;
					removeTrue = true;
													
				} else if(x > oneMinus.length - 1) {
					
					continue;
					
				}
								
				oneMinus[x] = items[num];
				x++;
									
			}	
				
			items = oneMinus;
		
		}
		
	}

	/**
	 * Removes an entire list of items from the current list.  Any items in the
	 * parameter that appear in the current list are removed; any items in the
	 * parameter that do not appear in the current list are ignored.
	 * 
	 * @param listToRemove list of items that are to be removed from this list
	 */
	public void remove(SortedListOfImmutables listToRemove) {

		// This loop goes through each element in the listToAdd, and removes it
		for(int num = 0; num < listToRemove.getSize(); num++) {
			
			remove(listToRemove.get(num));
			
		}
	}

	/**
	 * Returns the sum of the wholesale costs of all items in the list.
	 * 
	 * @return sum of the wholesale costs of all items in the list
	 */
	public int getWholesaleCost() {
		
		int wholesaleCost = 0; // sets an initial value of zero
		
		//calculate the Wholesale Cost for each item in the array
		for(int num = 0; num < items.length; num++) {
			
			wholesaleCost = wholesaleCost + items[num].getWholesaleCost();
			
		}
		
		return wholesaleCost;
		
	}

	/**
	 * Returns the sum of the retail values of all items in the list.
	 * 
	 * @return sum of the retail values of all items in the list
	 */
	public int getRetailValue() {
		
		int retailValue = 0; // sets an initial value of zero
		
		//calculate the Retail Cost for each item in the array
		for(int num = 0; num < items.length; num++) {
			
			retailValue = retailValue + items[num].getRetailValue();
			
		}
		
		return retailValue;
	}

	/**
	 * Checks to see if a particular item is in the list.
	 * 
	 * @param itemToFind item to look for
	 * @return true if the item is found in the list, false otherwise
	 */
	public boolean checkAvailability(Listable itemToFind) {
		
		boolean isAvailable = false; //sets an initial value
		
		// goes through the loop to check for the item
		for(int num = 0; num < items.length; num++) {
			
			if(itemToFind.getName() == items[num].getName()) {
				
				isAvailable = true;
				
			}
			
		}
		
		return isAvailable;
		
	}

	/**
	 * Checks if a list of items is contained in the current list.
	 * 
	 * @param listToCheck list of items that may or may not be a subset of the
	 * current list
	 * @return true if the parameter is a subset of the current list; false 
	 * otherwise
	 */
	public boolean checkAvailability(SortedListOfImmutables listToCheck) {
		
		// This creates a copy of both the listToCheck and items
		SortedListOfImmutables copy = new SortedListOfImmutables(listToCheck);
		SortedListOfImmutables copyTwo = new SortedListOfImmutables();
		
		for(int x = 0; x < items.length; x++) {
			
			copyTwo.add(items[x]);
			
		}

		
		//goes through the list to check if all items are available			
		for(int num = 0; num < listToCheck.getSize(); num++) {
			
			if(copyTwo.checkAvailability(listToCheck.get(num)) == true) {
					
				copy.remove(listToCheck.get(num)); // removes if present
				copyTwo.remove(listToCheck.get(num)); // removes if present

					
			}
				
		}
		
		return copy.getSize() == 0;
		
	}

	/*
	 * We'll give you this one for free.  Do not modify this method or you
	 * will fail our tests!
	 */
	public String toString() {
		String retValue = "[ ";
		for (int i = 0; i < items.length; i++) {
			if (i != 0) {
				retValue += ", ";
			}
			retValue += items[i];
		}
		retValue += " ]";
		return retValue;
	}
}
