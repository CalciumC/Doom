package com.doom.main;

import com.doom.player.Player;


public class Gameboard {

	public static void main(String[] args){
		
		Game game = new Game();
		Player player = new Player();
		game.newTeam(player);
		System.out.println(player.getTeam());
		
	}

}
