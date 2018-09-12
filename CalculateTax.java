public class CalculateTax{
	public static void main (String [] args){
	double salary = 40000;
	double tax = 0;
	
	if(salary <= 33800){
		tax = salary * 0.2;
		
	} else {
		tax = (33800 * 0.2) + (salary - 33800)*0.4;
		
	}
	System.out.println("The total tax is: " + tax);
	}
}