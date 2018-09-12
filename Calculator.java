public class Calculator{
	public Calculator() {
		System.out.println("Hello from Calcy");
	}
	public void addNumbers (double a,double b) {
		System.out.println("Add numbers: " + (a+b));
		
	}
	public void subtractNumbers (double a, double b) {
		System.out.println("Subtract numbers: " + (a-b));
		
	}
	public void mutiplyNumbers (double a, double b) {
		System.out.println("Multiply numbers: " + (a*b));
		
	}
	public void divideNumbers (double a, double b) {
		System.out.println("Divide Numbers: " + (a/b));
		
	}
	public void modNumbers(double a, double b) {
		System.out.println("Modulus of numbers: " + (a%b));
		
	
	}
}