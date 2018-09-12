/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
*/

//@carinalins

import java.util.Scanner;


public class Ex03 {

	
	Scanner scan = new Scanner(System.in);
	
	String nome;
	int idade;
	double salario;
	String sexo;
	String estadoCivil;
	
	boolean nomeValido=false;
	boolean idadeValida=false;
	boolean salarioValido=false;
	boolean sexoValido=false;
	boolean estadoCivilValido=false;
	
	
	
	
	public Ex03(){
		
	}
	
	public void informacoesValidas(){
		
		
		
		do{
			
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			
			if (nome.length() >= 3 ){
		
			nomeValido=true;
			System.out.println("Nome valido!");
			
			
		} else {
			nomeValido=false;
			System.out.println("Nome invalido. Digite mais de 3 caracteres. tente novamente.");
		}
		} while (!nomeValido);
		
		do {
			System.out.println("Entre com a idade: ");
			idade = scan.nextInt();
		
		if (idade>=0 && idade<=150){
			idadeValida=true;
			System.out.println("Idade valida! ");
			
		} else{
			idadeValida=false;
			System.out.println("Idade invalida. tente novamente.");
		}
		} while (!idadeValida);
		
		do{
			System.out.println("Entre com o salario: ");
			salario = scan.nextDouble();
		
		if (salario>0){
			salarioValido=true;
			System.out.println("Salario Valido!");
			
		} else {
			salarioValido=false;
			System.out.println("Salario invalido. tente novamente! ");
		}
		} while (!salarioValido);
		
		do {
			
			System.out.println("Entre com o sexo F ou M : ");
			sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
			sexoValido=true;
			System.out.println("Sexo valido! ");
		} else{
			sexoValido=false;
			System.out.println("Sexo invalido. tente novamete! ");
		}
		}while(!sexoValido);
		
		do{
			System.out.println("Entre com o estado civil 's', 'c', 'v', 'd': ");
			estadoCivil = scan.next();
		
		if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
			estadoCivilValido=true;
			System.out.println("Estado civil valido!");
		} else {
			estadoCivilValido=false;
			System.out.println("Estado civil invalido. tente novamente!");
		}
		} while (!estadoCivilValido);
		
	}
}
