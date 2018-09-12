/*Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.*/


//@carinalins
import java.util.Scanner;


public class Ex05 {

	public static void main(String[] args){
	
		
		Scanner scan = new Scanner(System.in);
		
		
		boolean valida=false;
		String simOuNao;
		
		
		float populacaoA;
		float populacaoB;
		float taxaCrescimentoA;
		float taxaCrescimentoB;		
		
		do{
						
		System.out.println("Informe a quantidade de habitantes da primeira populacao: ");
		populacaoA = scan.nextFloat();
		
			if (populacaoA>0){
			valida=true;
			} else{
				System.out.println("A populacao precisa ser maior que 0.");
			}
		} while(!valida);
		
		valida=false;
		
		do{ 
			System.out.println("Informe a quantidade de habitantes da populacao B: ");
			populacaoB = scan.nextFloat();
			
			if (populacaoB>0){
				valida=true;
			}  else {
				System.out.println("A populacao precisa ser maior que 0.");
			}
			
		} while (!valida);
		
		
		valida=false;
		
		do{ 
			System.out.println("Informe a taxa de crescimento da populacao A: ");
			taxaCrescimentoA = scan.nextFloat();
			
			if (taxaCrescimentoA>0){
				valida=true;
			}  else {
				System.out.println("A taxa de crescimento da populacao A precisa ser maior que 0.");
			}
			
		} while (!valida);
		
		valida=false;
		
		do{ 
			System.out.println("Informe a taxa de crescimento da populacao B: ");
			taxaCrescimentoB = scan.nextFloat();
			
			if (taxaCrescimentoB>0){
				valida=true;
			}  else {
				System.out.println("A taxa de crescimento da populacao B precisa ser maior que 0.");
			}
			
		} while (!valida);
		
		
		float anosNecessarios=0;	
			
		while (populacaoA < populacaoB){
		
			populacaoA += (populacaoA/100)*taxaCrescimentoA;
			populacaoB += (populacaoB/100)*taxaCrescimentoB;
		
			anosNecessarios++;
			
			
		}
		
		System.out.println("Populacao A: " + populacaoA);
		System.out.println("Populacao B: " + populacaoB);
		System.out.println("Anos necessarios: " + anosNecessarios);
		
		
		
	}
}
		/*System.out.println("Deseja repetir a operacao? S/N ");
		simOuNao = scan.next();
		
		}
		
		if(simOuNao.equalsIgnoreCase("s")){
			repetirOperacao=true;
		} else if (simOuNao.equalsIgnoreCase("n")){
			repetirOperacao=false;
		} else {
			System.out.println("Informacao nao valida. Programa finalizado!");
			repetirOperacao=false;
		}
		
	}	
}
*/