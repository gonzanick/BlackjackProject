package com.skilldistillery.blackjack.cards;

import java.util.Scanner;

public class Dealer extends Player{
	Deck deck = new Deck();

	public void getDeck() {
		deck.shuffle();

	}
	
	public void dealToHand() {
		deck.dealCard();
		
	}
	
	public void showTop() {
		
	}
	
	public void dealerBehavior() {
		
	}

}
