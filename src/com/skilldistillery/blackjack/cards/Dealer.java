package com.skilldistillery.blackjack.cards;

import java.util.Scanner;

public class Dealer {
	
	
	
	public void run() {
		Deck deck = new Deck();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many cards would you like: ");
		
		try {
			int numOCards = sc.nextInt();
			if (numOCards > 52 || numOCards < 0) {
				System.out.println("Enter a number of 52 or LESS.");
			}else {
				for(int i = 0; i < numOCards; i++) {
					System.out.println(deck.dealCard());
				}
			}
			
		} catch(NumberFormatException e) {
			System.out.println("Enter a NUMBER of 52 or less.");
			
		}
		sc.close();
	}
	
	
	
	

}
