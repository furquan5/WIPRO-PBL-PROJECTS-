package com.automobile;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
public class test {
	public static void main(String[] args) {
		Hero h=new Hero("Glamout Fi150","GLM1997","Ayan Gohar",78);
		System.out.println("=============Display from Hero==============");
		System.out.println("Vehicle Model is "+h.getModelName());
		System.out.println("Vehicle RegistrationNumber is "+h.getRegistrationNumber());
		System.out.println("Vehicel Owner Name "+h.getOwnerName());
		System.out.println("Speed of Vehicle "+h.getSpeed());
		h.Radio();
		
		
		Honda hn=new Honda("Hornet Z-500","HORZ00","Anam Imran",99);
		System.out.println("============Display from Honda =================");
		System.out.println("Vehicle Model is "+hn.getModelName());
		System.out.println("Vehicle RegistrationNumber is "+hn.getRegistrationNumber());
		System.out.println("Vehicel Owner Name "+hn.getOwnerName());
		System.out.println("Speed of Vehicle "+hn.getSpeed());
		hn.cdPlayer();
		

	}

}
