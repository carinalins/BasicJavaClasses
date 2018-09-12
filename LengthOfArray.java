public class LengthOfArray {

	public static void main(String[] args){
		
		
		
		int maxSize1 = 20;
		int maxSize2 = 100;
		int maxSize3 = 45;
		
		int[] myArray = new int [maxSize1];
		String[] otherArray = new String[maxSize2];
		double[] yetAnotherArray = new double [maxSize3];
		
		System.out.println("My Array Length: " + myArray.length);
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
			
		}
	}
}