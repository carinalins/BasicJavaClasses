//create a For loop and calculate the answer 1+2+3+4+5

//@carinakkls :)


public class QuestionWhileLoop{
	
	public static void main(String [] args){
		
		int n = 5;
		int count = 1;
		int ans = 0;
		
		while(count <= n){
			ans = ans + count;
		
		System.out.println("This is the count of your while loop: " + count);
		
		
		count++;
		}
		
		System.out.println("The answer is: " + ans);
		
	}
}
	
