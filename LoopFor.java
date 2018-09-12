public class LoopFor{
	
	public static void main(String [] args){
	
	
	for (int i=0; i<5; i++){
		System.out.println("i tem valor de: " + i);
	}
	
	//System.out.println(i);
	
	for (int i=5; i>0; i--){
		System.out.println("i tem valor: " + i);
	}
	
	for (int i=0, j=10; i<=j ; i++, j--){
		System.out.println("i = " + i + "j = " + j);
		
	}
	
	int count = 0;
	for ( ;count <10 ; ){
		System.out.println("valor de count: " + count);
		count +=2;
	} // mesma coisa que for (int count=0; count<10;count+=2)
		
	int soma = 0;
	for (int i=1; i<5; soma += i++); //for (inicialização; condição; incremento) 
		System.out.println("a soma e igual a: " + soma);
	 // o loop vai somar de 1 a 5 e totalizar a soma dos numeros um por um. resultado neste caso e 10.
	 // a diferenca e que aqui o loop foi finalizado com ponto e virgula e as vezes pode ser aberto com chaves.
	 
	}
}