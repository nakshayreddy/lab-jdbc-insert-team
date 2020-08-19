package model;


public class City
{
	private long cityID;
	private String cityName;
	public City(long cityID, String cityName) {
		super();
		this.cityID = cityID;
		this.cityName = cityName;
	}
	public long getCityID() {
		return cityID;
	}
	public void setCityID(long cityID) {
		this.cityID = cityID;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}