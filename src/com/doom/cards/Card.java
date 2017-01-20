package com.doom.cards;

public class Card {
	private String cardName;
	private String cardDesc;
	private String cardImgPath;
	
	public Card(){
		cardName = ""; 
		cardDesc = "";
		cardImgPath = "";
	}
	
	public Card(String cardName, String cardDesc, String cardImgPath){
		this.cardName = cardName;
		this.cardDesc = cardDesc;
		this.cardImgPath = cardImgPath;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardDesc() {
		return cardDesc;
	}

	public void setCardDesc(String cardDesc) {
		this.cardDesc = cardDesc;
	}

	public String getCardImgPath() {
		return cardImgPath;
	}

	public void setCardImgPath(String cardImgPath) {
		this.cardImgPath = cardImgPath;
	}
	
}
