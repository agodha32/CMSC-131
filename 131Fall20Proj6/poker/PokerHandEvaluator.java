package poker;

/* This class evaluates the hand a person has, and returns each method with a 
 * true or false depending on the cards */

public class PokerHandEvaluator {

	// This method sorts the cards according to the value of each card

	public static void sort(Card[] cards) {
	
		// This loop goes through all of the cards, and then arranges them

		for (int num = 0; num < cards.length; num++) {

			for (int x = num + 1; x < cards.length; x++) {

				Card temp; // creates a variable, that will store temp cards

				// This loop checks if the value of the next card is higher

				if (cards[num].getValue() > cards[x].getValue()) {

					temp = cards[num]; // the card with higher value to a temp

					cards[num] = cards[x]; // puts the smaller number ahead

					cards[x] = temp; // puts the bigger number behind the small

				}

			}

		}

	}
	
	/* This method checks if the set of cards has a pair */
	
	public static boolean hasPair(Card[] cards) {
		
		boolean tOrF = false; // return value set to false if no pairs
		
		PokerHandEvaluator.sort(cards); // sorts the cards
		
		// This loop checks for pairs, with the card right before it
		
		for(int num = 1; num < cards.length; num++) {
			
			if(cards[num].getValue() == cards[num - 1].getValue()) {
				
				tOrF = true; // changes false to true if pair is found
				
			}
			
		}

		return tOrF; // returns true or false
		
	}

	/* This method checks if the set of cards has two pairs */

	public static boolean hasTwoPair(Card[] cards) {
		
		PokerHandEvaluator.sort(cards); // sorts the cards
		
		// checks if value of the cards is same for 4 cards, with 2 different
		
		 return (cards[0].getValue() == cards[1].getValue() &&
				 cards[2].getValue() == cards[3].getValue() && 
				 cards[0].getValue() != cards[2].getValue()) ||
				 
				 (cards[0].getValue() == cards[1].getValue() &&
				 cards[3].getValue() == cards[4].getValue() && 
				 cards[0].getValue() != cards[3].getValue()) ||
				 
		         (cards[1].getValue() == cards[2].getValue() &&
		          cards[3].getValue() == cards[4].getValue()&&
		          cards[1].getValue() != cards[3].getValue());
		
	}

	/* This method checks if the set of cards has three of a kind */

	public static boolean hasThreeOfAKind(Card[] cards) {
		
		PokerHandEvaluator.sort(cards); // sorts the cards
		
		// checks if three cards have the same value
		
		return (cards[0].getValue() == cards[1].getValue() && 
				cards[0].getValue() == cards[2].getValue()) || 
				
				(cards[1].getValue() == cards[2].getValue() &&
				 cards[1].getValue() == cards[3].getValue()) || 
				
				(cards[2].getValue() == cards[3].getValue() &&
				 cards[2].getValue() == cards[4].getValue());
		
	}

	/* This method checks if the set of cards has a straight set */

	public static boolean hasStraight(Card[] cards) {
		
		PokerHandEvaluator.sort(cards); // sorts the cards
		
		int straightCards = 0; // counts if the values are in order
		
		for(int num = 1; num < cards.length; num++) {
			
			if (cards[num].getValue() - 1 == cards[num - 1].getValue()) {
				
				straightCards++; // adds one if the values are the same
				
			}
			
		}
		
		// this loop checks for the ace high
		
		if(cards[0].getValue() == 1 && cards[1].getValue() == 10 &&
		   cards[2].getValue() == 11 && cards[3].getValue() == 12 &&
		   cards[4].getValue() == 13)  {
			
			return true; //
			
		}
		
		return straightCards >= 4;
		
	}

	/* This method checks if the set of cards has a flush */

	public static boolean hasFlush(Card[] cards) {

		// This will return true if all the cards have the same suit
		
		return (cards[0].getSuit() == cards[1].getSuit() &&
				cards[0].getSuit() == cards[2].getSuit() &&
				cards[0].getSuit() == cards[3].getSuit() &&
				cards[0].getSuit() == cards[4].getSuit());

	}

	/* This method checks if the set of cards has a full house */

	public static boolean hasFullHouse(Card[] cards) {
				
		PokerHandEvaluator.sort(cards); // sorts the cards
		
		// returns if there are 3 same cards and 2 same but different cards
		
		 return (cards[0].getValue() == cards[1].getValue() && 
				 cards[2].getValue() == cards[3].getValue() &&
				 cards[3].getValue() == cards[4].getValue()) ||
				 
		        (cards[0].getValue() == cards[1].getValue() &&
		         cards[1].getValue() == cards[2].getValue() && 
		         cards[3].getValue() == cards[4].getValue());

	}

	/* This method checks if the set of cards has four of a kind */

	public static boolean hasFourOfAKind(Card[] cards) {

		PokerHandEvaluator.sort(cards); // sorts the cards
		
		// returns if there are 4 of a number
		
		return (cards[0].getValue() == cards[1].getValue() && 
				cards[0].getValue() == cards[2].getValue() &&
				cards[0].getValue() == cards[3].getValue()) ||
				
				(cards[1].getValue() == cards[2].getValue() && 
				cards[1].getValue() == cards[3].getValue() &&
				cards[1].getValue() == cards[4].getValue());

	}

	/* This method checks if the set of cards has a straight flush */

	public static boolean hasStraightFlush(Card[] cards) {

		// returns if the cards are a flush and a straight
		
		return PokerHandEvaluator.hasFlush(cards) && 
				PokerHandEvaluator.hasStraight(cards);

	}

}
