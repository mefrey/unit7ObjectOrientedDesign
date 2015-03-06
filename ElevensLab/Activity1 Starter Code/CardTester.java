/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card = new Card("jack","hearts",11);
		System.out.println(card.getSuit());
		System.out.println(card.getRank());
		System.out.println(card.getPointValue());
		System.out.println(card.toString());
	}
}
