package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Cards> cards;

	public Deck() {
		cards = createDeck();
	}

	private List<Cards> createDeck() {
		List<Cards> deck = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Cards(rank, suit));

			}

		}
		return deck;
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Cards dealCard() {
		return cards.remove(1);
	}

}
