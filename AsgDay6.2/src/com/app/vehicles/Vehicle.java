package com.app.vehicles;

/*Solve this
Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle. 
state  : registrationNo : int , color : String , price : double
registrationNo  MUST be unique (non duplicate) for any vehicle
Override toString*/

public class Vehicle {
	private int registrationNumber;
	private String color;
	private double price;
	
	public Vehicle(int rn, String color, double price) {
		super();
		this.registrationNumber = rn;
		this.color = color;
		this.price = price;
	}
	
	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "\nVehicle with Registration Num:"+ " " + registrationNumber + " " + "of Color " + color + "  "+ "With current cost of " + price + "Registered";
	}
	@Override
	public boolean equals(Object v){
		if(v instanceof Vehicle) {
			return this.registrationNumber == ((Vehicle)v).registrationNumber;
			}
		return false;
	}
	
	
	
}
