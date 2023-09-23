/* Efetuar o cálculo de quantidade de litros de combustível gasta em uma
viagem utilizando um automóvel que faz 12 quilômetros por litro. Para
obter o cálculo, o usuário deve fornecer o tempo gasto (variável TEMPO)
e a velocidade média (variável VELOCIDADE) durante a viagem. Desta
forma, será possível obter a distância percorrida com a formula
DISTANCIA  TEMPO * VELOCIDADE. A partir do valor da distância,
basta calcular a quantidade de litros de combustível utilizada na viagem
com a formula LITROS_USADOS  DISTANCIA /12. O programa deve
apresentar os valores da velocidade média, tempo gasto na viagem, a
distância percorrida e a quantidade de litros utilizada na viajem.
*/

package programaRayza;

import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		
		//Entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		double tempo;
		double velocidade_media;
		double distancia;
		double litros_usados;
		
		System.out.println("Este programa calcula a quantidade de litros de combustível gasto por um automovel que faz 12 km/L");
		System.out.println("Forneça o tempo gasto: ");
		tempo = teclado.nextDouble();
		System.out.println("Forneça a velocidade gasta: ");
		velocidade_media = teclado.nextDouble();
		
		//Interpretação de dados
		distancia = tempo * velocidade_media;
		litros_usados = distancia/12;
		velocidade_media = distancia / tempo;
		
		//Saída de dados
		System.out.println("Portanto, ao concluir vemos que a quantidade de litros de combustivel gasto é: " + litros_usados);
		System.out.println("Além disso a distância percorrida foi de: " + distancia);
		System.out.println("E a velocidade média de: " + velocidade_media);
	}
}
