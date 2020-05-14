package com.sentinel.blackjack;

import java.util.ArrayList;

public class Shoe {
    private int numDecks;
    private ArrayList<Card> shoeCards;

    public Shoe(int numDecks) {
	this.numDecks = numDecks;
	this.shoeCards = new ArrayList<>();

	for (int i = 0; i < numDecks; i++) {
	    for (int j = 2; j <= 14; j++) {
		Card club = new Card(j, 'c');
		Card spade = new Card(j, 's');
		Card diamond = new Card(j, 'd');
		Card heart = new Card(j, 'h');
		this.shoeCards.add(club);
		this.shoeCards.add(spade);
		this.shoeCards.add(diamond);
		this.shoeCards.add(heart);
	    }
	}
    }

    public void shuffle() {
	int numCards = this.numCards();

	for (int i = 0; i < (numCards * 2); i++) {
	    Card card = this.getNextCard();
	    int randomPosition = (int) (Math.random() * (numCards - 1));
	    shoeCards.add(randomPosition, card);
	}
    }

    public Card getNextCard() {
	Card card = shoeCards.remove(0);
	return card;
    }

    public int getNumDecks() {
	return numDecks;
    }

    // this method is for testing only
    public int numCards() {
	return shoeCards.size();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
	Shoe shoe = new Shoe(8);
	shoe.shuffle();

	int numCards = shoe.numCards();
	for (int i = 0; i < numCards; i++) {
	    Card card = shoe.getNextCard();
	    System.out.println(i + ") " + card);
	}
    }

/////////////////////////////////////////////////////////////////////////////////////////////////
    // This will work, but try to code it yourself so you understand it.
    public void shuffleHelp() {
	int numCards = this.numCards();
	for (int i = 0; i < (numCards * 2); i++) {
	    Card card = this.getNextCard();

	    // pick a random position to put the card back in the shoe
	    // you removed the top card from the shoe, so your range must be decreased by 1
	    int randomPosition = (int) (Math.random() * (numCards - 1));

	    // insert the card back into the shoe at the random position
	    shoeCards.add(randomPosition, card);
	}
    }
}
