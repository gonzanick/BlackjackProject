package com.skilldistillery.blackjack.cards;

import java.util.List;

public abstract class Hand {
	List<Cards> numOfCards;
	
	
	public Hand() {
		
	}
	
	public void addCard(Cards card) {
		
	}
	
	public void clear() {
		
	}
	
	public int getHandValue() {
		return 0;
	}

	@Override
	public String toString() {
		return "Hand [numOfCards=" + numOfCards + "]";
	}
	
	

}
