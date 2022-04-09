package com.skilldistillery.blackjack.cards;

public class BlackjackHand extends Hand{
	
	public BlackjackHand() {
		
	}
	
	public int getHandValue() {
		int value = 0;
		for (Cards listOfCards : cards) {
			value += listOfCards.getValue();
			
		}
		return value;
	}
	
	public boolean isBlackjack() {
//		if (hand.size() == 2 && handValue == 21) {
//			
//		}
//		else if (Dealer.handValue == 21) {
//		
//		}
		return true;
	}
	
	public boolean isBust() {
//		if (Player.handValue > 21) {
//			
//		}
//		else if (Dealer.handValue > 21) {
//			
//		}
		return true;
	}
	

}
