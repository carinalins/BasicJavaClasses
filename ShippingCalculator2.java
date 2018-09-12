public class ShippingCalculator2{
	int usDeliveryTime;
	int canadaDelivetyTime;
	int europeDeliveryTime;
	int asiaDeliveryTime;
	
	public ShippingCalculator2 (){
		usDeliveryTime = 10;
		canadaDelivetyTime = 9;
		europeDeliveryTime = 3;
		asiaDeliveryTime = 6;
	}
	public void calculateShipping(String country){
		int time = 0;
		if(country.equalsIgnoreCase("US")) {
				time = usDeliveryTime;
		} else if (country.equalsIgnoreCase ("europe")) {
			time = europeDeliveryTime;
		} else if (country.equalsIgnoreCase ("canada")) {
			time = canadaDelivetyTime;
		} else if (country.equalsIgnoreCase ("asia")) {
			time = asiaDeliveryTime;
		} else {
		System.out.println("We don't ship to you");
		}
		System.out.println("It will take " + time + "days");
	}
}