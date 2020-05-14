package com.sentinel.blackjack;

public class Card {
    // static variable
    private static final char TEN = 'T';
    private static final char JACK = 'J';
    private static final char QUEEN = 'Q';
    private static final char KING = 'K';
    private static final char ACE = 'A';

    // member variable, object definition
    private int rank;
    private char suit;
    private int value;

    // this is the overloaded constructor which takes two parameters
    // and sets the member variables for you when the class is created
    public Card(int rankToSet, char suitToSet) {
	this.rank = rankToSet;
	this.suit = suitToSet;

	if (rank >= 2 && rank <= 9) {
	    this.value = rank;
	} else if (rank >= 10 && rank <= 13) {
	    this.value = 10;
	} else if (rank == 14) {
	    this.value = 11;
	}
    }

    public int getRank() {
	return rank;
    }

    public int getValue() {
	return value;
    }

    public char getSuit() {
	return suit;
    }

    public String toString() {
	StringBuilder sb = new StringBuilder();

	if (rank == 10) {
	    sb.append(TEN);
	} else if (rank == 11) {
	    sb.append(JACK);
	} else if (rank == 12) {
	    sb.append(QUEEN);
	} else if (rank == 13) {
	    sb.append(KING);
	} else if (rank == 14) {
	    sb.append(ACE);
	} else {
	    sb.append(rank);
	}

	sb.append(suit);
	return sb.toString();
    }
}
