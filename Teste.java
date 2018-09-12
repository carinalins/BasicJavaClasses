public class Teste{
   
   public static void main(String[] args){
        
	int dias = 7;
	int offset = 0; // range from 0 to 6 
	int comeco = 1 - offset;
	int fim = 31;
 
	for (int j=comeco; j<=fim; j++) {
 
		if (j>0; j<10) {
	 
		System.out.print(" "+j+" "); // just neater output
	
		} else if { 
		
		System.out.print(j+" "); 
	
		} else {
		System.out.print("   "); // 3 spaces
		}
 
			//if (j>0 && j%cols==0) {
		//System.out.println(); // new row or line
		} // end if
 
	comeco=j++;
 
	} // end j for loop

    }
//}
