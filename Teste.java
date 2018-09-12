import java.util.*;

public class Teste{
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		for (int i=0;i<matrix.length ; i++) {

			for (int j=0;j<matrix[i].length ; j++) {
				System.out.print("Digite um elemento para a matrix: " + i + " " + j);				
			
			matrix[i][j] = scan.nextInt();
			}
		}

		/*for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++ ) {
				System.out.print("[" + matrix[i][j] + "]");
			}
		System.out.println(" ");			
		}*/
		
	}
}