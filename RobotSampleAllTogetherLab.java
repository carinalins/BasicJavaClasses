
//main class

public class RobotSampleAllTogetherLab {
	
	//main mathod
	public static void main(String[] args) {
		
		//declaring  || creating/instantiating a new object (new) || initialising by calling the constructor()
		RobotSampleAllTogether robot1 = new RobotSampleAllTogether();
		RobotSampleAllTogether robot2 = new RobotSampleAllTogether("Daryl", 1);


		//use the new object (robot1) and call the methods of the blueprint
		robot1.printSerialNo();
		robot2.printSerialNo();

		robot1.printName();
		robot2.printName();

		robot1.setName("Miranda");
		robot1.printName();




	}
}