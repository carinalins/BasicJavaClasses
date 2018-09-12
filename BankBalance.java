//Keep printing out to the screen the bank balance while there re still funds in the account//
//each time take 10 from the account//
//use a do while not a usual while loop//
//inicial balance = 1000//

public class BankBalance{
	public static void main(String[] args){
		int balance = 1000;
		
		
		do{
			balance -= 10;
			System.out.println("Balance: " + balance);
				
		}while(balance>0);
		System.out.println("Final Balance: " + balance);
	}
}