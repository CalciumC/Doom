package com.doom.main;

import java.util.ArrayList;

import com.doom.cards.EventCard;
import com.doom.cards.ItemCard;
import com.doom.cards.RoleCard;
import com.doom.player.Player;
import com.doom.utils.Flags;

public class Game {

	private ArrayList<Player> players;
	private ArrayList<RoleCard> roleDeck;
	private ArrayList<ItemCard> itemDeck;
	private ArrayList<EventCard> eventDeck;
	private Integer[] order;
	private Integer roundCounter;
	private Integer phaseCounter;
	
	public Game() {
		this.players = new ArrayList<Player>();
		this.roleDeck = new ArrayList<RoleCard>();
		this.itemDeck = new ArrayList<ItemCard>();
		this.eventDeck = new ArrayList<EventCard>();
		
		this.roundCounter = Flags.GAME_ROUNDS_LIMIT;
		this.phaseCounter = Flags.GAME_PHASES_LIMIT;
		
		initRoleDeck();
		initItemDeck();
		initEventDeck();
	}
	
	public void initRoleDeck(){
		//read card details.
		//csv? 
		
	}
	
	public void initItemDeck(){
		//read card details.
		//csv? 
	}
	
	public void initEventDeck(){
		//read card details.
		//csv? 
	}
	
	public void addPlayer(Player player){
		players.add(player);
	}
	
	public void randomOrder(){
		this.order = new Integer[players.size()];
		
		for(int i = 0 ; i < order.length; i++){
			order[i] = (int) Math.random()*players.size() + 1;
			for (int j = 0; j < i; j++) {
				if(order[i] == order[j]){
					i--;
					break;
				}
			}
		}
		
	}
	
	public void meet(Player requester, Player target){
		//ask target to accept or not
		//if yes trade or team
		
	}
	
	public void trace(Player requester, Player target){}
	
	public void trade(){}
	
	public void encounter(Player requester){
		//draw card from Event deck
	}
	
	public void newTeam(Player leader){
		
		//add random string as team name to leader
		//return the leader
		

	}
	
	public void team(Player leader, Player teammate){
		
		//copy the team name from leader to teammate 
		//if team = null, newTeam(leader)
		//return teammate
		

	}
	
	public void endRound(){
		roundCounter--;
		if(roundCounter == 0){
			endPhase();
			roundCounter = Flags.GAME_ROUNDS_LIMIT;
		}else{
			randomOrder();
		}
		
	}
	
	public void endPhase(){
		phaseCounter--;
		
		//check player if contains food.
		//for each player? 
		//if no food --> die
		
		if(roundCounter == 1){
			doom();
		}else{
			randomOrder();
		}
	}
	
	public void doom(){}
}
