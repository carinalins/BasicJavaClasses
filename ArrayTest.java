public class ArrayTest {
	
	public static void main (String[] args){
	
		String[] studentNumbers = new String[10];
		studentNumbers[0] = "123456";
		studentNumbers[1] = "234567";
		studentNumbers[2] = "345678";
		
		studentNumbers[4] = "567890";
		studentNumbers[5] = "678901";
		studentNumbers[6] = "789012";
		studentNumbers[7] = "890123";
		studentNumbers[8] = "901234";
		studentNumbers[9] = "012345";
		//we are able to put data in our array.
		//studentNumbers[10] = "087245" -> there is only 10 arrays in your string and it starts at 0, so 10 is outside of the range.
		
		String tempNumber = studentNumbers[5];
		System.out.println(tempNumber);
		
		//if you try to print an array that is not declared you will get a message saying "null". example: studentNumbers3.
		
		if(studentNumbers[3] == null){
			
			System.out.println("Nothing there");
			
		} else {
			System.out.println(studentNumbers[3]);
			
		}
		
		
		
		
		
		
		int[] years = new int[100];
	}
}