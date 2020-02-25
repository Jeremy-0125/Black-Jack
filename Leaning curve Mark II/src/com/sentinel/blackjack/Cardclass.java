package com.sentinel.blackjack;

public class Cardclass {

	// member variable, object definition
	private int rank;
	private String suit;

	///////////////////////////////////////////////////////////////////
	public Cardclass () {
		// this is the default constructor, it will do nothing
		// unless you tell it to
	}
	
	
	// this is the overloaded constructor which takes two parameters
	// and sets the member variables for you when the class is created
	public Cardclass(int rankToSet, String suitToSet) {
		this.rank = rankToSet;
		this.suit = suitToSet;
	}
	
	
	public int getRank() {
		return rank;
	}
	
	// functional definition
	public void setRank(int rankToSet) {
		this.rank = rankToSet;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suitToSet) {
		this.suit = suitToSet;
	}
	
	public String toString() {
		return "Suit: " + this.suit + "  Rank: " + this.rank; 
	}
}
