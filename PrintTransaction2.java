public class PrintTransaction2{
	
	
	
	String name="";
	int id=0;
	String description="";
	double amount=0.0;
	
	public Transaction(int ID, String Name, String Description, double Amount){
		ID = id;
		this.Name = name;
		this.Description = description;
		this.Amount = amount;
		
	}
	public void printTransaction(){
		
		
		System.out.println("Name: " + name);
		System.out.println("ID " + id );
		System.out.println("Description: " + description);
		System.out.println("Amount: " + amount);
	}
	
}
	