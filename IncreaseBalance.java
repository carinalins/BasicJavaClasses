public class IncreaseBalance{
	public static void main(String [] args){
		double balance = 0.0;
		double amount = 3.26;
		double max = 832.18;
		int count = 0;
		while(balance <= (max - amount)){
				balance += amount;
				count++;
		}
			System.out.println("Final Balance: " + balance);
			System.out.println("Number of Times: " + count);
		
			
		
}
}