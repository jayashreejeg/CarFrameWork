package main.root;


public class HondaCar extends SedanCar {


	public String model="honda";
	private int year=2020;
	
	public String getModel() {
		return model;
	}
	public void setModel(String modelName) {
		this.model = modelName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}


	
	public void model() {
		System.out.println("Model is "+model+" "+year);
	}
	public void numberOfDoors() {
		System.out.println("Model is honda : It has 4 doors");
	}

	public void doorType() {
		System.out.println("Model is honda: It has normal ");
	}
	
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Model is honda. It is very fast ");
	}
}
