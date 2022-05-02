import static org.junit.Assert.*;
import org.junit.Test;
import foodManagement.*;

public class PublicTests {

	private static final Food BACON = Food.FOOD_OBJECTS[0];
	private static final Food WAFFLE = Food.FOOD_OBJECTS[1];
	private static final Food EGG = Food.FOOD_OBJECTS[2];
	private static final Food OJ = Food.FOOD_OBJECTS[3];
	private static final Food MILK = Food.FOOD_OBJECTS[4];
	
	@Test
	public void testDefaultConstructorAndGetSize() {
		SortedListOfImmutables list = new SortedListOfImmutables();
		assertTrue(list.getSize() == 0);
		assertEquals("[  ]", list.toString());
	}
	
	@Test
	public void testListSimpleAdd() {
		SortedListOfImmutables list = new SortedListOfImmutables();
		for (int i = Food.FOOD_OBJECTS.length - 1; i >= 0; i--) {
			list.add(Food.FOOD_OBJECTS[i]);
		}
		assertEquals(Food.FOOD_OBJECTS.length, list.getSize());
		assertEquals("[ Bacon, Cereal, Coffee, Croissant, Donut, Egg, "
				+ "Hashbrowns, Melon, Milk, Orange Juice, Pancakes, Pie, "
				+ "Toast, Waffle ]", list.toString());
		
		list.add(BACON);
		list.add(WAFFLE);
		list.add(EGG);
		list.add(MILK);
		list.add(EGG);
		list.add(OJ);
		assertEquals(20, list.getSize());
		assertEquals("[ Bacon, Bacon, Cereal, Coffee, Croissant, Donut, Egg, "
				+ "Egg, Egg, Hashbrowns, Melon, Milk, Milk, Orange Juice, "
				+ "Orange Juice, Pancakes, Pie, Toast, Waffle, Waffle ]" ,
				list.toString());
	}	
	
	@Test
	public void testCopyConstructor() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		list.add(BACON);
		list.add(WAFFLE);
		list.add(EGG);
		list.add(MILK);
		
		SortedListOfImmutables lists = new SortedListOfImmutables(list);
		list.add(OJ);
		
		assertTrue(list != lists);
		assertFalse(list.get(3) == lists.get(3));
		
	}
	
	@Test
	public void testAddList() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		list.add(BACON);
		list.add(WAFFLE);
		list.add(EGG);
		list.add(MILK);
		
		SortedListOfImmutables lists = new SortedListOfImmutables();
		lists.add(list);
		
		assertEquals("[ Bacon, Egg, Milk, Waffle ]" , lists.toString());
		
	}
	
	@Test
	public void testListSimpleRemove() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		
		list.add(BACON);
		list.add(WAFFLE);
		list.add(EGG);
		list.add(MILK);
		list.add(OJ);
		list.add(EGG);
		
		assertEquals("[ Bacon, Egg, Egg, Milk, Orange Juice, Waffle ]",
				list.toString());
		
		list.remove(BACON);	
		assertEquals("[ Egg, Egg, Milk, Orange Juice, Waffle ]", 
				list.toString());
		
		list.remove(WAFFLE);	
		assertEquals("[ Egg, Egg, Milk, Orange Juice ]", list.toString());	
		
		list.remove(MILK);
		assertEquals("[ Egg, Egg, Orange Juice ]",	list.toString());
		
		list.remove(OJ);
		assertEquals("[ Egg, Egg ]",	list.toString());
		
		list.remove(OJ);
		assertEquals("[ Egg, Egg ]",	list.toString());
		
		list.remove(EGG);
		assertEquals("[ Egg ]", list.toString());
		
	}
	
	@Test
	public void testRemoveList() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		
		list.add(BACON);
		list.add(WAFFLE);
		list.add(EGG);
		list.add(MILK);
		list.add(EGG);
		list.add(OJ);

		assertEquals("[ Bacon, Egg, Egg, Milk, Orange Juice, Waffle ]",
				list.toString());
		
		SortedListOfImmutables lists = new SortedListOfImmutables();
		
		lists.add(BACON);
		lists.add(MILK);
		
		list.remove(lists);
		
		assertEquals("[ Egg, Egg, Orange Juice, Waffle ]",	list.toString());
		
	}
	
	@Test
	public void testWholesaleCost() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		
		list.add(BACON);
		list.add(WAFFLE);
		list.add(EGG);
		list.add(MILK);
		list.add(EGG);
		list.add(OJ);
		
		assertTrue(list.getWholesaleCost() == 490);

	}
	
	@Test
	public void testRetailValue() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		
		list.add(BACON);
		list.add(WAFFLE);
		list.add(EGG);
		list.add(MILK);
		list.add(EGG);
		list.add(OJ);
				
		assertTrue(list.getRetailValue() == 1091);

	}
	
	@Test
	public void testCheckAvailability() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		
		list.add(BACON);
		list.add(WAFFLE);
		list.add(EGG);
		list.add(EGG);
		list.add(OJ);
		
		assertTrue(list.checkAvailability(BACON) == true);
		assertTrue(list.checkAvailability(MILK) != true);
		assertTrue(list.checkAvailability(OJ) == true);

	}
	
	@Test
	public void testListCheckAvailability() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		
		list.add(BACON);
		list.add(EGG);
		list.add(MILK);
		list.add(EGG);
		list.add(OJ);
		
		SortedListOfImmutables lists = new SortedListOfImmutables();
		
		lists.add(MILK);
		lists.add(EGG);
		lists.add(OJ);
		
		boolean x = list.checkAvailability(lists);
		
		lists.add(EGG);
		lists.add(MILK);
		list.remove(EGG);
		
		boolean y = list.checkAvailability(lists);
		
		lists.remove(MILK);
		lists.add(EGG);
		
		boolean z = list.checkAvailability(lists);
		
		assertTrue(x);
		assertTrue(y == false);
		assertFalse(z);


	}
	
	@Test
	public void testEntree() {
		
		SortedListOfImmutables list = new SortedListOfImmutables();
		SortedListOfImmutables lists = new SortedListOfImmutables();


		list.add(EGG);
		list.add(EGG);
		list.add(WAFFLE);
		list.add(WAFFLE);
		list.add(WAFFLE);
		list.add(BACON);
		list.add(OJ);
		
		lists.add(list);
		list.remove(OJ);
		
		Entree food = new Entree("Big Bubba Breakfast", list);
		Entree foods = new Entree("Big Bubba Breakfast", lists);
		Entree foo = new Entree("Big Bubba Breakfast", list);
				
		assertTrue(food.getName().equals("Big Bubba Breakfast"));
		assertFalse(food.getFoodList().equals(list));
		assertTrue(food.getRetailValue() == 1413);
		assertTrue(food.getWholesaleCost() == 717);
		assertFalse(food.equals(foo));
		assertFalse(food.equals(foods));
		
		
		
	}
	
	
	
}
