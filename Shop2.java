public class Shop2 {
	public static void main (String [] args) {
		ShippingCalculator3 sc = new ShippingCalculator3();
		Customer carina = new Customer ("Europe",1);
		Customer jenny = new Customer ("US",2);
		Customer mary = new Customer ("Europe",2);
		
		sc.calculateShipping(carina);
		sc.calculateShipping(jenny);
		sc.calculateShipping(mary);
		}
	}