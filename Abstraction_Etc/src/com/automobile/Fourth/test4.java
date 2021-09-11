package com.automobile.Fourth;
import com.automobile.FourWheeler.Logan;
import com.automobile.FourWheeler.Ford;
public class test4 {
	public static void main(String[] args) {
		Logan l=new Logan("Logan Lz1001","LGN3211","FTJ ARSHI",198,44);
		System.out.println("==========Display Logan Details===========");
		System.out.println("Model Name :"+l.getModelName());
		System.out.println("Registration Number :"+l.getRegistrationNumber());
		System.out.println("Owner Name :"+l.getOwnerName());
		System.out.println("Speed :"+l.getSpeed());
		System.out.println("Gps :"+l.getGps());
		
		
		Ford f=new Ford("Ecosport","FORD7211","FURQUAN ARSHI",200,66);
		System.out.println("==========Display Ford Details===========");
		System.out.println("Model Name :"+f.getModelName());
		System.out.println("Registration Number :"+f.getRegistrationNumber());
		System.out.println("Owner Name :"+f.getOwnerName());
		System.out.println("Speed :"+f.getSpeed());
		System.out.println("Temperature Control :"+f.getTempControl());
	}
	

}
