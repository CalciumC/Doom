package com.doom.player;

import java.util.ArrayList;

import com.doom.cards.Card;
import com.doom.cards.RoleCard;

public class Player {
	
	private ArrayList<Card> hand;
	private ArrayList<Card> board;
	private RoleCard role;
	private Integer seat;
	private boolean alive;
	private String team;
	
	public Player() {
		this.hand = new ArrayList<Card>();
		this.board = new ArrayList<Card>();
		this.alive = true;
		this.team = "";
	}
	
	
	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public boolean isAlive() {
		return alive;
	}


	public void setAlive(boolean alive) {
		this.alive = alive;
	}


	public ArrayList<Card> getHand() {
		return hand;
	}



	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}



	public ArrayList<Card> getBoard() {
		return board;
	}

	public void setBoard(ArrayList<Card> board) {
		this.board = board;
	}



	public RoleCard getRole() {
		return role;
	}



	public void setRole(RoleCard role) {
		this.role = role;
	}



	public Integer getSeat() {
		return seat;
	}



	public void setSeat(Integer seat) {
		this.seat = seat;
	}



	public void addCardToHand(Card card){
		hand.add(card);
	}
	
	public void playCard(Card card){
		hand.remove(card);
	}
	
	public void placeOnBoard(Card card){
		playCard(card);
		board.add(card);
	}
	
	public String getStats(){
		return "";
		
	}
	
}
