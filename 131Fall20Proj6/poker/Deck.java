package poker;

/* Explain what this class can do. */

public class Deck {

	private Card[] cards; // stores all the cards left in the deck

	/* This constructor creates a deck starting from the Ace of spaces going
	 * all the way to the King of diamonds.  */
	
	public Deck() {
		
		cards = new Card[52]; // creates a new array of 52 cards
		
		int x = 0; // counts the total number of cards
		
		/* These two loops create a new card by assigning the suite and the 
		 * card number to each location in the array. */
		
		for (int suit = 0; suit < 4; suit++) {
			
			for(int num = 1; num < 14; num++) {
								
				cards[x] = new Card(num, suit);
				
				x++; // moves the location to the next "spot"
				
			}
			
		}
		
	}
	
	/* This copy constructor creates a shallow copy of the original deck. */

	public Deck(Deck other) {

		this.cards = other.cards; // aliases a copy of the deck
		
	}

	// This method returns what position a card is at in the deck
	
	public Card getCardAt(int position) {
		
		return cards[position]; // returning the card from 0 based indexing
		
	}

	// This method returns the total number of cards in the deck
	
	public int getNumCards() {

		return cards.length; // returns the length of the cards array
		
	}
	
	/* This method re-arranges the card in the deck. */

	public void shuffle() {
		
		Card [] a, b, c; // creates two arrays that divide the cards among them
		
		c = new Card[cards.length]; // sets the size of the array
		b = new Card[cards.length / 2];// sets the size of the array
		int x = 0; // keeps track of the number of iterations through an array
				
		/* This if statement creates the size of two arrays, depending on the 
		 * size of the cards */
		
		if (cards.length % 2 != 0 ) { // sets the size if number of cards is odd
		
			a = new Card[(cards.length / 2) + 1];
			a[a.length - 1] = cards[a.length - 1];
			
		} else { // sets the size if number of cards is even
			
			a = new Card[cards.length / 2];
			
		}
		
		/* This loop gives half of the cards to one deck or one array and 
		 * the rest to the other deck or array of cards */
		
		for (int num = 0; num < cards.length / 2; num++) {
			
			a[num] = cards[num];
			
			/* This loop ensures that if the deck is an odd number of cards, it 
			 * makes sure that the last card of the first deck is not the same
			 * as the first card of this deck. */
			
			if (cards.length % 2 != 0 ) { 
				
				b[num] = cards[num + (cards.length / 2) + 1];
			
			} else {
				
				b[num] = cards[num + (cards.length / 2)];
				
			}
				
		}
		
		
		/* This loop shuffles the cards by giving the first card of the each 
		 * deck right after the other, or shuffles the cards. */
		
		for (int num = 0; num < c.length; num ++) {
			
			c[num] = a[x];
			
			/* This loop checks if the number of cards is odd, and if it has 
			 * moved all the cards to the main deck, and if that is true, it 
			 * breaks and exits the loop, if not it continues by getting the 
			 * next card from the second array, or b array. */
			
			if(num + 1 == c.length && c.length % 2 != 0) {
				
				break;
				
			} else {
				
				c[num + 1] = b[x];
				
				x++;
				num++;
				
			}
			
		}
		
		cards = c; // sets the array c equal to the array cards
		
	}

	/* This method moves cards to the left multiple times depending on the size 
	 * of the parameter. */
	
	public void cut(int position) {
		
		/* Creates an array that contains the cards that will be moved to the
		*  back of the deck */
		
		Card [] a = new Card[position]; //array of cards that will go to the end
		Card [] b = new Card[cards.length]; // array with the final cards 
		
		/* This loop will create an array of cards that will be moved to the 
		 * back of the deck. */
		
		for (int num = 0; num < position; num++) {
			
			a[num] = cards[num];
			
		}
		
		/* This loop will contain the cards that will be moved up and not moved 
		 * to the back of the deck. */
		
		for (int num = position; num < cards.length; num++) {
			
			b[num - position] = cards[num];
			
		}
		
		/* This loop then adds the cards that were moved to the back of the
		 * deck along with the rest of the cards. */
		
		for (int num = 0; num < position; num++) {
			
			b[b.length - position + num] = a[num];
			
		}
		
		cards = b; // aliases cards with the array that contains the cut
 		
	}

	/* This method returns the cards that will be dealt out in the turn 
	 * during a game of poker. */
	
	public Card[] deal(int numCards) {
		
		Card [] a = new Card[numCards]; //creates an array with the dealt cards
		
		// creates an array that will contain the cards that are not dealt out
		Card [] b = new Card[cards.length - numCards];
		
		/* This loop copies the cards that should be dealt and puts them in 
		 * the deck/array that will be returned */
		
		for(int num = 0; num < numCards; num++) {
			
			a[num] = cards[num];
			
		}
		
		/* This loop copies the cards that should not be dealt and puts them in 
		 * the deck/array that will be aliased with the cards array. */
		
		for (int num = 0; num < b.length; num++) {
			
			b[num] = cards[num + numCards];
			
		}
		
		cards = b; // aliases the cards that should not be dealt with array b
		
		return a; // returns the array of cards that should be dealt
		
	}
		
}
