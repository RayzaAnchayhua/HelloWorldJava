package desafioArrayKGE;

import java.util.Scanner;

public class DesafioArray3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Iniciar solicitando o nome dos alunos. 
		// Armazenar os nomes na matriz mAlunos[] do tipo String.
		String[] mAlunos = new String[3];
		double[][] mNotas = new double[3][3];
		double[] mMedias = new double[3];
		
		for(int i = 0; i < mAlunos.length; i++) {
			
			System.out.print("Aluno: " + i);
			System.out.print("\tNome : ");
			mAlunos[i] = teclado.nextLine();
			
			System.out.println("Notas:");
			
			double media = 0;
			for(int j = 0; j < mNotas[0].length; j++) {
				System.out.print("Nota "+ j + ": ");
				mNotas[i][j] = teclado.nextDouble();
				media = media + mNotas[i][j];
			}
			media = media / mNotas[0].length;
			mMedias[i] = media;
			teclado.nextLine();
		}
		
		System.out.println("Aluno\t\tN1\tN2\tN3\tMedia");
		for(int i = 0; i < mAlunos.length; i++) {
			System.out.print(mAlunos[i] + "\t");
			
			for(int j = 0; j < mNotas[0].length; j++) {
				System.out.print("\t" + mNotas[i][j]);
			}
			System.out.println("\t" + mMedias[i]);
		}
				
		
		
	}

}
