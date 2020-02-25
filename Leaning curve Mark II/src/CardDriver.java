import java.util.ArrayList;

public class CardDriver {

	public static void main(String[] args) {
		System.out.println("Hello, World!");

		ArrayList<Cardclass> deck = new ArrayList<>();

//
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.println(i + ", " + j + ") " + (i * j));
//			}
//		}

		for (int suits = 0; suits < 4; suits++) {
			// suits is currently 0 at start of loop
			String suitValue = "Spades";
			
			// as the loop counter increases, change value of suit
			if(suits == 1) {
				suitValue = "Diamonds";
			} else if(suits == 2) {
				suitValue = "Hearts";
			} else if(suits == 3) {
				suitValue = "Clubs";
			}
			
			System.out.println("Current suit value: " + suitValue);
			
			for (int rank = 2; rank < 15; rank++) {
				System.out.print( rank + " " );
				
				// create a new card for your deck here
				Cardclass card = new Cardclass();
				
				// set the values for your card rank and suit
				card.setRank(rank);
				card.setSuit(suitValue);
				
				// add the card to the deck
				deck.add(card);
			}
			System.out.println();
		}
		
		for(Cardclass card : deck) {
			System.out.println(card);
		}
		
		Deck deck2 = new Deck();
		ArrayList<Cardclass> deck2cards = deck2.getCards();
		for(Cardclass card : deck2cards) {
			System.out.println(card);
		}

		
		ArrayList<Cardclass> shoecards = new ArrayList<>();
		for(int s = 0; s < 8; s++) {
			Deck shoeDeck = new Deck();
			shoecards.addAll(shoeDeck.getCards());					
		}
		
		System.out.println( shoecards.size() );
	}

}
