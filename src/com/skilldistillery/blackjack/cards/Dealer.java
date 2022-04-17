package com.skilldistillery.blackjack.cards;

public class Dealer extends Player {

	public Dealer(BlackjackHand dealerHand) {
		super();
		this.bjh = dealerHand;
	}

	public Deck getDeck(Deck deck) {
		deck.shuffle();
		
		return deck;

	}

	public Cards dealToHand(Deck deck) {
		Cards card = deck.dealCard();
		return card;

	}


//	public void showTop() {
//		
//	}

	public void dealerBehavior(Deck deck) {

		boolean stay = false;

		while (stay != true) {
			if (bjh.getHandValue() < 17) {
				if (deck.checkDeckSize() > 0) {
					this.bjh.addCard(dealToHand(deck));

				} else {
					stay = true;
				}
				System.out.println(bjh);
				if (bjh.isBust(bjh)) {
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
