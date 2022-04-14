package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public class BlackjackHand {

	private List<Cards> cards;

	
	public BlackjackHand() {
		List<Cards> newCards = new ArrayList<>();
		cards = newCards;
	}

	public int getHandValue(BlackjackHand cardHand) {
		int value = 0;
		for (Cards listOfCards : cards) {
			value += listOfCards.getValue();

		}
		return value;
	}

	public boolean isBlackjack(BlackjackHand cardHand) {
		if (getHandValue(cardHand) == 21) {
			System.out.println("Blackjack!");

		}

		return true;
	}

	public boolean isBust(BlackjackHand cardHand) {
		if (getHandValue(cardHand) > 21) {
			System.out.println("BUST");
		}

		return true;
	}
	
	public void addCard(Cards card) {
		cards.add(card);
		
	}

	@Override
	public String toString() {
		return "BlackjackHand cards =" + cards;
	}
	
	

}
