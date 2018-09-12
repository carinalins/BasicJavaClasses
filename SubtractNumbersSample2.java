public class SubtractNumbersSample2{
	
	public static void main(String[] args) {
		
		short a = 62;
		short b = 13;
		float d = 86.2f;
		float e = 100.6f;

		short c = (short) (a-b); //need to cast to short
		System.out.println("Short: " + c);
		System.out.println("Float" + (d-e));
	}

}