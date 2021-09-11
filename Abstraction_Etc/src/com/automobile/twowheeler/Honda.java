package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Honda extends com.automobile.Vehicle{
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	private int speed;
	public Honda(String ModelName,String RegistrationNumber,String OwnerName,int speed) {
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
	public void cdPlayer() {
		System.out.println("Playing Songs using CD Player ");
	}
}
