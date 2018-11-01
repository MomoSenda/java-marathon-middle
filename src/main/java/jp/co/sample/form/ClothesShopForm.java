package jp.co.sample.form;

/**
 * 洋服店の情報を表すフォーム
 * 
 * @author momo.senda
 *
 */
public class ClothesShopForm {

	/** 性別 */
	private String gender;
	/** 色 */
	private String color;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "ClothesShopForm [gender=" + gender + ", color=" + color + ", getGender()=" + getGender()
				+ ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	


}
