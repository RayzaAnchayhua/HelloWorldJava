package programaRayza;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		
		//Entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		double cel;
		double fah;
		
		System.out.println("Este programa converte Fahrenheit em Celsius");
		System.out.println("Coloque um valor para Fahrenheit: ");
		fah = teclado.nextDouble();
		
		//Interpretação de dados
		cel = ((fah - 32)*5 ) / 9.0 ;
		
		//Saída de dados
		System.out.println("O resultado em Celsius: " + cel);
	
	}
}
