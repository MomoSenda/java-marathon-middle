package jp.co.sample.domain;

/**
 * 
 * ホテルの情報を表すドメイン.
 * @author momo.senda
 *
 */
public class Hotel {
	/**id*/
	private Integer id;
	/**エリア*/
	private String areaName;
	/**ホテル名*/
	private String hotelName;
	/**住所*/
	private String address;
	/**最寄り駅*/
	private String nearestStation;
	/**値段*/
	private Integer price;
	/**駐車場*/
	private String parking;

	@Override
	public String toString() {
		return "HotelService [id=" + id + ", areaName=" + areaName + ", hotelName=" + hotelName + ", address=" + address
				+ ", nearestStation=" + nearestStation + ", price=" + price + ", parking=" + parking + ", getId()="
				+ getId() + ", getAreaName()=" + getAreaName() + ", getHotelName()=" + getHotelName()
				+ ", getAddress()=" + getAddress() + ", getNearestStation()=" + getNearestStation() + ", getPrice()="
				+ getPrice() + ", getParking()=" + getParking() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNearestStation() {
		return nearestStation;
	}

	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

}
