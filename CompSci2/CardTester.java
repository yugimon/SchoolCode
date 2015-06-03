-

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		
		Card card1 = new Card("Seven", "Clubs", 7);
		System.out.println(card1.matches(new Card("Seven", "Clubs", 7)));
		System.out.println(card1.toString());
		System.out.println();
		
		Card card2 = new Card("King", "Diamonds", 12);
		System.out.println(card2.matches(card1));
		System.out.println(card2.toString());
		System.out.println();
		
		Card card3 = new Card("Logan", "Coding", 1337);
		System.out.println(card3.matches(card3));
		System.out.println(card3.toString());
		System.out.println();
	}
}
