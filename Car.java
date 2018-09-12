public class Car{
  String make;
  String model;
  static int lastSerialNumber = 0;
  final int serialNumber;
  String colour;
  double price;
  boolean sold;
  int numOfDoors;
  String type;
  
  public Car(String mk, String md, String col, double pr, int door, String tp){
    make = mk;
	model = md;
	serialNumber = ++lastSerialNumber;
	colour = col;
	price = pr;
	sold = false;
	numOfDoors = door;
	type = tp;
  }
  
  public void getMake() {
    System.out.println("Make: " + make);
  }
  
  public void getModel() {
	System.out.println("Model: " + model);
  }
  
  public void getSerialNumber() {
	System.out.println("Serial Number: " + serialNumber);
  }
  
  public void getColour() {
	System.out.println("Colour: " + colour);
  }
  
  public void getPrice() {
	System.out.println("Price: " + price);
  }
  
  public void isSold(){
	System.out.println("Is Sold: " + sold);
  }
  
  public void numOfDoors() {
	System.out.println("Number of Doors: " + numOfDoors);
  }
  
  public void getType() {
	System.out.println("Type :" + type);
  }
  
  public void setColour(String col){
    colour = col;
  }
  
  public void setPrice(double pr){
	price = pr;
  }
}