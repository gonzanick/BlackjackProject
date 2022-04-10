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
		if (Hand() == 2 && getHandValue() == 21) {
			System.out.println("Player has Blackjack!");
			
		}
		else if (Dealer == getHandValue() == 21) {
			System.out.println("Dealer has Blackjack!");
		
		}
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
