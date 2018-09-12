public class Motobike{
	String make;
	String model;
	static int lastSerialNumber;
	final int serialNumber;
	String colour;
	double price;
	boolean isSold;
	
	public Motobike(String make, String model) {
		this.make = make;
		this.model = model;
		this.price = 0;
		this.serialNumber = ++lastSerialNumber;
		this.colour = "Yellow";
		this.isSold = false;
	}
	public void showColour() {
		System.out.println(colour);
		
	}
	
	public void showSerialNumber () {
		System.out.println(" The number is: " + serialNumber);
	}
	
	public void changeColour(String col) {
			colour = col;
			
	}
	

}