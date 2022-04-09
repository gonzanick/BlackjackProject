package com.skilldistillery.blackjack.cards;

import java.util.List;

public abstract class Hand {
	protected List<Cards> cards;
	
	
	public Hand() {
		
	}
	
	public Hand(List<Cards> cards) {
		this.cards = cards;
		
	}
	
	public void addCard(Cards card) {
		cards.add(card);
	}
	
	public void clear() {
		this.cards.remove(0);
		
	}
	
	public int getHandValue(Rank value, Suit name) {
		return getHandValue(value, name);	
		
	}

	@Override
	public String toString() {
		return "Hand [numOfCards=" + cards + "]";
	}
	
	

}
