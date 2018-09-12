public class BankSample {
	
	public static void main(String[] args) {
		
		BankAccountSample ac1 = new BankAccountSample("Carina", 200);

		ac1.showBalance();
		ac1.showSortCode();
		ac1.showAccountNumber();
		ac1.credit(100);
		ac1.debit(50);
		ac1.showBalance();
	}
}