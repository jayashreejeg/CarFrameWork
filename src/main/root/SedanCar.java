package main.root;

public abstract class SedanCar implements Car {

	public String baseModel;
	
	enum Size{
		MINI,
		COMPACT,
		MEDIUM,
		BIG		
	}
	
	
	public void numberOfDoors() {
		System.out.println("It has 4 doors");
	}

	public void doorType() {
		System.out.println("It has normal ");
	}

	public void roofType() {
		System.out.println("It has normal ");
	}

	public void sizeOfCar() {
		System.out.println("It can be small, compact, medium and big ");
	}

	public  abstract void model() ;


	public abstract void speed() ;

}
