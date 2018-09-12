import java.util.*;

public class Quiz {

	
	public static void main(String[] args){
		
		int[] a = {10,6,2,11,5,8,4};
		int b = 0;
		
		for(int d:a){
			
			if(d>b){
				b=d;
				
				System.out.println(b);
			}
		}	
		
	}

}
