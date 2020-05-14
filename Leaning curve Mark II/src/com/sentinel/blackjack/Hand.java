package com.sentinel.blackjack;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;
    private boolean bust, doubleDown, split, insurance, surrender;
    private int soft, value;

    public Hand() {
	this.hand = new ArrayList<>();
	this.bust = false;
	this.doubleDown = false;
	this.split = false;
	this.insurance = false;
	this.surrender = false;
	this.soft = 0;
	this.value = 0;
    }

    public void addCard(Card card) {
	// add card to hand
	this.hand.add(card);

	// calculate value
	int aces = 0;
	int acesUsed = 0;
	this.soft = 0;
	this.value = 0;

	// for (Card c : hand) {
	for (int i = 0; i < hand.size(); i++) {
	    Card c = hand.get(i);

	    if (c.getRank() == 14) {
		aces++;
	    }

	    value += c.getValue();
	}

	// use aces
	for (int i = 0; i < aces; i++) {
	    if (value > 21) {
		value -= 10;
		acesUsed++;
	    }
	}

	// calculate soft A7, value 18, soft 7
	if (acesUsed < aces) {
	    soft = value - 11;
	}

	if (value > 21) {
	    bust = true;
	}
    }

    public boolean isPair() {
	return hand.get(0).getValue() == hand.get(1).getValue();
    }

    public boolean isBlackJack() {
	return value == 21 && hand.size() == 2 && !split;
    }

    public int showingValue() {
	return hand.get(1).getValue();
    }

    public int getSoft() {
	return soft;
    }

    public int getValue() {
	return value;
    }

    public boolean isBust() {
	return bust;
    }

    public boolean isSurrender() {
	return surrender;
    }

    public boolean isDoubleDown() {
	return doubleDown;
    }

    public boolean isSplit() {
	return split;
    }

    public boolean isInsurance() {
	return insurance;
    }

    public void setSurrender(boolean surrender) {
	this.surrender = surrender;
    }

    public void setDoubleDown(boolean doubleDown) {
	this.doubleDown = doubleDown;
    }

    public void setSplit(boolean split) {
	this.split = split;
    }

    public void setInsurance(boolean insurance) {
	this.insurance = insurance;
    }

    public String toString() {
	StringBuilder sb = new StringBuilder();

	// for loop through each card
	// append each card to stringbuilder
	// add a space in between each card
	sb.append(hand.get(0));

	return sb.toString();
    }

    public static void main(String[] args) {
	Hand hand = new Hand();
	hand.addCard(new Card(14, 'c'));
	hand.addCard(new Card(13, 'c'));

	System.out.println("Value: " + hand.getValue());
	System.out.println("Blackjack: " + hand.isBlackJack());
	System.out.println("Bust: " + hand.isBust());
	System.out.println(hand); // Ac Kc
    }
}
