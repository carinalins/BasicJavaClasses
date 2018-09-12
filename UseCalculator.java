
public class UseCalculator {

	public static void main(String[] args) {
		//Calculator c = new Calculator();
		double ans = Calculator.add(3, 5);
		System.out.println("Add: " +  ans);
		
		Calculator.subtract(4,2);
		Calculator c = new Calculator("Blue");
		c.getColour();
		//c.add(3,4); because its static, it does not depending on the state

	}

}
