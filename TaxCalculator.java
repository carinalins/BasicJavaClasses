public class TaxCalculator {
	double salary;
	double lowerTaxBand;
	double lowerTaxBandRate;
	double upperTaxBandRate;
	
	public TaxCalculator(double sal) {
	this.salary = sal;
	this.lowerTaxBand = 22800;
	this.lowerTaxBandRate = 0.2;
	this.upperTaxBandRate = 0.4;
	}
	
	public void calculateTax() {
		double tax = 0;
		if(salary <= lowerTaxBand) {
			tax = salary * lowerTaxBandRate;
			
		} else {
			tax = (lowerTaxBand * lowerTaxBandRate) + (salary - lowerTaxBand) * upperTaxBandRate;
			
		}
		System.out.println("The total tax is: " + tax);
		
	}
}