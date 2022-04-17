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
	Dealer deala = new Dealer(dealaHand);
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
		deck = deala.getDeck(deck);

		cards = deala.dealToHand(deck);
		playaHand.addCard(cards);
		cards = deala.dealToHand(deck);
		playaHand.addCard(cards);
		cards = deala.dealToHand(deck);
		dealaHand.addCard(cards);
		cards = deala.dealToHand(deck);
		dealaHand.addCard(cards);
		System.out.println("Player hand " + playaHand);
		System.out.println("Dealer hand " + dealaHand);

	}

	public void playerTurn() {
		System.out.println("Player type HIT for another card or STAY to end your turn: ");

		boolean stay = false;

		while (stay != true) {
			if (playaHand.isBust(playaHand)) {
				stay = true;
				break;
			}

			else {
				String playerInput = sc.next();
				if (playerInput.equalsIgnoreCase("hit")) {
					System.out.println("Player select HIT to hit or STAY to end your turn: ");
					playaHand.addCard(deala.dealToHand(deck));
					System.out.println(playaHand);
				} else if (playerInput.equalsIgnoreCase("stay")) {

					stay = true;

				}
			}

		}

	}

	public void dealerTurn() {
		System.out.println("Dealer hand: ");
		deala.dealerBehavior(deck);

	}

	public boolean isDraw(BlackjackHand dealerHand, BlackjackHand playerHand) {
		if (dealerHand.getHandValue() == playerHand.getHandValue()) {
			System.out.println("DRAW!");
			return true;
		} else {
			return false;
		}
	}

}
