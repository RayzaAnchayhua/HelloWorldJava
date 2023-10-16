package desafioArrayKGE;

import java.util.Scanner;

/*
 * Elabore um programa que solicite do usu�rio 5 n�meros inteiros e armazene-os em uma matriz de nome mA.
Voc� deve inverter os elementos da mA e armazen�-lo na matriz mB.
Al�m disso, voc� deve identificar o maior e o menor n�mero digitado.
Dicas:
-Fa�a primeiro a estrutura de repeti��o e armazenamento de mA.
Exiba mA
-Em segundo elabore uma nova estrutura de repeti��o para inverter a matriz e armazenar em mB. Exiba mB
-Por ultimo, crie mecanismos para identificar o menor e o maior n�mero digitado. Inclua o mecanismo dentro da primeira estrutura de repeti��o.
 */
public class DesafioArray1 {

	public static void main(String[] args) {
		// Declara��es
		int[] mA = new int[5];
		int[] mB = new int[mA.length];
		Scanner teclado = new Scanner(System.in);
		
		int numMax = 0;
		int numMin = 0;
		
		// entrada mA
		for (int iA = 0; iA < mA.length; iA++) {
			System.out.println("Informe elemento " + iA + " da matriz A: ");
			mA[iA] = teclado.nextInt();
			
			if (iA == 0) {
				numMax = mA[iA];
				numMin = mA[iA];
			}
			
			if (mA[iA] > numMax) {
				numMax = mA[iA];
			}
			if (mA[iA] < numMin) {
				numMin = mA[iA];
			}
			
		}
		// Exibir maior e menor
		System.out.println("Maior numero: " + numMax);
		System.out.println("Menor numero: " + numMin);
		System.out.println("");
		
		// exibir mA
		System.out.println("Matriz A:");
		for ( int numero : mA ) {
			System.out.println("Nr: " + numero);
		}
		
		// Inverter mA em mB
		for (int iA = 0; iA < mA.length; iA++) {
			int iB = (mA.length -1) - iA;
			mB[iB] = mA[iA];
		}
		
		// Exibir mB
		System.out.println("Matriz B:");
		for ( int numero : mB ) {
			System.out.println("Nr: " + numero);
		}
	}
	
}
