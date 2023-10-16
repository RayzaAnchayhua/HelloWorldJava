package br.eti.kge;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		// Entrada dados
		Scanner teclado = new Scanner(System.in);
		
		int qtdNumeros;		// nr repetições
		int numero;			// numeros inseridos
		int produto = 1;	// produtos numeros inseridos
		
		// Processamento
		System.out.print("Quantos numeros? : ");
		qtdNumeros = teclado.nextInt();
		
		for(int aux = 1; aux <= qtdNumeros; aux++) {
			System.out.print("digite nr posicao " + aux + ": ");
			numero = teclado.nextInt();
			if (numero == 0) {
				continue;
			}
			produto *= numero;
		}
		// Saída de Dados
		System.out.println("Resultado: " + produto);

	}

}
