package main.root;

public  class TeslaCar extends SedanCar implements Electric {

	public String model="tesla";
	private static TeslaCar teslaCarObject= null;
	
    private TeslaCar() {
    	// Ignore
    }
	public static TeslaCar getInstance() {
		if(teslaCarObject==null) {
			teslaCarObject = new TeslaCar();
		}
		return teslaCarObject;
	}
	
		
	public void model() {
		// TODO Auto-generated method stub
		System.out.println("Model is "+model);
	}

	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Model is Tesla. It is very fast ");
	}

	public void fuelType() {
		// TODO Auto-generated method stub
		System.out.println("Model is Tesla. It is a Electric car");
	}

}
