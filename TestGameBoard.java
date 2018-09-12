//build a game board tic tac toe using two dimensional arrays.
//
//@carinakkls (:
import java.util.Scanner;

public class TestGameBoard{
	
	public static void main (String[] args){
		
		
		int[][] array = new int[3][3];
		String imput3;
		
		Scanner scan = new Scanner(System.in);
			
		for (int count = 0; count<=9; count++){
			for(int x=0; x<3; x++){
				for(int y=0; y<3; y++){
				System.out.print("\t"+array[x][y]);
				
				}
			
			System.out.println();
			System.out.println("____________|_______|___________");
		
			}		
		
		System.out.println ("Primeiro jogador, entre com numeros entre 1 a 9 para saber a posicao do seu X ");
		int imput = scan.nextInt();
		
		if (imput == 7){
			array [0][0] = 1;
			
		} else if (imput == 8){
			array [0][1] = 1;
			
		} else if (imput == 9){
			array [0][2] = 1;
				
		} else if (imput == 4){
			array [1][0] = 1;
			
		} else if (imput == 5){
			array [1][1] = 1;
			
		} else if (imput == 6){
			array [1][2] = 1;
			
		} else if (imput == 1){
			array [2][0] = 1;
			
		} else if (imput == 2){
			array [2][1] = 1;
			
		} else if (imput == 3){
			array [2][2] = 1;
		} else {
			System.out.println("This is not a valid imput. Try again.");
		}
		
		System.out.println ("Segundo Jogador, entre com numeros entre 1 a 9 para saber a posicao do seu O ");
		int imput2 = scan.nextInt();
		
		if (imput2 == 7){
			array [0][0] = 3;
			
		} else if (imput2 == 8){
			array [0][1] = 3;
			
		} else if (imput2 == 9){
			array [0][2] = 3;
				
		} else if (imput2 == 4){
			array [1][0] = 3;
			
		} else if (imput2 == 5){
			array [1][1] = 3;
			
		} else if (imput2 == 6){
			array [1][2] = 3;
			
		} else if (imput2 == 1){
			array [2][0] = 3;
			
		} else if (imput2 == 2){
			array [2][1] = 3;
			
		} else if (imput2 == 3){
			array [2][2] = 3;
			
		//} else if(imput2 == 0){
			//System.out.println ("Voce quer parar de jogar? ");
			//imput3 = scan.next();
		}  else {
			System.out.println("This is not a valid imput. Try again.");
		}
		
		//if(imput3=="Nao"){
			//S//ystem.out.println ("Continue Jogando");
		
		//} else if (imput3=="Sim"){
			//System.out.println("Voce finalizou o jogo, comece novamente");
			//break;
			
		
		//}
		
		
		}
		
		
}
}