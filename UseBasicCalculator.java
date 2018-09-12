public class UseBasicCalculator {
	
	public static void main(String[] args) {
		
		BasicCalculator calc = new BasicCalculator();

		calc.add(3.0,4.0);
		calc.subtract(10.0,8.0);
		calc.times(5.0, 6.2);
		calc.divide(3.1, 7.4);
		calc.modulus(8.0, 3.2);
		calc.increment(10);
	}
}