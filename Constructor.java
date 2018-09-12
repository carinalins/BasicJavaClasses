 public class Constructor{

//there is no main method this is just a blueprint

 	String name;
 	int speed;
 	int width;
  	
  	public Constructor(){ //IMPORTANT: Your constructor should always have the same name as the class.
  		//It does not return anything, so no need to write void.
  		//You can have more than one constructor, depending on your situation
  		name = "Bob";
  		speed = 1;
  		width = 55;

  	}


} /*
When we make a new object from a class there are certain
setup steps that need to be taken

These steps need to be taken for every new object created
from the class

With our robot we should set his name, speed, width,
height and colour when we make a new one

We can get away without writing a constructor, and if we
do so, the Java compiler builds a default one
*/

