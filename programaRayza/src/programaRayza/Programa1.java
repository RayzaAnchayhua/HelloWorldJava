package programaRayza;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		
		//Entrada de dados
	
		Scanner teclado = new Scanner(System.in);
		double cel;
		double fah;
		
		System.out.println("Este programa converte Celsius em Fahrenheit!");
		System.out.println("Coloque um valor para ser Celsius: ");
		cel = teclado.nextDouble();
		
		//Interpretação de dados
		fah = (9* cel + 160)/5.0;
		
		
		//Saída de dados
		System.out.println("O resultado em Fahrenheit: " + fah );
	
	}
}
