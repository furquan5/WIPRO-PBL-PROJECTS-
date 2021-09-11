package com.automobile.FourWheeler;

public class Ford {
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	private int speed;
	private int TempControl;
	public Ford(String ModelName,String RegistrationNumber,String OwnerName,int speed,int TempControl) {
		this.ModelName=ModelName;
		this.RegistrationNumber=RegistrationNumber;
		this.OwnerName=OwnerName;
		this.speed=speed;
		this.TempControl=TempControl;
		
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
	public int getTempControl() {
		return TempControl;
	}
}
