package com.skilldistillery.blackjack.cards;

import java.util.List;

public class BlackjackHand extends Hand{
	
	private List<Cards> cards;
	
	public BlackjackHand() {
		
	}
	
	public BlackjackHand(List<Cards> cards) {
		this.cards = cards;
	}
	
	public int getHandValue() {
		int value = 0;
		for (Cards listOfCards : cards) {
			value += listOfCards.getValue();
			
		}
		return value;
	}
	
	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			System.out.println("Player has Blackjack!");
			
		}
		else if (getHandValue() == 21) {
			System.out.println("Dealer has Blackjack!");
		
		}
		return true;
	}
	
	public boolean isBust() {
		if (getHandValue() > 21) {
			System.out.println("BUST");
		}
		
		return true;
	}
	

}
