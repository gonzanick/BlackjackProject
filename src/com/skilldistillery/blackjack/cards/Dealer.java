package com.skilldistillery.blackjack.cards;

public class Dealer extends Player {
	Deck deck = new Deck();
	BlackjackHand dealerHand = new BlackjackHand();

	public Dealer(Deck deck, BlackjackHand dealerHand) {
		super();
		this.deck = deck;
		this.dealerHand = dealerHand;
	}

	public void getDeck() {
		deck.shuffle();

	}

	public void dealToHand() {
		deck.dealCard();

	}

//	public void dealerHand() {
//		this.dealerHand = dealerHand;
//	}

//	public void showTop() {
//		
//	}

	public boolean dealerBehavior() {
		boolean stay = false;

		if (dealerHand.getHandValue(dealerHand) < 17) {
			dealToHand();
		} else {
			stay = true;
			return stay;
		}
		return stay;

	}

	public void getDealerTotalHand() {

	}

}
