package com.doom.server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.doom.flags.GameFlags;
import com.doom.flags.UtilsFlags;

public class Server{

//	private boolean outServer = false;
	private static ServerSocket server;
	private static Socket socket;
	
	private final static int serverPort = UtilsFlags.SERVER_PORT;
	private final static int maxClientCount = GameFlags.PLAYER_MAX_COUNT;

	
	public static void main(String[] args){
		
		try {
		server = new ServerSocket(serverPort);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		while(true){
			try {
				socket = server.accept();
				
				for(int i = 0; i < maxClientCount; i++){
					
					
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	

}
