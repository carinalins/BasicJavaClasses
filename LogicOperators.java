public class LogicOperators{
	public static void main(String [] args){
		int a = 10;
		int b = 20;
		a+=b;
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		
		//-=
		System.out.println("a-=b : " + (a-=b));		
		// *=
		System.out.println("a *= b : " + (a*=b));
		// /=
		System.out.println("a /= b : " + (a/=b));
		// %=
		System.out.println("a %= b : " + (a%=b));
		
	}
}
