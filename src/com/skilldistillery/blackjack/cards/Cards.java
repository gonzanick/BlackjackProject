package com.skilldistillery.blackjack.cards;

import java.util.Objects;

public class Cards {
	private Suit suit;
	private Rank rank;

	public Cards(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;

	}

	public int getValue() {
		return rank.getValue();
	}

	@Override
	public String toString() {
		return "Card " + rank + " of " + suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cards other = (Cards) obj;
		return rank == other.rank && suit == other.suit;
	}

}
