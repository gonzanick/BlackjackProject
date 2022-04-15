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

	public Cards dealToHand() {
		Cards card = deck.dealCard();
		return card;

	}

//	public void dealerHand() {
//		this.dealerHand = dealerHand;
//	}

//	public void showTop() {
//		
//	}

	public void dealerBehavior() {

		boolean stay = false;

		while (stay != true) {
			if (dealerHand.getHandValue(dealerHand) < 17) {
				if (deck.checkDeckSize() > 0) {
					dealToHand();

				} else {
					stay = true;
				}
				System.out.println(dealerHand);
				if (dealerHand.isBust(dealerHand)) {
					System.out.println("HOUSE BUST");
					break;
				}
			} else {
				stay = true;

			}

		}
	}

	public void getDealerTotalHand() {

	}

}
