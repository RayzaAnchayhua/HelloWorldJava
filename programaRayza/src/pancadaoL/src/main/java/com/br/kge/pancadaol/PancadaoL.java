package com.br.kge.pancadaol;

import java.util.Scanner;

public class PancadaoL {

    public static void main(String[] args) {
        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        double reais;
        double dolares;
        double cotacao;
        
        System.out.println("Informe o valor de reais: ");
        reais = teclado.nextDouble();
        System.out.println("Informe a cotacao de hoje: ");
        cotacao = teclado.nextDouble();
        
        //Processamento de dados
        dolares = reais*cotacao;
        
        //Saida de dados
        System.out.println("Esta é a conversao para dolares: "+dolares);
        System.out.println("Fim do programa");
        
    }
}
