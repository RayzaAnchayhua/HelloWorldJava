package com.br.kge.pancadaok;

import java.util.Scanner;

public class PancadaoK {

    public static void main(String[] args) {
        
        //Entrada de dados
        Scanner teclado =  new Scanner(System.in);
        
        double dolar;
        double real;
        double cotacao;
        
        System.out.println("Insira o valor de dolares: ");
        dolar = teclado.nextDouble();
        System.out.println("Qual é a cotação do dolar hoje?: ");
        cotacao = teclado.nextDouble();
        
        //Processamento de dados
        real = cotacao*dolar;
        
        //Saida de dados
        System.out.println("Esta é a conversão dos dolares para reais: "+real);
        System.out.println("Fim do programa");
    }
}
