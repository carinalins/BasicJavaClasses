public class CalendarLeapYear{
	
	public static void main(String [] args){
		
		
		
		for( int i = 1; i<31; i++){
			
			
			for(int d = 0; d < 7; d++){
			
			
			System.out.print(i + "\t");
			
			
            i++;			
				
			
            if(d == 6){
				
		
            i--;
			
			} else if(i > 31){
				
                break;
            }

			}	
        
		System.out.print("\n");
		
		}
	}
}
			