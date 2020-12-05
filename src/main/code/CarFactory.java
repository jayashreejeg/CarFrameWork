package main.code;

import main.root.HondaCar;
import main.root.SedanCar;
import main.root.TeslaCar;
import main.root.ToyotaCar;

public class CarFactory {
	
	public SedanCar getModel(String modelName) {
		if(modelName=="honda")
		{
		return new HondaCar();
		}
		if(modelName=="toyota")
		{
			return new ToyotaCar();
		}
		if(modelName=="tesla")
		{
			return TeslaCar.getInstance();
		}
		return null;
	}

}
