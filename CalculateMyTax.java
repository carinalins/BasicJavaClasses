public class CalculateMyTax {
	
	public static void main(String[] args) {
		
		double salary1 = 20000;
		double salary2 = 40000;
		double salary3 = 80000;


		TaxCalculator tc1 = new TaxCalculator(salary1);
		TaxCalculator tc2 = new TaxCalculator(salary2);
		TaxCalculator tc3 = new TaxCalculator(salary3);

		tc1.calculateTax();
		tc2.calculateTax();
		tc3.calculateTax();

	}
}