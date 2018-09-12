/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
*/

//@carinalins

import java.util.Scanner;

public class Ex01 {
	
	Scanner scan = new Scanner(System.in);
	int nota;
	boolean notaValida;
	
	
	public Ex01(boolean notaValida){
		this.notaValida=notaValida;
		
	}
	
	
	public void notaValida(){
		
		
		
		do {
			
			System.out.println("Entre com uma nota entre 0-10: ");
			nota = scan.nextInt();
	
		
			if (nota>=0 && nota<=10){
				notaValida=true;
				System.out.println("Sua nota e: " + nota);
				} else {
					System.out.println("Nota invalida, Por favor, digite um valor valido entre 0-10. ");
				}
					
			
		} while (!notaValida);
		
		
		
		
		}

}
