package com.doom.cards;

public class ItemCard extends Card {
	
	private String itemType;
	private Integer meleeBuff;
	private Integer shootBuff;
	private Integer traceBuff;
	private Integer escapeBuff;
	
	public ItemCard(String cardName, String cardDesc, String cardImgPath) {
		super(cardName, cardDesc, cardImgPath);
		// TODO Auto-generated constructor stub
	}
	
	public String getItemType(){
		return this.itemType;
	}
	
	public void setItemType(String itemType){
		if("".equals(itemType) || (!"F".equals(itemType) && !"W".equals(itemType) && !"T".equals(itemType) && !"J".equals(itemType))){
			this.itemType = "T";	// if itemType is not indicated, make it as a Tool.
		}else{
			this.itemType = itemType;
		}
	}

	public Integer getMeleeBuff() {
		return meleeBuff;
	}

	public void setMeleeBuff(Integer meleeBuff) {
		this.meleeBuff = meleeBuff;
	}

	public Integer getShootBuff() {
		return shootBuff;
	}

	public void setShootBuff(Integer shootBuff) {
		this.shootBuff = shootBuff;
	}

	public Integer getTraceBuff() {
		return traceBuff;
	}

	public void setTraceBuff(Integer traceBuff) {
		this.traceBuff = traceBuff;
	}

	public Integer getEscapeBuff() {
		return escapeBuff;
	}

	public void setEscapeBuff(Integer escapeBuff) {
		this.escapeBuff = escapeBuff;
	}
	
	
}
