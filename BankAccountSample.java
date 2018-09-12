/*A bank account:
I has: account number, client name, sort code, balance
I behaviours: show account number (not a great idea),
show client name, show sort code, show balance, add to
balance, deduct from balance
*/


public class BankAccountSample {
	
	public static int lastAccountNumber = 0;
	public final int accountNumber;
	public String clientName;
	public String sortCode;
	public double balance;

	public BankAccountSample (String cn, double bal){
		accountNumber = lastAccountNumber + 1;
		clientName =cn;
		sortCode = "90-12-12";
		balance = bal;
	}

	public void showAccountNumber(){
		System.out.println(accountNumber);
	}

	public void showClientName(){
		System.out.println(clientName);
	}

	public void showSortCode(){
		System.out.println(sortCode);
	}

	public void showBalance(){
		System.out.println(balance);
	}

	public void credit(double amt){
		balance = balance + amt;
		
	}

	public void debit(double amt){
		balance = balance - amt;
		
	}
}