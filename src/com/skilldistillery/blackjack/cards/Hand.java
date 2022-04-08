package com.skilldistillery.blackjack.cards;

import java.util.List;

public abstract class Hand {
	private List<Cards> cards;
	
	
	public Hand() {
		
	}
	
	public void addCard(Cards card) {
		cards.add(card);
	}
	
	public void clear() {
		
	}
	
	public int getHandValue() {
		
		
		
		
		return 0;
	}

	@Override
	public String toString() {
		return "Hand [numOfCards=" + cards + "]";
	}
	
	

}
