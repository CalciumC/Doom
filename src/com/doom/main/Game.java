package com.doom.main;

import java.util.ArrayList;

import com.doom.cards.EventCard;
import com.doom.cards.ItemCard;
import com.doom.cards.RoleCard;
import com.doom.flags.CardFlags;
import com.doom.flags.GameFlags;
import com.doom.player.Player;
import com.doom.utils.Common;

public class Game {

	private ArrayList<Player> players;
	private ArrayList<RoleCard> roleDeck;
	private ArrayList<ItemCard> itemDeck;
	private ArrayList<EventCard> eventDeck;
	private Integer[] order;
	private Integer roundCounter;
	private Integer phaseCounter;
	
	private Common common = Common.getInstance();
	
	public Game() {
		this.players = new ArrayList<Player>();
		this.roleDeck = new ArrayList<RoleCard>();
		this.itemDeck = new ArrayList<ItemCard>();
		this.eventDeck = new ArrayList<EventCard>();
		
		this.roundCounter = GameFlags.GAME_ROUNDS_LIMIT;
		this.phaseCounter = GameFlags.GAME_PHASES_LIMIT;
		
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
		//trade() or team()
		
	}
	
	public boolean trace(Player requester, Player target, EventCard event){
		boolean result = false;
		//get requester trace stats
		//get event trace buffs
		//if requester trace + event trace buffs + roll dice > 5 --> return true
		//else false
		return result;
	}
	
	public void trade(Player requester, Player target){
		
		
	}
	
	public void encounter(Player requester){
		//draw card from Event deck
	}
	
	public void newTeam(Player leader){
		
		//add random string as team name to leader
		String teamname = common.getRandomString(10);
		leader.setTeam(teamname);
		

	}
	
	public void team(Player leader, Player teammate){
		
		//copy the team name from leader to teammate 
		String team = leader.getTeam();
		
		//if team = null, newTeam(leader)
		if("".equals(team)){
			newTeam(leader);
			team = leader.getTeam();
		}
		
		teammate.setTeam(team);
		

	}
	
	public void endRound(){
		roundCounter--;
		if(roundCounter == 0){
			endPhase();
			roundCounter = GameFlags.GAME_ROUNDS_LIMIT;
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
	
	private boolean isTeam(Player requester, Player target){
		
		String requesterTeam = requester.getTeam();
		String targetTeam = target.getTeam();
		
		if("".equals(requesterTeam) || "".equals(targetTeam)){
			return false;
		}else if(!requesterTeam.equals(targetTeam)){
			return false;
		}
		return true;
		
	}
}
