package com.doom.main;

import com.doom.cards.EventCard;
import com.doom.cards.ItemCard;
import com.doom.dice.Face10Dice;
import com.doom.player.Player;
import com.doom.utils.Common;


public class Gameboard {

	public static void main(String[] args){
		
		
		//Main game flow; 
		//1. load game & add players
		//2. random order
		//3. 
		
		
		
//		Game game = new Game();
		Player player = new Player();
		player.addCardToHand(new EventCard("testEventCard","","","", 1, 0, 0));
		player.addCardToHand(new ItemCard("testItemCard", "", ""));
		
		
		System.out.println(((EventCard) player.getHand().get(0)).getAttackBuff());
		System.out.println(((EventCard) player.getHand().get(0)).getCardName());
		
//		game.newTeam(player);
//		System.out.println(player.getTeam());
		
//		Common common = Common.getInstance();
//		System.out.println(common.getRandomString(10));
		
//		Face10Dice dice = new Face10Dice();
//		System.out.println(common.getSum(dice.rollX(2)));
	}

}
