package com.doom.cards;

public class EventCard extends Card {
	
	private String area;
	private Integer attackBuff;
	private Integer escapeBuff;
	private Integer traceBuff;
	private String eventName;
	private String eventCondition;
	private String eventReward;

	public EventCard(String cardName, String cardDesc, String cardImgPath, 
			String area, Integer attackBuff, Integer escapeBuff,
			Integer traceBuff) {
		super(cardName, cardDesc, cardImgPath);
		this.area = area;
		this.attackBuff = attackBuff;
		this.escapeBuff = escapeBuff;
		this.traceBuff = traceBuff;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getAttackBuff() {
		return attackBuff;
	}

	public void setAttackBuff(Integer attackBuff) {
		this.attackBuff = attackBuff;
	}

	public Integer getEscapeBuff() {
		return escapeBuff;
	}

	public void setEscapeBuff(Integer escapeBuff) {
		this.escapeBuff = escapeBuff;
	}

	public Integer getTraceBuff() {
		return traceBuff;
	}

	public void setTraceBuff(Integer traceBuff) {
		this.traceBuff = traceBuff;
	}
	
	public void setEventDetails(String eventName, String eventCondition, String eventReward){
		this.eventName = eventName;
		this.eventCondition = eventCondition;
		this.eventReward = eventReward;
	}
	
	public String[] getEventDetails(){
		return new String[] {eventName, eventCondition, eventReward};
	}
	
}
