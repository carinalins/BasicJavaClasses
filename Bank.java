public class Bank{
	public static void main(String [] args){
		double salary = 20000;
		
		TaxCalculator tc = new TaxCalculator(salary);
		tc.calculateTax();
		TaxCalculator tc2 = new TaxCalculator(400000);
		tc2.calculateTax();
		
		BetterTaxCalculator btc = new BetterTaxCalculator ();
		btc.caculateTax(20000);
		btc.calculateTax(40000);
		btc.calculateTax(400000);
		
	}
	}