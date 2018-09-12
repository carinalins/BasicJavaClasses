//each day of the week lands on a different number 0,1,2,3,4,5 or 6//
//use a for loop to iterate throgh each of these day numbers//
//depending on which number we are on, print out what day it actualy is//
//eg 0 - Sunday//
//1 - Monday//
//2 - Tuesday//

//to do this you can do more than just use for loops, remember how to take decisions.//


public class DaysOfTheWeek{
	public static void main(String[] args){
		String day = "";	
		
		
		for ( int i = 1; i<8; i++) {
		//give ech day a name
		if (i==1){
			day = "Monday";
			
		}else if(i==2){
			day = "Tuesday";
		
		}else if(i==3){
			day = "Wednesday";
			
		}else if(i==4){
			day = "Thrusday";
			
		}else if(i==5){
			day = "Friday";
			
		}else if(i==6){
			day = "Saturday";
			
		}else {
			day = "Sunday";
				
		}//print the name
		System.out.println("Day is: " + day);
		
		}
	}
}
