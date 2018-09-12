public class ShippingCalculator{
	int usDeliveryTime;
	int canadaDelivetyTime;
	int europeDeliveryTime;
	int asiaDeliveryTime;
	
	public ShippingCalculator (){
		usDeliveryTime = 3;
		canadaDelivetyTime = 4;
		europeDeliveryTime = 10;
		asiaDeliveryTime = 9;
	}
	public void calculateShipping(String country){
		int time =0;
		if(country.equalsIgnoreCase("US")) {
				time = usDeliveryTime;
				
		} else if (country.equalsIgnoreCase ("europe")) {
			time = europeDeliveryTime;
			
		} else if (country.equalsIgnoreCase ("canada")) {
			time = canadaDelivetyTime;
			
		} else if (country.equalsIgnoreCase ("asia")) {
			time = asiaDeliveryTime;
			
		} else {
			//System.out.println("We don't ship to you");
		time = -1;
		}
		if (time == -1) {
		System.out.println("we don't ship to you");
		} else {
			System.out.println("It will take " + time + "days");
		}
	}
}