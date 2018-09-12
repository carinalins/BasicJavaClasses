
public class Incrementing {
	public static void main(String[] args) {
		int a = 0;
		// we still print out a, after it is printed it increments
		System.out.println(a++);
		// see that it got incremented last time
		System.out.println(a);
		
		int b = a;
		// b has a reference to a so it prints out the same value
		System.out.println("b " + b);
		// increment a
		a++;
		// a increases
		System.out.println("a " + a);
		// b does not
		System.out.println("b " + b);
		
		// we assign a to c, this happens before a gets bigger
		int c = a++;
		// we see that a got bigger
		System.out.println("a " + a);
		// c is still the same value it was before a got bigger
		System.out.println("c " + c);
		// prints out before c gets bigger
		System.out.println("c " + c++);
		// c got bigger last time, now we see it
		System.out.println("c " + c);
	}
}
