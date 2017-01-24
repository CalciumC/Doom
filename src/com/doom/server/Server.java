package com.doom.server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintStream;
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
	
	private final static ClientThread[] threads = new ClientThread[maxClientCount];
	
	public static void main(String[] args){
		
		try {
		server = new ServerSocket(serverPort);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		while(true){
			try {
				socket = server.accept();
				int i = 0;
				for(i = 0; i < maxClientCount; i++){
					if(threads[i] == null){
						(threads[i] = new ClientThread(socket, threads)).start();
						break;
					}
				}
				
				if(i == maxClientCount){
					PrintStream os = new PrintStream(socket.getOutputStream());
					os.println("Game is full.");
					os.close();
					socket.close();
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	

}
