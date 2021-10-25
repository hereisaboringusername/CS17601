
import java.util.ArrayList;
public class TestPlayingCardArrayList {
	// 1 - Construct an array of 52 PlayingCard objects called deck.

	public static void main(String[] args)
	{

		ArrayList<PlayingCard> deck = new ArrayList<>();
		
		// 2 - Construct the 52 PlayingCards in a standard deck of cards
		//     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
		//     and add them to the deck. You must use a loop (or
		//     nested loops).


		// populate deck with Card objects
		//int counter = 0;
		for ( int value = 1; value <= 13; value++ ) {
			for  ( int suit = 1; suit <= 4; suit++ ) {
				PlayingCard inputCard = new PlayingCard(value, suit);
				deck.add(inputCard);
				//deck[counter] = inputCard;
				//counter++;
			}
		}


		// 3 - Display the value and suit of every PlayingCard in the deck.
		//     You must use a loop.

		for (PlayingCard fun : deck) {
			System.out.println(fun.toString());
		}



	}



}
