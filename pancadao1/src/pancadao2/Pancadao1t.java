package pancadao2;

import java.util.Scanner;

public class Pancadao1t {
        public static void main(String[] args) {
            //Entrada de dados
            double velocidade;
            double distancia;
            double tempo;

            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o valor da distância: ");
            distancia = teclado.nextDouble();
            System.out.println("Digite o valor do tempo: ");
            tempo = teclado.nextDouble();

            //Processamento de dados
            velocidade = (distancia*1000)/(tempo*60);

            //Saida de dados
            System.out.println("A velocidade é: "+velocidade);
            System.out.println("Fim do programa");
        }
}
