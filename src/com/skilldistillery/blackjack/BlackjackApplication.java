package com.skilldistillery.blackjack;

import java.util.Scanner;

import com.skilldistillery.blackjack.cards.BlackjackHand;
import com.skilldistillery.blackjack.cards.Cards;
import com.skilldistillery.blackjack.cards.Dealer;
import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.cards.Player;

public class BlackjackApplication {
	Deck deck = new Deck();
	Cards cards;
	BlackjackHand playaHand = new BlackjackHand();
	BlackjackHand dealaHand = new BlackjackHand();
	Player playa = new Player(playaHand);
	Dealer deala = new Dealer(deck, dealaHand);
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApplication app = new BlackjackApplication();
		app.run();
	}

	public void run() {
		dealerDeals();

	}

	public void greeting() {
		System.out.println("Welcome to Blackjack!");

	}

	public void dealerDeals() {
		deck.shuffle();

		//int numOCards = sc.nextInt();
		//if (numOCards > 52 || numOCards < 0) {
			System.out.println("Games Starts");
			cards = deala.dealToHand();
			playaHand.addCard(cards);
			cards = deala.dealToHand();
			playaHand.addCard(cards);
			cards = deala.dealToHand();
			dealaHand.addCard(cards);
			cards = deala.dealToHand();
			dealaHand.addCard(cards);
			System.out.println(cards);
			System.out.println(playaHand);
			System.out.println(dealaHand);
		//} //else {
			//for (int i = 0; i < numOCards; i++) {
				System.out.println(deck.dealCard());
			}
		//}

	//}

	public void playerTurn() {

	}

	public void dealerTurn() {

	}

}
