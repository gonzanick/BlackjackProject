package com.skilldistillery.blackjack.cards;

import java.util.List;

public abstract class Hand {
	protected List<Cards> cards;

	public Hand() {

	}

	public Hand(List<Cards> cards) {
		this.cards = cards;

	}

	public List<Cards> getCards() {
		return cards;
	}

	public void setCards(List<Cards> cards) {
		this.cards = cards;
	}

	public Cards addCard(Cards card) {
		this.cards.add(card);
		return card;
	}

	public void clear() {
		this.cards.remove(0);

	}

	public int getHandValue(Cards card) {
		return getHandValue(card);

	}

	@Override
	public String toString() {
		return "Hand numOfCards =" + cards;
	}

}
