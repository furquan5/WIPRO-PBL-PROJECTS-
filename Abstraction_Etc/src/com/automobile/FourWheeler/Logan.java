package com.automobile.FourWheeler;

public class Logan extends com.automobile.Vehicle{
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	private int speed;
	private int gps;
	public Logan(String ModelName,String RegistrationNumber,String OwnerName,int speed,int gps) {
		this.ModelName=ModelName;
		this.RegistrationNumber=RegistrationNumber;
		this.OwnerName=OwnerName;
		this.speed=speed;
		
	}
	public String getModelName() {
		return ModelName;
	}
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public int getSpeed() {
		return speed;
	}
	public int getGps() {
		return gps;
	}

}
