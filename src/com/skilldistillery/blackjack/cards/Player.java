package com.skilldistillery.blackjack.cards;

import java.util.List;

public class Player {
	BlackjackHand bjh = new BlackjackHand();
	private List<Cards> hand;
	private int numCards;

	public Player() {

	}

	public Player(List<Cards> hand, int numCards) {
		this.hand = (List<Cards>) bjh;
		this.numCards = numCards;

	}

	public void display(List<Cards> hand, int numCards) {

	}

}
