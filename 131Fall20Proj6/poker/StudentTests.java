package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTests {

	@Test
	public void testBasicConstructorsAndGetters() {
		
		Deck x = new Deck();
			
		assertTrue(x.getNumCards() == 52);
		
		assertTrue(x.getCardAt(0).toString().equals("A of s"));
		assertTrue(x.getCardAt(51).toString().equals("K of d"));
		assertTrue(x.getCardAt(15).toString().equals("3 of h"));
		assertTrue(x.getCardAt(30).toString().equals("5 of c"));
		
	}
	
	@Test
	public void testcopyConstructor() {
		
		Deck x = new Deck();
		Deck y = new Deck();
		
		assertTrue(x != y);
		assertTrue(x.getCardAt(0).toString().equals(
				y.getCardAt(0).toString()));
		assertTrue(x.getCardAt(16).toString().equals(
				y.getCardAt(16).toString()));
		assertTrue(x.getCardAt(32).toString().equals(
				y.getCardAt(32).toString()));
		assertTrue(x.getCardAt(48).toString().equals(
				y.getCardAt(48).toString()));
		
	}
	
	@Test
	public void testShuffle() {
		
		Deck x = new Deck();
		Deck y = new Deck();
		
		x.shuffle();

		assertTrue(x.getCardAt(0).toString().equals("A of s"));
		assertTrue(x.getCardAt(20).toString().equals("J of s"));
		assertTrue(x.getCardAt(26).toString().equals("A of h"));
		assertTrue(x.getCardAt(51).toString().equals("K of d"));
		
		y.deal(17);
		y.shuffle();
		
		assertTrue(y.getCardAt(0).toString().equals("5 of h"));
		assertTrue(y.getCardAt(19).toString().equals("6 of d"));
		assertTrue(y.getCardAt(26).toString().equals("5 of c"));
		assertTrue(y.getCardAt(34).toString().equals("9 of c"));
		
	}
	
	@Test
	public void testCut() {
		
		Deck x = new Deck();
		
		x.cut(5);

		assertTrue(x.getCardAt(0).toString().equals("6 of s"));
		assertTrue(x.getCardAt(20).toString().equals("K of h"));
		assertTrue(x.getCardAt(26).toString().equals("6 of c"));
		assertTrue(x.getCardAt(43).toString().equals("10 of d"));
		
	}
	
	@Test
	public void testdeal() {
		
		Deck x = new Deck();
		
		x.deal(4);
		
		assertFalse(x.getCardAt(0).toString().equals("A of s"));
		assertTrue(x.getCardAt(0).toString().equals("5 of s"));
		assertTrue(x.getCardAt(47).toString().equals("K of d"));
		assertTrue(x.getCardAt(9).toString().equals("A of h"));
		assertTrue(x.getCardAt(26).toString().equals("5 of c"));

		
	}
	
	@Test
	public void testsort() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(1,1);
		x[1] = new Card(1,2);
		x[2] = new Card(6,0);
		x[3] = new Card(13,3);
		x[4] = new Card(2,1);
		
		PokerHandEvaluator.sort(x);
		
		assertFalse(x[2].toString().equals("6 of s"));
		assertTrue(x[0].toString().equals("A of h"));
		assertTrue(x[3].toString().equals("6 of s"));
		assertTrue(x[4].toString().equals("K of d"));
		
	}
	
	@Test
	public void testhasPair() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(1,1);
		x[1] = new Card(1,2);
		x[2] = new Card(6,0);
		x[3] = new Card(13,3);
		x[4] = new Card(2,1);
		
		assertTrue(PokerHandEvaluator.hasPair(x) == true);
		
		Card [] y = new Card[5];
		
		y[0] = new Card(1,1);
		y[1] = new Card(5,2);
		y[2] = new Card(6,0);
		y[3] = new Card(13,3);
		y[4] = new Card(2,1);

		assertFalse(PokerHandEvaluator.hasPair(y) == true);
		
	}
	
	@Test
	public void testhasTwoPair() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(1,1);
		x[1] = new Card(1,2);
		x[2] = new Card(6,0);
		x[3] = new Card(2,3);
		x[4] = new Card(2,1);
				
		assertTrue(PokerHandEvaluator.hasTwoPair(x) == true);
	
		Card [] y = new Card[5];
		
		y[0] = new Card(1,1);
		y[1] = new Card(1,2);
		y[2] = new Card(6,0);
		y[3] = new Card(1,3);
		y[4] = new Card(2,1);

		assertTrue(PokerHandEvaluator.hasTwoPair(y) == false);
		
	}
	
	@Test
	public void testhasThreeOfAKind() {
		
		Card [] x = new Card[5];
				
		x[0] = new Card(1,1);
		x[1] = new Card(2,3);
		x[2] = new Card(6,0);
		x[3] = new Card(2,3);
		x[4] = new Card(2,1);
				
		assertTrue(PokerHandEvaluator.hasThreeOfAKind(x) == true);
		
		Card [] y = new Card[5];
		
		y[0] = new Card(1,1);
		y[1] = new Card(1,2);
		y[2] = new Card(6,0);
		y[3] = new Card(13,3);
		y[4] = new Card(2,1);

		assertFalse(PokerHandEvaluator.hasThreeOfAKind(y) == true);
		
	}

	@Test
	public void testHasFlush() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(1,1);
		x[1] = new Card(2,1);
		x[2] = new Card(3,1);
		x[3] = new Card(8,1);
		x[4] = new Card(12,1);
		
		assertTrue(PokerHandEvaluator.hasFlush(x) == true);
		
		Card [] y = new Card[5];
		
		y[0] = new Card(1,0);
		y[1] = new Card(2,1);
		y[2] = new Card(3,0);
		y[3] = new Card(8,1);
		y[4] = new Card(12,1);
		
		assertTrue(PokerHandEvaluator.hasFlush(y) == false);
		
		
	}
	
	@Test
	public void testHasStraight() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(11,0);
		x[1] = new Card(12,1);
		x[2] = new Card(13,2);
		x[3] = new Card(1,3);
		x[4] = new Card(10,1);
		
		assertTrue(PokerHandEvaluator.hasStraight(x) == true);
		
		Card [] y = new Card[5];
		
		y[0] = new Card(13,0);
		y[1] = new Card(11,1);
		y[2] = new Card(10,0);
		y[3] = new Card(12,1);
		y[4] = new Card(1,1);
		
		assertTrue(PokerHandEvaluator.hasStraight(y) == true);
		
		Card [] z = new Card[5];
		
		z[0] = new Card(11,0);
		z[1] = new Card(12,1);
		z[2] = new Card(13,0);
		z[3] = new Card(1,1);
		z[4] = new Card(2,1);
		
		assertTrue(PokerHandEvaluator.hasStraight(z) == false);
		
		
	}	
	
	@Test
	public void testHasStraightFlush() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(1,3);
		x[1] = new Card(2,3);
		x[2] = new Card(3,3);
		x[3] = new Card(4,3);
		x[4] = new Card(5,3);
		
		assertTrue(PokerHandEvaluator.hasStraightFlush(x) == true);
		
		Card [] y = new Card[5];
		
		y[0] = new Card(13,1);
		y[1] = new Card(11,1);
		y[2] = new Card(10,1);
		y[3] = new Card(12,1);
		y[4] = new Card(1,1);
		
		assertTrue(PokerHandEvaluator.hasStraightFlush(y) == true);
		
		Card [] z = new Card[5];
		
		z[0] = new Card(2,0);
		z[1] = new Card(12,0);
		z[2] = new Card(13,0);
		z[3] = new Card(1,0);
		z[4] = new Card(3,0);
		
		assertTrue(PokerHandEvaluator.hasStraightFlush(z) == false);
		
		
	}
	
	@Test
	public void testFullHouse() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(1,2);
		x[1] = new Card(1,3);
		x[2] = new Card(3,0);
		x[3] = new Card(3,2);
		x[4] = new Card(3,1);
				
		assertTrue(PokerHandEvaluator.hasFullHouse(x) == true);
		
		Card [] y = new Card[5];
		
		y[0] = new Card(13,1);
		y[1] = new Card(11,1);
		y[2] = new Card(10,1);
		y[3] = new Card(12,1);
		y[4] = new Card(1,1);
		
		assertTrue(PokerHandEvaluator.hasFullHouse(y) == false);

	}	
	
	@Test
	public void testRand() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(1,3);
		x[1] = new Card(1,0);
		x[2] = new Card(1,1);
		x[3] = new Card(11,0);
		x[4] = new Card(11,3);
		
		assertTrue(PokerHandEvaluator.hasPair(x) == true);
		assertTrue(PokerHandEvaluator.hasTwoPair(x) == true);
		assertTrue(PokerHandEvaluator.hasThreeOfAKind(x) == true);
		assertTrue(PokerHandEvaluator.hasStraight(x) == false);
		assertTrue(PokerHandEvaluator.hasFlush(x) == false);
		assertTrue(PokerHandEvaluator.hasFullHouse(x) == true);
		assertTrue(PokerHandEvaluator.hasFourOfAKind(x) == false);
		assertTrue(PokerHandEvaluator.hasStraightFlush(x) == false);
		
	}
	
	@Test
	public void testRandTwo() {
		
		Card [] x = new Card[5];
		
		x[0] = new Card(2,3);
		x[1] = new Card(2,0);
		x[2] = new Card(2,1);
		x[3] = new Card(2,2);
		x[4] = new Card(9,0);
		
		assertTrue(PokerHandEvaluator.hasPair(x) == true);
		assertTrue(PokerHandEvaluator.hasTwoPair(x) == false);
		assertTrue(PokerHandEvaluator.hasThreeOfAKind(x) == true);
		assertTrue(PokerHandEvaluator.hasStraight(x) == false);
		assertTrue(PokerHandEvaluator.hasFlush(x) == false);
		assertTrue(PokerHandEvaluator.hasFullHouse(x) == false);
		assertTrue(PokerHandEvaluator.hasFourOfAKind(x) == true);
		assertTrue(PokerHandEvaluator.hasStraightFlush(x) == false);
		
	}
		
}