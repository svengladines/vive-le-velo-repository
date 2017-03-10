package be.occam.velo;

import java.util.Date;

public class LocationDTO {
	
	protected String userID;
	protected double longitude;
	protected double lattitude;
	protected Date moment;
	
	public String getUserID() {
		return userID;
	}
	public LocationDTO setUserID(String userID) {
		this.userID = userID;
		return this;
	}
	public double getLongitude() {
		return longitude;
	}
	public LocationDTO setLongitude(double longitude) {
		this.longitude = longitude;
		return this;
	}
	public double getLattitude() {
		return lattitude;
	}
	public LocationDTO setLattitude(double lattitude) {
		this.lattitude = lattitude;
		return this;
	}
	public Date getMoment() {
		return moment;
	}
	public LocationDTO setMoment(Date moment) {
		this.moment = moment;
		return this;
	}
	
	

}
