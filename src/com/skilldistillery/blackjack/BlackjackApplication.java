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
		greeting();
		dealerDeals(); // Initial deal
		playerTurn();
		dealerTurn();

	}

	public void greeting() {
		System.out.println("Welcome to Blackjack!");
		System.out.println();	

	}

	public void dealerDeals() {
		deck.shuffle();

		cards = deala.dealToHand();
		playaHand.addCard(cards);
		cards = deala.dealToHand();
		playaHand.addCard(cards);
		cards = deala.dealToHand();
		dealaHand.addCard(cards);
		cards = deala.dealToHand();
		dealaHand.addCard(cards);
		System.out.println("Player hand " + playaHand);
		System.out.println("Dealer hand " + dealaHand);

	}

	public void playerTurn() {
		System.out.println("Type HIT for another card or STAY to end your turn: ");

		boolean stay = false;

		while (stay != true) {
			String playerInput = sc.next();
			playerInput = sc.next();
			if (playerInput.equalsIgnoreCase("hit")) {
				playaHand.addCard(cards);
				System.out.println(playaHand);
				if (playaHand.isBlackjack(playaHand)) {
					break;
				}
				else if (playaHand.isBust(playaHand)) {
					System.out.println("BUST!");
					break;
				}

			} else if (playerInput.equalsIgnoreCase("stay")) {

				stay = true;

			}

		}

	}

	public void dealerTurn() {
		deala.dealerBehavior();

	}

}
