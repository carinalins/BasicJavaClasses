//create a For loop and calculate the answer 1+2+3+4+5

//@carinakkls :)


public class QuestionDoWhileLoop{
	
	public static void main(String [] args){
		
		int n = 2;
		int count = 1;
		int ans = 1;
		
		do {
	
			ans = ans + n;
			
							
		n++;
		
		} while(n < 6);
		
		System.out.println("This is the count of your DO While loop: " + ans);
		
		
		
	}
}

