public class Employee{

	String name;
	String type;
	int staffID;
	static int lastStaffID = 0;
	double salary;

	public Employee(String nm, String tp, double s){
		name = nm;
		type = tp;
		salary = s;
		staffID = lastStaffID;


	}

	public void printName(){
		System.out.println("Name: " + name);
	}

	public void printID(){
		System.out.println("ID: " + staffID);
	}

	public void printRole(){
		System.out.println("Role: " + type);
	}

	public void printSalary(){
		System.out.println("Salary: " + salary);
	}

	public void changeRole(String role){
		type = role;
	}

	public void changeSalary(double s){
		salary = s;
	}

	

}