public class SalesPerson {
	
	String name;
	int age;
	String yearOfBirth;
	final int employeeNumber;
	static int lastEmployeeNumber;
	int employeeLevel;
	double salary;
	int qtSales;
	double valueSale;
	double totalSold;


	public SalesPerson(String nm, int a, String yob, double sl){
		this.name = nm;
		this.age = a;
		this.yearOfBirth = yob;
		this.employeeNumber = ++lastEmployeeNumber;
		this.employeeLevel = 1;
		this.salary = sl;
		this.qtSales=0;
		this.valueSale = valueSale;
		this.totalSold = valueSale + valueSale;
	}

	public void definingLevel(){

		if (qtSales==0) {
			employeeLevel=1;
			System.out.println("level 1");
			
		} else if (qtSales>=5 && valueSale>=200) {
			employeeLevel=2;
			
		} else if (qtSales>=6 && valueSale>=300) {
			employeeLevel=3;
			
		} else if (qtSales>=2 && valueSale>=1000) {
			employeeLevel=4;
	
		} else if (qtSales>=2 && valueSale>=2500) {
			employeeLevel=5;
			
		} else if (totalSold>=20000) {
			employeeLevel=6;			
		}

	}


}