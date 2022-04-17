package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public class BlackjackHand extends Hand{


	public BlackjackHand() {
		List<Cards> newCards = new ArrayList<>();
		this.cards = newCards;
	}

	public int getHandValue() {
		int value = 0;
		for (Cards listOfCards : cards) {
			value += listOfCards.getValue();

		}
		System.out.println(value);
		return value;
	}

	public boolean isBlackjack(BlackjackHand cardHand) {
		if (getHandValue() == 21) {
			System.out.println("Blackjack!");

		}

		return true;
	}

	public boolean isBust(BlackjackHand cardHand) {
		if (getHandValue() > 21) {
			System.out.println("BUST");
			return true;
		} else {
			return false;

		}

	}


	@Override
	public String toString() {
		return "" + cards;
	}
	

}
