public class LoopWhile{
	
	public static void main(String [] args){
		
		//int daysOfTheWeek = 0;
		//int daysOfTheMonth = 30;
		
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
			
			//System.out.println(i);
			
			//if (daysOfTheMonth <= 30){
			//System.out.print(daysOfTheMonth);
			
			//} else if (daysOfTheMonth <= 7){
				//System.out.print(daysOfTheMonth);
				
			//} else {
				//System.out.print("teste");
				
			//}
			
			//daysOfTheWeek++; // days = day + 1;
			
		
	



			//while(count <= 10){
			//int ans = table * count;
		//System.out.println(table + " x " + count + " = " + ans);
		//count++;
			//}
			//table++;
			//count = 1;
		//}
//}
//}