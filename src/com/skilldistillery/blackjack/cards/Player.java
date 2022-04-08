package com.skilldistillery.blackjack.cards;

import java.util.List;

public class Player {
	private List<Cards> hand;
	private int numCards;
	
	public Player() {
		
	}
	
	public Player(List<Cards> hand, int numCards) {
		this.hand = hand;
		this.numCards = numCards;
				
		
	}

}
