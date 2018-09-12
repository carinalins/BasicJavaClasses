
//blueprint
public class RobotSampleAllTogether {
	
	//instance variables public and private
	public String name;
	public double speed;
	private static long lastSerialNo = 0;
	private final long serialNo;

	// first constructor
	public RobotSampleAllTogether(){
		serialNo = lastSerialNo + 1;
		name = "Bob";
		speed = 0;
	}

	// second contructor
	public RobotSampleAllTogether(String nm, double sp){
		serialNo = lastSerialNo + 1;
		name = nm;
		speed = sp;
	}

	// first method that will return something
	public void sayHi(){
		//local variable
		String hi = "Why hello there";
		System.out.println(hi);
	}

	// second method that will return something
	public void printSerialNo(){
		System.out.println(serialNo);
	}

	// third method that will return something
	public void printName(){
		System.out.println(name);
	}

	// fourth method that will return something
	public void setName(String nm){
		name = nm;

	}


}