package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Dealer;
import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.cards.Player;

public class BlackjackApplication {
	public static void main(String[] args) {
		BlackjackApplication app = new BlackjackApplication();
		Player playa = new Player();
		app.run();
	}

	private int playa;

	public void run() {

	}

	public void greeting() {
		System.out.println("Welcome to Blackjack!");

	}

	public void dealerDeals() {
		Deck deck = new Deck();
		for (int dd = 0; dd < 2; dd++) {
			for (int i = 0; i < playa; i++) {
				playa.addCard(Dealer.dealCard());
				Dealer.addCard(deck.dealCard());

			}
		}

	}

	public void playerTurn() {

	}

	public void dealerTurn() {
		Dealer deala = new Dealer();

	}

}
