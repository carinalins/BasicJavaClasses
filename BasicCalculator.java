public class BasicCalculator {

	public BasicCalculator(){
		System.out.println("New Calculator");
	}

	public void add(double a, double b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}

	public void subtract(double a, double b){
		System.out.println(a + " - " + b + " = " + (a-b));
	}

	public void times(double a, double b){
		System.out.println(a + " x " + b + " = " + (a*b));
	}

	public void divide(double a, double b){
		System.out.println(a + " / " + b + " = " + (a/b));
	}

	public void modulus(double a, double b){
		System.out.println(a + " % " + b + " = " + (a%b));
	}

	public void increment(double a){
		int b = (int) a;
		System.out.println(a + " ++ " + " = " + (b++));
	}
	

}