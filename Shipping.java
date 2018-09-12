public class Shipping {
	
	public static void main(String[] args) {
		
		String us = "US";

		String europe = "Europe";

		ShippingCalculator sc = new ShippingCalculator();

		sc.calculateShipping(us);
		sc.calculateShipping(europe);
	}	

}