package pancadao2;

import java.util.Scanner;

public class Pancadao1u {
    public static void main(String[] args) {
        double volume;
        double raio;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor para o raio: ");
        raio = teclado.nextDouble();

        //Processamento de dados
        volume = (4/3)*Math.PI*Math.pow(raio,3);

        //Saida de dados
        System.out.println("O volume dessa esfera é de: "+volume);
        System.out.println(Math.PI);
        System.out.println("Fim do programa ");
    }
}
