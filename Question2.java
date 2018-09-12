
//sum up digits

//@carinakkls :)


public class Question2{
	
	public static void main(String[] args){
		
		int i = 346732468;
		int ans = 0;
		int soma = 0;
		
		do {
	
		ans =  i % 10;
		i = i / 10; 
		soma = soma + ans;
		
		
		System.out.println("The remainder is: " + ans);		
		
		} while ( i > 1 );
		
		System.out.println(" The final answer is: " + soma);
		
		
		
		
	}
}