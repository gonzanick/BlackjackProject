package com.skilldistillery.blackjack.cards;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private String name;

	Suit(String suit) {
		name = suit;
	}

	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

}
