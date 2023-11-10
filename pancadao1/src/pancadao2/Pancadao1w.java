package pancadao2;

import java.util.Scanner;

public class Pancadao1w {
    public static void main(String[] args) {
        //Entrada de dados
        double pe;
        double metros;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor em pés: ");
        pe = teclado.nextDouble();

        //Processamento de dados
        metros = (pe*30.48)/100;

        //Saida de dados
        System.out.println("O valor em metros é: "+metros);
        System.out.println("Fim do programa");


    }
}
