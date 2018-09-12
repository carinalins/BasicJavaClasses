public class StudentData {
	
	public static void main (String[] args){
	
		String[] names = {"Ann", "Barry", "Charlie"};
		String[] studentNumbers = {"001", "002", "003"};
		int[] yob = {1995,1996,1997};
		
		
		for(int i = 0; i<3; i++){
			
			System.out.println("Years: " + names[i]);
			System.out.println("Numbers: " + studentNumbers[i]);
			System.out.println("Year of Birth: " + yob[i]);
			System.out.println();
		}
		
	}
}