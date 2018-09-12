

/*isso e um OBJETO ou blue print, onte tem os ATRIBUTOS com as caracteristicas do cachorro por exemplo, ou as caracteristicas da casa por exemplo,
esses atributos sao INSTANCIAS da classe principal, que pode ser cachorro, casa, calculadora...
podem existir varias instancias, ou seja, varios cachorros, varias casas, varias calculadoras...dentro da mesma classe
tambem podem existir comportamentos, ou METODOS para essa classe. Por exemplo: latir, passear, comer, dormir, treinar...calcular!! Geralmente, metodos sao acoes que temos na nossa classe.
os metodos e como se fosse botoes do seu computador. uma acao, uma entrada para o programa.
o metodo main e o metodo principal para rodar o seu programa.
HERANCA - permite que voce utilize a estrutura e o comportamento de uma classe. EX: classe animal poderiamos ter o nome do animal, mamifero (mama, tem felino e canino, subclasses), reptil (poe ovos);
POLIMOFIRSMO - habilidade de ter mais de um tipo. EX: comportamentos que os animais tem em comum. todos os animais emitem som.
dependendo do animal da subclasse animal, os sons sao diferentes, gato-mia, cachorro-late. o valor vai ser diferente dependendo do animal.
pacotes - forma de organizar classes. como se fosse uma pasta. EX string///APIs - conjunto de bibliotecas para leitura e escrita de arquivos. */


public class Calc{
	
	//Atributos (variaveis)
	//double area;
	double ladoQuadrado;



	//Construtor

	public Calc(){


	}



	//Metodo (Tipo um botao)
	public void calcLateralQuadrado(){

		double area = this.ladoQuadrado*this.ladoQuadrado;

		System.out.println("A area do quadrado e: " + area);
		System.out.println("O dobro da area do quadrado e: " + (area*2));

	}



}
