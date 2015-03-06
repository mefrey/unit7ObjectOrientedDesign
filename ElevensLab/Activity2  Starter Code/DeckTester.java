/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    String[] ranks = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
	    String[] suits = {"hearts","clubs","diamonds","spades"};
	    int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck deck = new Deck( ranks, suits, pointValues );
		System.out.println(deck.toString());
		System.out.println(deck.size());
	}
}
