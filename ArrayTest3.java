public class ArrayTest3 {
	
	public static void main (String[] args){
	
		//int[] years = new int[5];
		//int[] years = {2000,2001,2002,2003,2004};
		//years[3] = 2010;
		
		//System.out.println("Year: " +years[3]);
		
		//use the loop "for" to inicialize at 0 and count +1 until you get 100 numbers, which is going to be 99 in total. #
		int[] years = new int[100];
		
		for(int i = 0; i<100; i++){
			
			years[i] = 2000 + i;
			System.out.println("Years: " + years[i]);
		}
		
	}
}