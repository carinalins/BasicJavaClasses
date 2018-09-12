public class DecreaseBalance{
	public static void main(String [] args){
		double balance = 1000.0;
		double amount = 12.38;
		int count = 0;
		while(balance > amount){
				balance -= amount;
				count++;
		}
			System.out.println("Final Balance: " + balance);
			System.out.println("Number of Times: " + count);
		
			
		
}
}