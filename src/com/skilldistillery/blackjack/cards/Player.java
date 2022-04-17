package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public class Player {
	BlackjackHand bjh = new BlackjackHand();
	private int numCards;
	

	public Player() {
		List<Cards> hand = new ArrayList<>();

	}
	
	public Player(BlackjackHand player) {
		this.bjh = player;
	}

	public void display(List<Cards> hand, int numCards) {

	}

	public BlackjackHand getBjh() {
		return bjh;
	}

	public void setBjh(BlackjackHand bjh) {
		this.bjh = bjh;
	}

	public List<Cards> getHand() {
		return this.bjh.getCards();
	}

	public void setHand(List<Cards> hand) {
		this.bjh.setCards(hand);
	}

}
