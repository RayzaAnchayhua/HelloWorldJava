package programaRayza;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		
		//Entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		double volume;
		double raio;
		double altura;
		double pi = 3.14159;
		
		System.out.println("Este programa calcula o volume de uma lata de óleo ");
		System.out.println("Digite o valor para o raio:");
		raio = teclado.nextDouble();
		System.out.println("Digite agora o valor para a altura:");
		altura = teclado.nextDouble();
		
		//Interpretação de dados
		volume = pi*(raio * raio) * altura;
		
		//Saída de dados
		System.out.println("Este é o resultado: " + volume );
	
	}
}
