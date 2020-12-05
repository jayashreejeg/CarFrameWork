package main.code;
import com.google.gson.Gson;
import main.root.ToyotaCar;

public class CarSerializeDemo {
	public static void main(String [] args) {
		ToyotaCar toyotaCar = new ToyotaCar();
		toyotaCar.setModel("toyota sedan");
		toyotaCar.setYear(2020);
		
		  Gson gSon = new Gson();
	      String jsonString = gSon.toJson(toyotaCar);
	      System.out.println(jsonString);								
	      
	      
	      ToyotaCar toyotaCar1 = gSon.fromJson(jsonString, ToyotaCar.class);
	      System.out.println(toyotaCar1.getModel());
	      System.out.println(toyotaCar1.getYear());
	      
	}
}
