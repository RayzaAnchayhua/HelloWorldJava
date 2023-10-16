/*Este é uma copia do programa5, mas como o exercicio do pdf PANCADAO não pedia um tempo exato estou tentando colocar nesse programa6 tempo exato de anos ou meses*/

package programaRayza;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		
		//Entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		double prestacao;
		double valor;
		double taxa = 7.9 ;
		int tempo ;
		
		System.out.println("Este programa calcula o valor de uma prestação em atraso");
		System.out.println("Insira o valor da prestação: ");
		valor = teclado.nextDouble();
		System.out.println("Insira o valor do tempo em meses: ");
		tempo = teclado.nextInt();
		
		//Interpretação de dados
		prestacao = valor + ( valor * taxa/100)*tempo;
		
		//Saída de dados
		System.out.println("Este é o valor da prestação" + prestacao);
		
	}
}
