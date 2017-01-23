package com.doom.utils;

public class Common {
	
	private static final Common instance = new Common();
	
	private Common() {}
	
	public static Common getInstance(){
		return instance;
	}
	
	public String getRandomString(int length){
		String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		char[] outputChar = new char[length];
		for(int i = 0; i < length; i++){
			Integer randInt = (int) (Math.random() * ABC.length()) ;
			System.out.println(randInt);
			outputChar[i] = ABC.charAt(randInt);
		}
		
		String str = new String(outputChar);
		
		
		return str;
	}

}
