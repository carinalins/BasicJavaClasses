public class AssignmentOperators {

	/*c = a+b
	a+=b - this means do the sum and put the answer in a
	
	a-=b
	a*=b
	a/=b
	a%=b
	*/

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;

		a+=20;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		b-=a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		a*=2;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		b/=5;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		a%=5;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}


	

}