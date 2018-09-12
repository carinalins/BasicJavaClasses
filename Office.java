public class Office {
	
 public static void main(String[] args) {
 	
 	Employee e1 = new Employee("Mary", "Manager", 10000);
 	Employee e2 = new Employee("Bob", "Admin", 12000);

 	e1.printName();
 	e1.printID();
 	e1.printRole();
 	e1.printSalary();
 	e1.changeRole("Duty Manager");
 	e1.changeSalary(20000);
 	e1.printRole();
 	e1.printSalary();

 	e2.printName();
 	e2.printID();
 	e2.printRole();
 	e2.printSalary();
 	e2.changeRole("Administrator");
 	e2.changeSalary(120000000);
 	e2.printRole();
 	e2.printSalary();

 }
}