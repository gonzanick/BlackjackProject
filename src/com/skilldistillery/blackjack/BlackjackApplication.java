package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.BlackjackHand;
import com.skilldistillery.blackjack.cards.Dealer;
import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.cards.Player;

public class BlackjackApplication {
	Deck deck = new Deck();
	BlackjackHand playaHand = new BlackjackHand();
	BlackjackHand dealaHand = new BlackjackHand();
	Player playa = new Player();
	Dealer deala = new Dealer(deck, dealaHand);
	

	public static void main(String[] args) {
		BlackjackApplication app = new BlackjackApplication();
		app.run();
	}

	

	public void run() {

	}

	public void greeting() {
		System.out.println("Welcome to Blackjack!");

	}

	public void dealerDeals() {

	}

	public void playerTurn() {

	}

	public void dealerTurn() {

	}

}
