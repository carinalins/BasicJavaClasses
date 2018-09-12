//create a class LeapYearCalculator that creates a new leap year calculator
	
	
	//@carinakkls (:

public class LeapYearCalculator{
	
		public static void main (String[] args){
		int year = 2016;
		boolean isLeapYear = true;
		
		
		//check if the year is divisible by four, one hundred and four hundred
		//if it is not, then it is not a leap year
		if(year % 4 == 0){
			
			System.out.println("It is a leap year");
			
			} else if (year % 100 == 0){
				
				System.out.println("It is a leap year");
						
			} else if (year % 400 == 0 ){
				
				System.out.println("It is a leap year");
			
			
			} else {
				System.out.println("It is not a leap year");
				
			}
		}
}
