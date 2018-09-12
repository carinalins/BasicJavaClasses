public class ShippingCalculator3{
	int usDeliveryTime;
	int canadaDelivetyTime;
	int europeDeliveryTime;
	int asiaDeliveryTime;
	int expressDeliveryTime;
	
	public ShippingCalculator3 (){
		usDeliveryTime = 10;
		canadaDelivetyTime = 9;
		europeDeliveryTime = 3;
		asiaDeliveryTime = 6;
		expressDeliveryTime = 1;
	}
	public void calculateShipping(Customer someone){
		int time = 0;
		if(someone.country.equalsIgnoreCase("US")) {
				time = usDeliveryTime;
				
		} else if (someone.country.equalsIgnoreCase ("europe")) {
		if (someone.priorityLevel == 1){
				time = expressDeliveryTime;
		} else {
				time = europeDeliveryTime;
		}
			
		} else if (someone.country.equalsIgnoreCase ("canada")) {
			time = canadaDelivetyTime;
			
		} else if (someone.country.equalsIgnoreCase ("asia")) {
			time = asiaDeliveryTime;
			
		} else {
			//System.out.println("We don't ship to you");
		time = -1;
		}
		if (time <0) {
		System.out.println("we don't ship to you");
		} else {
			System.out.println("It will take " + time + "days");
		}
	}
}