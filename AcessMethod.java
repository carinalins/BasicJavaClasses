 public class AcessMethod {

 	public static void main(String[] args) {

 		Robot robot1 = new Robot();
 		Robot robot2 = new Robot("Alfie");
 		Robot robot3 = new Robot("Charlie");

 		robot1.printName();
 		robot2.sayHi();
 		System.out.println(robot3.speed());
 		
 	}
 }
 /*
We created a number of instance variables and methods inside our robot class

It would be nice to use those somehow to make use of our shiny new robot

To access them we use the new objects that we have created, i.e. robot1, robot2 and robot3
*/