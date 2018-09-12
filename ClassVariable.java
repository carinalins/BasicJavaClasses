 public class ClassVariable{

//there is no main method this is just a blueprint
  	
  private static long lastSerialNo = 0;
  private final long serialNo = 0;

  	public ClassVariable (){
  		serialNo = lastSerialNo+1;

  	}


} /*
These are a little trickier to get your head around

Class variables are defined within the class and outside of
any method, similarly to the instance variables.

However, they are defined with the static keyword

What this does is create a variable that is used by the
class and not the specific instance of the class
*/

