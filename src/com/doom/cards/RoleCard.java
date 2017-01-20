package com.doom.cards;

public class RoleCard extends Card {
	
	private Integer meleeBuff;
	private Integer shootBuff;
	private Integer weaponBuff;
	private Integer traceBuff;
	private Integer escapeBuff;
	private Integer healthBuff;
	
	public RoleCard() {
		super();
	}


	public RoleCard(String cardName, String cardDesc, String cardImgPath, 
			Integer meleeBuff, Integer shootBuff, Integer weaponBuff,
			Integer traceBuff, Integer escapeBuff, Integer healthBuff) {
		super(cardName, cardDesc, cardImgPath);
		this.meleeBuff = meleeBuff;
		this.shootBuff = shootBuff;
		this.weaponBuff = weaponBuff;
		this.traceBuff = traceBuff;
		this.escapeBuff = escapeBuff;
		this.healthBuff = healthBuff;
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


	public Integer getWeaponBuff() {
		return weaponBuff;
	}


	public void setWeaponBuff(Integer weaponBuff) {
		this.weaponBuff = weaponBuff;
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


	public Integer getHealthBuff() {
		return healthBuff;
	}


	public void setHealthBuff(Integer healthBuff) {
		this.healthBuff = healthBuff;
	}
	
	public Integer getAttackBuffs(){
		return meleeBuff + weaponBuff + shootBuff;
	}
}
