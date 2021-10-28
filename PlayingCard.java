package lab5.prob1;

public class PlayingCard
{
	// Instance variables and constants:
	private int _value;   // value ranges from 1-13
	private String _suit; // is one of: "Clubs", "Diamonds", "Hearts", "Spades"
	public static final int CLUBS = 1;
	public static final int DIAMONDS = 2;
	public static final int HEARTS = 3;
	public static final int SPADES = 4;

	// Constructors:
	// 1 - Add a constructor that takes an int value and an int suit
	//     as input parameters to set the PlayingCard _value and _suit.
	public PlayingCard(int value, int suit) {
		setValue(value);
		setSuit(suit);

	}
	//     Use the setValue and setSuit methods in the constructor.
	//     **HINT**: Complete the setValue and setSuit methods below first,
	//               then this constructor.
	//               Use no if statements.
	/**
	 * Constructor
	 * @param value, an int
	 * @param suit, an int
	 */




	// Methods:
	// 2 - Add a method called setValue to set the PlayingCard _value from a value
	//     input parameter.
	public void setValue(int value) {
		//     Add code to ensure that only valid card values will be set (1-13).
		if (value >=1 && value <=13) {
			_value = value;
		}
		else {
			System.out.println("Invalid card value!");
		}

	}

	//     An invalid value should trigger an output statement: "Invalid card value!"
	//     An 'if - else' structure is required.
	/**
	 * Set PlayingCard value
	 * @param value, an int
	 */





	// 3 - Add a method called setSuit to set the PlayingCard _suit from a suit
	//     input parameter. The suit input parameter is an int.

	//     Add code to ensure that only valid suit values (1-4) are used.
	//     An invalid suit should trigger an output statement: "Invalid card suit!"
	//     An 'if - else if - else' structure is required.
	/**
	 * Set PlayingCard suit
	 * @param suit, an int
	 */
	public void setSuit(int suit) {

		//     If suit = CLUBS, set _suit to "Clubs",
		if (suit == CLUBS) {
			_suit = "Clubs";
		}
		//     if suit = DIAMONDS, set _suit to "Diamonds" ... and so on.
		else if (suit == DIAMONDS) {
			_suit = "Diamonds";
		}
		else if(suit == HEARTS) {
			_suit = "Hearts";

		}
		else if (suit == SPADES) {
			_suit = "Spades";
		}
		else {
			System.out.println("Invalid card suit!");
		}

	}


	// 4 - Add a method called toString to return a String containing the PlayingCard's
	//     _value and _suit in the form "_value of _suit", e.g.,
	public String toString() { 
		String answer = "";
		if (_value ==1) {
			answer = "Ace" + " of " + _suit; 
		}
		else if (_value ==11) {
			answer = "Jack" + " of " + _suit; 

		}
		else if (_value ==12) {
			answer = "Queen" + " of " + _suit; 

		}
		else if (_value == 13) {
			answer = "King" + " of " + _suit; 

		}
		else {
			answer = _value + " of " + _suit; 
			
		}
		return answer;
	}






} // end of class PlayingCard



