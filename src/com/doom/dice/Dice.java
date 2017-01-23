package com.doom.dice;

public class Dice {

	private Integer face;
	
	public Dice() {
		this.face = 6;
	}
	
	public Dice(Integer face){
		this.face = face;
	}
	
	public Integer roll(){
		return (int) (Math.random() * face + 1);
	}
	
	public Integer[] rollX(Integer times){
		Integer[] result = new Integer[times];
		for(int i=0; i< times; i++){
			result[i] = roll();
		}
		return result;
	}
}
