// name,yob,colour
// behaviour: bark 

public class Dog {
	
		String name;
		int yob;
		String colour;
		
		public Dog(String name,int yob, String colour){
			this.name = name;
			this.yob = yob;
			this.colour = colour;
			
		}
		
		public void bark(){
			System.out.println(this.name + " says Woof!");
		
	
		}
	
}