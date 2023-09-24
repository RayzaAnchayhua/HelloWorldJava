package programaRayza;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
		
		//Entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		double prestacao;
		double valor;
		double taxa;
		double tempo;
		
		System.out.println("Este programa calcula o valor de uma prestação em atraso");
		System.out.println("Insira o valor da prestação: ");
		valor = teclado.nextDouble();
		System.out.println("Insira o valor da taxa: ");
		taxa = teclado.nextDouble();
		System.out.println("Insira o valor do tempo: ");
		tempo = teclado.nextDouble();
		
		//Interpretação de dados
		prestacao = valor + ( valor * taxa/100)*tempo;
		
		//Saída de dados
		System.out.println("Este é o valor da prestação" + prestacao);
		
	}
}
