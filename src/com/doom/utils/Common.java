package com.doom.utils;

import java.util.ArrayList;

import com.doom.flags.UtilsFlags;

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
	
	public Integer getSum(Integer[] intArray){
		Integer sum = 0;
		for(Integer i: intArray){
			sum = sum + i;
		}
		return sum;
	}
	
	public ArrayList<String[]> loadCard(){
		//TODO Load cards from CSV? 
		//read each row as String[] 
		//save to arrayList
		//return
		return null;
		
	}
	
	public String printTitle(String title){
		
		return printTitle(title, UtilsFlags.TITLE_LENGTH);
	}
	
	public String printTitle(String title, int maxLen){
		String prefixsuffix = UtilsFlags.TITLE_PREFIX_SUFFIX;
		int maxLength = maxLen; 
		
		title = " " + title + " ";
		
		int length = title.length() + prefixsuffix.length() * 2;
		
		if(length > maxLength){
			int extraDigit = length - maxLength;
			int toCut = extraDigit/2;
			String fillSpace = "";
			if(extraDigit % 2 == 1){
				toCut++;
				fillSpace = " ";
			}
			
			prefixsuffix = prefixsuffix.substring(0, prefixsuffix.length()- toCut);
			title = title + fillSpace;
			
		}else if(length < maxLength){
			int toFill = maxLength - length;
			if(toFill == 1){
				title = title + " ";
			}else if(toFill >1){
				for(int i=0; i < toFill/2; i++){
					prefixsuffix = prefixsuffix + UtilsFlags.TITLE_FILLING;
				}
				if(toFill % 2  == 1){ 
					title = title + " ";
				}
			}
		}
	
		return prefixsuffix + title + prefixsuffix;
	}
	
	public String printMsg(int type, String[] param){
		
		switch(type){
			//TODO case intType to msg 
		
		}
		
		return "";
	}
}
