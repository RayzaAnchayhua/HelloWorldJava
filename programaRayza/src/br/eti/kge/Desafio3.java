package br.eti.kge;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		// Entrada de Dados
		
		int numero = 0;
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		// Processamento
		while( true ) {
			
			System.out.print("digite um numero (-1 para sair): ");
			numero = teclado.nextInt();
			if (numero < 0) {
				break;
			}
			soma += numero;
			
		}
		// Saída de Dados
		System.out.println("Total dos numeros digitados: " + soma);

	}

}
