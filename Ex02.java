/*2. Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o
aceite a senha igual ao nome do usu�rio, mostrando uma mensagem
de erro e voltando a pedir as informa��es.*/


//@carinalins

import java.util.Scanner;

public class Ex02 {
	
	Scanner scan = new Scanner(System.in);
	String nomeUsuario;
	String senha;
	boolean infoValidas = false;
	
	
	public Ex02(){
	
	}
	
	public void verificandoSenha(){
		
		do{
			
			System.out.println("Entre com o nome do usuario: ");
			nomeUsuario = scan.next();
					
			
			System.out.println("Entre com a senha: ");
			senha = scan.next();
			
			if(nomeUsuario.equalsIgnoreCase(senha)){
				//infoValidas = false;
				System.out.println("Os dados nao podem ser iguais. tente novamente!");
			} else {
				infoValidas=true;
				System.out.println("Senha e usuario validos!");
			}
			
		} while(!infoValidas);
			
				
		
		
	}
}