package pancadao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entrada de dados
        double A;
        double B;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um valor para A: ");
        A = teclado.nextDouble();;
        System.out.println("Insira um valor para B: ");
        B = teclado.nextDouble();

        //Processamento de dados
        soma = A + B;
        subtracao = A - B;
        multiplicacao = A*B;
        divisao = A/B;

        //Saida de dados
        System.out.println("O resultado da soma é          : "+soma);
        System.out.println("O resultado da subtração é     : "+subtracao);
        System.out.println("O resultado da multiplicação é : "+multiplicacao);
        System.out.println("O resultado da divisão é       : "+divisao);
    }
}