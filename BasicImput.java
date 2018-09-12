import java.util.Scanner;

public class BasicImput{
	public static void main(String[] args){
		int[] myInts = new int[10];
		Scanner sc = new Scanner (System.in);
		 
		for(int i=0;i<10;i++){
			System.out.println("Give me a int: ");
			myInts[i] = sc.nextInt();
		}
		for (int i=0; i<myInts.length; i++){
			System.out.println("Values: " +myInts[i]);
			
			
		}
	}
		
		
		//sc.next();
		//nextInt();
		//nextDouble();
		
}