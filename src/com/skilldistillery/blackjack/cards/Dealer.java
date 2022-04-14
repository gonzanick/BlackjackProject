package com.skilldistillery.blackjack.cards;


public class Dealer extends Player{
	Deck deck = new Deck();
	Hand dealerHand = new BlackjackHand();

	public void getDeck() {
		deck.shuffle();

	}
	
	public void dealToHand() {
		deck.dealCard();
		
	}
	
	public void dealerHand() {
		this.dealerHand = dealerHand;
	}
	
	public void showTop() {
		
	}
	
	public void dealerBehavior() {
		if (Hand < 17) {
			
		}
		
	}
	
	public void getDealerTotalHand() {
		
	}

}
