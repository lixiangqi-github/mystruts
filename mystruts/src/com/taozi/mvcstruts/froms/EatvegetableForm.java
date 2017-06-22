package com.taozi.mvcstruts.froms;

/**
 * 吃蔬菜的实体
 * @author taozi
 *
 */
public class EatvegetableForm extends ActionForm{

	private String eatCarrot;//胡萝卜
	private String eatPotatoe; //土豆
	private String eatCucumber; //黄瓜
	private String eatTomatoe;//西红柿
	private String eatMelon;//冬瓜
	private String eatChicken;//鸡肉
	private String eatFish;//鱼
	private String eatLamb;//羊肉
	private String eatBeef;//牛肉
	private String eatEggplant;//茄子
	public String getEatCarrot() {
		return eatCarrot;
	}
	public void setEatCarrot(String eatCarrot) {
		this.eatCarrot = eatCarrot;
	}
	public String getEatPotatoe() {
		return eatPotatoe;
	}
	public void setEatPotatoe(String eatPotatoe) {
		this.eatPotatoe = eatPotatoe;
	}
	public String getEatCucumber() {
		return eatCucumber;
	}
	public void setEatCucumber(String eatCucumber) {
		this.eatCucumber = eatCucumber;
	}
	public String getEatTomatoe() {
		return eatTomatoe;
	}
	public void setEatTomatoe(String eatTomatoe) {
		this.eatTomatoe = eatTomatoe;
	}
	public String getEatMelon() {
		return eatMelon;
	}
	public void setEatMelon(String eatMelon) {
		this.eatMelon = eatMelon;
	}
	public String getEatChicken() {
		return eatChicken;
	}
	public void setEatChicken(String eatChicken) {
		this.eatChicken = eatChicken;
	}
	public String getEatFish() {
		return eatFish;
	}
	public void setEatFish(String eatFish) {
		this.eatFish = eatFish;
	}
	public String getEatLamb() {
		return eatLamb;
	}
	public void setEatLamb(String eatLamb) {
		this.eatLamb = eatLamb;
	}
	public String getEatBeef() {
		return eatBeef;
	}
	public void setEatBeef(String eatBeef) {
		this.eatBeef = eatBeef;
	}
	public String getEatEggplant() {
		return eatEggplant;
	}
	public void setEatEggplant(String eatEggplant) {
		this.eatEggplant = eatEggplant;
	}
	@Override
	public String toString() {
		return "EatvegetableForm [eatCarrot=" + eatCarrot + ", eatPotatoe="
				+ eatPotatoe + ", eatCucumber=" + eatCucumber + ", eatTomatoe="
				+ eatTomatoe + ", eatMelon=" + eatMelon + ", eatChicken="
				+ eatChicken + ", eatFish=" + eatFish + ", eatLamb=" + eatLamb
				+ ", eatBeef=" + eatBeef + ", eatEggplant=" + eatEggplant + "]";
	}
	
}
