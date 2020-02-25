import java.util.ArrayList;

public class Deck {

	private ArrayList<Cardclass> cards = new ArrayList<>();

	public Deck() {
		for (int suits = 0; suits < 4; suits++) {
			// suits is currently 0 at start of loop
			String suitValue = "Spades";

			// as the loop counter increases, change value of suit
			if (suits == 1) {
				suitValue = "Diamonds";
			} else if (suits == 2) {
				suitValue = "Hearts";
			} else if (suits == 3) {
				suitValue = "Clubs";
			}

//			System.out.println("Current suit value: " + suitValue);

			for (int rank = 2; rank < 15; rank++) {
//				System.out.print(rank + " ");

				// create a new card for your deck here
				Cardclass card = new Cardclass();

				// set the values for your card rank and suit
				card.setRank(rank);
				card.setSuit(suitValue);

				// add the card to the deck
				cards.add(card);
			}
//			System.out.println();
		}
	}

	public ArrayList<Cardclass> getCards() {
		return cards;
	}
}