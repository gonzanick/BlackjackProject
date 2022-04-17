package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public class BlackjackHand {
	Deck deck = new Deck();
	Player player = new Player();
	Dealer dealer = new Dealer(deck, BlackjackHand);

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
		System.out.println(value);
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
			return true;
		}else {
			return false;
			
		}

	}
	
	public boolean isDraw(BlackjackHand cardHand) {
		if (getHandValue(cardHand) == getHandValue(cardHand)) {
			System.out.println("DRAW!");
			return true;
		}else {
			return false;
		}
	}
	
	public void addCard(Cards card) {
		cards.add(card);
		
	}

	@Override
	public String toString() {
		return"" + cards;
	}
	
	

}
