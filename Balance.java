public class IncreaseBalance{
	public static void main(String [] args){
		double balance = 0.0;
		double amount = 3.26;
		int count = 0;
		while(balance > amount){
				balance -= amount;
				count++;
		}
			System.out.println("Final Balance: " + balance);
			System.out.println("Number of Times: " + count);
		
			
		
}
}