package com.doom.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import com.doom.main.Game;
import com.doom.player.Player;
import com.doom.utils.Common;

public class ClientThread extends Thread {
	
	private DataInputStream is = null;
	private PrintStream os = null;
	private Socket clientSocket = null;
	private final ClientThread[] threads;
	private int maxClientCount;
	private Player me;
	
	private Common c = Common.getInstance();
	
	public ClientThread(Socket clientSocket, ClientThread[] threads){
		this.clientSocket = clientSocket;
		this.threads = threads;
		maxClientCount = threads.length;
	}
	
	public void run(){
		int maxClientCount = this.maxClientCount;
		ClientThread[] threads = this.threads;
		
		try {
			is = new DataInputStream(clientSocket.getInputStream());
			os = new PrintStream(clientSocket.getOutputStream());
			os.println(c.printTitle("DOOM"));
			Game game = Game.getInstance();
			os.println("Enter a name for yourself: ");
			String playerName = is.readUTF().trim();
			me = new Player(playerName);
			game.addPlayer(me);
			for(int i = 0; i < maxClientCount; i++){
				if(threads[i] != null && threads[i] != this){
					threads[i].os.println(playerName+" is joined.");
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
