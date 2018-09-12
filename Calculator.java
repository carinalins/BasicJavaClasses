
public class Calculator {
		String colour;
		public Calculator(String colour){
			this.colour=colour;
		}
		
		public /*static*/ void getColour(){
			System.out.println(this.colour);
		}
	
	public static double add(double a, double b){
		
		return a+b;
	}
	
	public static double subtract(double a, double b){
		
		return a-b;
	}
	
	public static double multiple(double a, double b){
		
		return a*b;
	}
	
	public static double divide(double a, double b){
	
	if (b==0){
		
		System.out.println("Canoot divide by 0");
		return -1;
		
		}
		
		return a/b;
	}
}
