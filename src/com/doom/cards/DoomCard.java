package com.doom.cards;

import java.util.ArrayList;

import com.doom.flags.CardFlags;
import com.doom.player.Player;

public class DoomCard extends Card {

	private String doomType;
	
	private Integer bossHealth;
	private Integer bossAttack;
	
	
	public DoomCard() {
		// TODO Auto-generated constructor stub
	}

	public DoomCard(String cardName, String cardDesc, String cardImgPath) {
		super(cardName, cardDesc, cardImgPath);
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkDoom(ArrayList<Player> players){
		// TODO Finish doom
		switch(doomType){
			case CardFlags.DOOM_TYPE_BOSS:
			case CardFlags.DOOM_TYPE_DOOM:
			case CardFlags.DOOM_TYPE_TEAM:
			case CardFlags.DOOM_TYPE_HEAVEN:
				return true;
			
		}
		
		return false;
	}

}
