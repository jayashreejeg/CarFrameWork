package main.code;

import main.root.SedanCar;
import main.root.TeslaCar;
import main.root.ToyotaCar;

public class MyCar  {
	
	String model;
	String color;
	int year;
	
public static void main(String [] args) {
	
	System.out.println("*******************");
	ToyotaCar myToyotaCar = new ToyotaCar();
	myToyotaCar.doorType();
	myToyotaCar.numberOfDoors();
	myToyotaCar.model();
	myToyotaCar.model="tata";
	myToyotaCar.model();
	
	ToyotaCar myToyotaCar1 = new ToyotaCar();
	myToyotaCar1.model();
	
	System.out.println("*******************  singleton");
	TeslaCar myTestlaCar =TeslaCar.getInstance();
	myTestlaCar.model();
	myTestlaCar.model="tata";
	myTestlaCar.model();
	
	TeslaCar myTestlaCar1 =TeslaCar.getInstance();
	myTestlaCar1.model();
	
	System.out.println("******************* factory design pattern");
	SedanCar myCar = new CarFactory().getModel("honda");
	myCar.model();
	myCar = new CarFactory().getModel("tesla");
	myCar.model();
	
	
	
}

// How to Serialize an object into JSON string

// How to Deserialize a JSON string to Object

// Singleton design pattern 

// Factory desgin pattern

}
