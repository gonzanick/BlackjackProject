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
		if (playaHand.isBust()) {
			System.out.println("Player BUST! Dealer Wins!");
			System.out.println("GAMEOVER!");
			return;
		}	
		dealerTurn();
		if (dealaHand.isBust()) {
			System.out.println("Dealer BUST! Player Wins!");
			System.out.println("GAMEOVER!");
			return;
		}	
		if (isDraw(playaHand, dealaHand)) {
			System.out.println("DRAW! Both Dealer and Player have equal value.");
			System.out.println("GAMEOVER!");
			return;
		}
		if (dealaHand.isBlackjack()) {
			System.out.println("House Wins!");
			System.out.println("GAMEOVER!");
			return;
		}
		if (playaHand.isBlackjack()) {
			System.out.println("Player Wins!");
			System.out.println("GAMEOVER!");
			return;
		}
		if (playaHand.getHandValue() > dealaHand.getHandValue()) {
			System.out.println("Player Wins!");
			System.out.println("GAMEOVER!");
		}else {
			System.out.println("House Wins!");
			System.out.println("GAMEOVER!");
		}

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
		System.out.println("Dealer hand " + deala.showTop());

	}

	public void playerTurn() {
		//System.out.println("Player type HIT for another card or STAY to end your turn: ");

		boolean stay = false;

		while (stay != true) {
			if (playaHand.isBust() || playaHand.isBlackjack()) {
				stay = true;
				break;
			}
			else {
				System.out.println("Player select HIT to hit or STAY to end your turn: ");
				String playerInput = sc.next();
				if (playerInput.equalsIgnoreCase("hit")) {
					playaHand.addCard(deala.dealToHand(deck));
					System.out.println("Player hand " + playaHand);
//					if (playaHand.isBlackjack()) {
//						break;
//					}
				} else if (playerInput.equalsIgnoreCase("stay")) {
					System.out.println();

					stay = true;

				}
			}
			sc.close();

		}

	}

	public void dealerTurn() {
		System.out.println("Dealer hand: ");
		deala.dealerBehavior(deck);
		

	}

	public boolean isDraw(BlackjackHand dealerHand, BlackjackHand playerHand) {
		if (dealerHand.getHandValue() == playerHand.getHandValue()) {
			return true;
		} else {
			return false;
		}
	}

}
