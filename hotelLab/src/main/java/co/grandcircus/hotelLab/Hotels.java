package co.grandcircus.hotelLab;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Hotels")
public class Hotels {
	
	@Id
	private String id;
	private String hotelName;
	private String city;
	private Integer pricePerNight;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(Integer pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	public Hotels() {}
	
	public Hotels(String id, String hotelName, String city, Integer pricePerNight) {
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}
	
	public Hotels(String hotelName, String city, Integer pricePerNight) {
		this.hotelName = hotelName;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}
	
	

}
