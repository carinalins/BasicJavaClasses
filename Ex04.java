/* Supondo que a popula��o de um pa�s A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
popula��o de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Fa�a um programa que calcule e escreva o n�mero de anos
necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a
popula��o do pa�s B, mantidas as taxas de crescimento.

*/

//@carinalins


public class Ex04 {

	
	float populacaoA;
	float populacaoB;
	float anosNecessarios=0;
	
	public Ex04(float populacaoA, float populacaoB){
	
	this.populacaoA=populacaoA;
	this.populacaoB=populacaoB;
	}
	
	
	public void calcAnos(){
		
		while (populacaoA < populacaoB){
		
			populacaoA += (populacaoA / 100) * 3;
			populacaoB += (populacaoB / 100) * 1.5;
		
			anosNecessarios++;
			
			
		}
		
		System.out.println("Populacao A: " + populacaoA);
		System.out.println("Populacao B: " + populacaoB);
		System.out.println("Anos necessarios: " + anosNecessarios);
	}
		
}
