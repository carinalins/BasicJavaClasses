public class Shop {
	public static void main (String [] args) {
		ShippingCalculator3 sc = new ShippingCalculator3();
		sc.calculateShipping("Europe",1);
		sc.calculateShipping("US", 2);
		sc.calculateShipping("Europe", 2);
		}
	}