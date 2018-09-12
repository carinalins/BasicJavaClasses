public class BankPrintTransaction2{

	public static void main (String[] args){
	
	Transaction[] ts = new Transaction[5];
	
	ts[0] = new Transaction(1, "coat", "black", 20);
	ts[1] = new Transaction(2, "hat", "blue", 15);
	ts[4] = new Transaction(5, "gloves", "yellow", 5);
	
	for(Transaction a: ts){
		a.printTransaction();
		
	}
}
}