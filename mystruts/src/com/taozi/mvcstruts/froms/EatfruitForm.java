package com.taozi.mvcstruts.froms;

/**
 * 吃水果的实体
 * @author taozi
 *
 */
public class EatfruitForm extends ActionForm{

	private String eatGrape;//葡萄
	private String eatWatermelon; //西瓜
	private String eatDragon; //火龙果
	private String eatBanana;//香蕉
	private String eatStrawberry;//草莓
	private String eatApple;//苹果
	private String eatPear;//梨
	private String eatKiwi;//猕猴桃
	public String getEatGrape() {
		return eatGrape;
	}
	public void setEatGrape(String eatGrape) {
		this.eatGrape = eatGrape;
	}
	public String getEatWatermelon() {
		return eatWatermelon;
	}
	public void setEatWatermelon(String eatWatermelon) {
		this.eatWatermelon = eatWatermelon;
	}
	public String getEatDragon() {
		return eatDragon;
	}
	public void setEatDragon(String eatDragon) {
		this.eatDragon = eatDragon;
	}
	public String getEatBanana() {
		return eatBanana;
	}
	public void setEatBanana(String eatBanana) {
		this.eatBanana = eatBanana;
	}
	public String getEatStrawberry() {
		return eatStrawberry;
	}
	public void setEatStrawberry(String eatStrawberry) {
		this.eatStrawberry = eatStrawberry;
	}
	public String getEatApple() {
		return eatApple;
	}
	public void setEatApple(String eatApple) {
		this.eatApple = eatApple;
	}
	public String getEatPear() {
		return eatPear;
	}
	public void setEatPear(String eatPear) {
		this.eatPear = eatPear;
	}
	public String getEatKiwi() {
		return eatKiwi;
	}
	public void setEatKiwi(String eatKiwi) {
		this.eatKiwi = eatKiwi;
	}
	
	@Override
	public String toString() {
		return "EatfruitForm [eatGrape=" + eatGrape + ", eatWatermelon="
				+ eatWatermelon + ", eatDragon=" + eatDragon + ", eatBanana="
				+ eatBanana + ", eatStrawberry=" + eatStrawberry
				+ ", eatApple=" + eatApple + ", eatPear=" + eatPear
				+ ", eatKiwi=" + eatKiwi + "]";
	}
	
}
