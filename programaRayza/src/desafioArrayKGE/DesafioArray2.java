package desafioArrayKGE;

import java.util.Scanner;

public class DesafioArray2 {

	public static void main(String[] args) {
		// Declara��es
		int[] mA = new int[5];
		int[] mB = new int[mA.length];
		Scanner teclado = new Scanner(System.in);
		
		// entrada mA
		int iA = 0;
		while (iA < mA.length) {
			System.out.println("Informe elemento " + iA + " da matriz A: ");
			mA[iA] = teclado.nextInt();
			iA++;
		}


	}

}
